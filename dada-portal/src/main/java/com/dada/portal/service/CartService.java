/**
 * @author Arcry
 * @date 2019年5月28日
 * @time 下午2:12:19
 */
package com.dada.portal.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dada.common.pojo.DadaResult;
import com.dada.portal.pojo.CartItem;

public interface CartService {

	DadaResult addCartItem(long itemId, int num, HttpServletRequest request, HttpServletResponse response);

	List<CartItem> getCartItemList(HttpServletRequest request, HttpServletResponse response);

	DadaResult deleteCartItem(long itemId, HttpServletRequest request, HttpServletResponse response);
}
