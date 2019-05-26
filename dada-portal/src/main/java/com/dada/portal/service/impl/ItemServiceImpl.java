/**
 * @author Arcry
 * @date 2019年5月26日
 * @time 下午9:38:45
 */
package com.dada.portal.service.impl;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.dada.common.pojo.DadaResult;
import com.dada.common.utils.HttpClientUtil;
import com.dada.portal.pojo.ItemInfo;
import com.dada.portal.service.ItemService;

/**
 * 商品信息管理Service
 *  
 * @author Arcry
 * @version 0.1
 * @date 2019年5月26日 下午9:38:58
 */
@Service
public class ItemServiceImpl implements ItemService {

	@Value("${REST_BASE_URL}")
	private String REST_BASE_URL;
	@Value("${ITME_INFO_URL}")
	private String ITME_INFO_URL;

	@Override
	public ItemInfo getItemById(Long itemId) {

		try {
			//调用rest的服务查询商品基本信息
			String json = HttpClientUtil.doGet(REST_BASE_URL + ITME_INFO_URL + itemId);
			if (!StringUtils.isBlank(json)) {
				DadaResult dadaResult = DadaResult.formatToPojo(json, ItemInfo.class);
				if (dadaResult.getStatus() == 200) {
					ItemInfo item = (ItemInfo) dadaResult.getData();
					return item;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}

}

