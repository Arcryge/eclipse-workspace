/**
 * @author Arcry
 * @date 2019年5月29日
 * @time 上午9:00:28
 */
package com.dada.order.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dada.common.pojo.DadaResult;
import com.dada.common.utils.ExceptionUtil;
import com.dada.order.pojo.Order;
import com.dada.order.service.OrderService;

/**
 * 订单Controller
 *  
 * @author Arcry
 * @version 0.1
 * @date 2019年5月29日 上午9:01:39
 */
@Controller
public class OrderController {

	@Autowired
	private OrderService orderService;

	@RequestMapping(value = "/create", method = RequestMethod.POST)
	@ResponseBody
	public DadaResult createOrder(@RequestBody Order order) {
		try {
			DadaResult result = orderService.createOrder(order, order.getOrderItems(), order.getOrderShipping());
			return result;
		} catch (Exception e) {
			e.printStackTrace();
			return DadaResult.build(500, ExceptionUtil.getStackTrace(e));
		}
	}
}
