/**
 * @author Arcry
 * @date 2019年5月20日
 * @time 下午2:50:00
 */
package com.dada.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.dada.common.pojo.DadaResult;
import com.dada.common.pojo.EUDataGridResult;
import com.dada.common.utils.HttpClientUtil;
import com.dada.mapper.TbContentMapper;
import com.dada.pojo.TbContent;
import com.dada.pojo.TbContentExample;
import com.dada.pojo.TbContentExample.Criteria;
import com.dada.service.ContentService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

/**
 * 内容管理
 *  
 * @author Arcry
 * @version 0.1
 * @date 2019年5月20日 下午2:50:07
 */
@Service
public class ContentServiceImpl implements ContentService {

	@Autowired
	private TbContentMapper contentMapper;

	@Value("${REST_BASE_URL}")
	private String REST_BASE_URL;

	@Value("${REST_CONTENT_SYNC_URL}")
	private String REST_CONTENT_SYNC_URL;

	@Override
	public DadaResult insertContent(TbContent content) {
		//补全pojo内容
		content.setCreated(new Date());
		content.setUpdated(new Date());
		contentMapper.insert(content);

		//添加缓存 同步逻辑
		try {
			HttpClientUtil.doGet(REST_BASE_URL + REST_CONTENT_SYNC_URL + content.getCategoryId());
		} catch (Exception e) {
			e.printStackTrace();
		}

		return DadaResult.ok();
	}

	@Override
	public TbContent getContentById(long contentId) {
		//TbContent content = contentMapper.selectByPrimaryKey(contentId);
		//添加查询条件
		TbContentExample example = new TbContentExample();
		Criteria criteria = example.createCriteria();
		criteria.andIdEqualTo(contentId);
		List<TbContent> list = contentMapper.selectByExample(example);
		if (list != null && list.size() > 0) {
			TbContent item = list.get(0);
			return item;
		}
		return null;
	}

	@Override
	public EUDataGridResult getContentList(int page, int rows) {
		//查询商品列表
		TbContentExample example = new TbContentExample();
		//分页处理
		PageHelper.startPage(page, rows);
		List<TbContent> list = contentMapper.selectByExample(example);
		//创建一个返回值对象
		EUDataGridResult result = new EUDataGridResult();
		result.setRows(list);
		//取记录总条数
		PageInfo<TbContent> pageInfo = new PageInfo<>(list);
		result.setTotal(pageInfo.getTotal());
		return result;
	}

}
