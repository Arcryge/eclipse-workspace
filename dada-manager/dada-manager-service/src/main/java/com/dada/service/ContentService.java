/**
 * @author Arcry
 * @date 2019年5月20日
 * @time 下午2:48:45
 */
package com.dada.service;

import com.dada.common.pojo.DadaResult;
import com.dada.common.pojo.EUDataGridResult;
import com.dada.pojo.TbContent;

public interface ContentService {

	DadaResult insertContent(TbContent content);

	TbContent getContentById(long contentId);

	EUDataGridResult getContentList(int page, int rows);
}
