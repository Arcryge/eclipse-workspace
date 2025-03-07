/**
 * @author Arcry
 * @date 2019年5月26日
 * @time 下午6:08:54
 */
package com.dada.rest.service;

import com.dada.common.pojo.DadaResult;

public interface ItemService {

	DadaResult getItemBaseInfo(long itemId);

	DadaResult getItemDesc(long itemId);

	DadaResult getItemParam(long itemId);
}
