/**
 * @author Arcry
 * @date 2019年5月18日
 * @time 下午10:43:53
 */
package com.dada.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dada.common.pojo.DadaResult;
import com.dada.common.pojo.EUDataGridResult;
import com.dada.mapper.TbItemParamExtendMapper;
import com.dada.mapper.TbItemParamMapper;
import com.dada.pojo.TbItemParam;
import com.dada.pojo.TbItemParamExample;
import com.dada.pojo.TbItemParamExample.Criteria;
import com.dada.pojo.TbItemParamExtend;
import com.dada.service.ItemParamService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

/**
 * 商品规格参数模板管理
 *  
 * @author Arcry
 * @version 0.1
 * @date 2019年5月18日 下午10:44:20
 */
@Service
public class ItemParamServiceImpl implements ItemParamService {
	@Autowired
	private TbItemParamMapper itemParamMapper;

	@Autowired
	private TbItemParamExtendMapper itemParamExtendMapper;

	@Override
	public DadaResult getItemParamByCid(long cid) {
		TbItemParamExample example = new TbItemParamExample();
		Criteria criteria = example.createCriteria();
		criteria.andItemCatIdEqualTo(cid);
		List<TbItemParam> list = itemParamMapper.selectByExampleWithBLOBs(example);
		//判断是否查询到结果
		if (list != null && list.size() > 0) {
			return DadaResult.ok(list.get(0));
		}
		return DadaResult.ok();
	}

	@Override
	public DadaResult insertItemParam(TbItemParam itemParam) {
		//补全pojo
		itemParam.setCreated(new Date());
		itemParam.setUpdated(new Date());
		//插入到规格参数模板表
		itemParamMapper.insert(itemParam);
		return DadaResult.ok();
	}

	/**
	 *  商品规格参数模板服务层接口实现
	 * @desc
	 * @author Arcry
	 * @param page
	 * @param rows
	 * @return
	 * @time 2019年5月31日 上午12:19:05
	 */
	@Override
	public EUDataGridResult getItemParamList(int page, int rows) {

		//设置分页信息
		PageHelper.startPage(page, rows);
		//执行查询
		List<TbItemParamExtend> list = itemParamExtendMapper.selectItemParamExtendList();
		//转化格式
		PageInfo<TbItemParamExtend> pageInfo = new PageInfo<>(list);
		EUDataGridResult result = new EUDataGridResult();
		result.setRows(list);
		result.setTotal(pageInfo.getTotal());
		//返回结果
		return result;

	}

	@Override
	public DadaResult deleteItemParam(long itemParamId) {
		itemParamMapper.deleteByPrimaryKey(itemParamId);
		return DadaResult.ok();
	}

}
