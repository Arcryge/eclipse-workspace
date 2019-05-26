/**
 * @author Arcry
 * @date 2019年5月26日
 * @time 下午9:46:59
 */
package com.dada.portal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dada.portal.pojo.ItemInfo;
import com.dada.portal.service.ItemService;

/**
 * 商品详情页面展示
 *  
 * @author Arcry
 * @version 0.1
 * @date 2019年5月26日 下午9:47:38
 */
@Controller
public class ItemController {

	@Autowired
	private ItemService itemService;

	@RequestMapping("/item/{itemId}")
	public String showItem(@PathVariable Long itemId, Model model) {
		ItemInfo item = itemService.getItemById(itemId);
		model.addAttribute("item", item);

		return "item";
	}
}
