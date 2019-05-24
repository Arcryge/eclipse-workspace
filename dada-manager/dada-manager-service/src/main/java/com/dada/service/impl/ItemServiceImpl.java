/**
 * @author Arcry
 * @date 2019年4月23日
 * @time 下午9:21:47
 */
package com.dada.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dada.common.pojo.DadaResult;
import com.dada.common.pojo.EUDataGridResult;
import com.dada.common.utils.IDUtils;
import com.dada.mapper.TbItemDescMapper;
import com.dada.mapper.TbItemMapper;
import com.dada.mapper.TbItemParamItemMapper;
import com.dada.pojo.TbItem;
import com.dada.pojo.TbItemDesc;
import com.dada.pojo.TbItemExample;
import com.dada.pojo.TbItemExample.Criteria;
import com.dada.pojo.TbItemParamItem;
import com.dada.service.ItemService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

/**
 * 商品管理Service
 *  
 * @author Arcry
 * @version 0.1
 * @date 2019年4月23日 下午9:22:28
 */
@Service
public class ItemServiceImpl implements ItemService {

	@Autowired
	private TbItemMapper itemMapper;

	@Autowired
	private TbItemDescMapper itemDescMapper;

	@Autowired
	private TbItemParamItemMapper itemParamItemMapper;

	@Override
	public TbItem getItemById(long itemId) {
		// TODO Auto-generated method stub

//		TbItem item = itemMapper.selectByPrimaryKey(itemId);

		TbItemExample example = new TbItemExample();
		//添加查询条件
		Criteria criteria = example.createCriteria();
		criteria.andIdEqualTo(itemId);
		List<TbItem> list = itemMapper.selectByExample(example);
		if (list != null && list.size() > 0) {
			TbItem item = list.get(0);
			return item;
		}
		return null;
	}

	/**
	 * 
	 * @desc 商品列表查询
	 * @author Arcry
	 * @param page
	 * @param rows
	 * @return
	 * @time 2019年4月25日 下午10:14:27
	 */
	@Override
	public EUDataGridResult getItemList(int page, int rows) {
		//查询商品列表
		TbItemExample example = new TbItemExample();
		//分页处理
		PageHelper.startPage(page, rows);
		List<TbItem> list = itemMapper.selectByExample(example);
		//创建一个返回值对象
		EUDataGridResult result = new EUDataGridResult();
		result.setRows(list);
		//取记录总条数
		PageInfo<TbItem> pageInfo = new PageInfo<>(list);
		result.setTotal(pageInfo.getTotal());
		return result;
	}

	@Override
	public DadaResult createItem(TbItem item, String desc, String itemParam) throws Exception {
		// item 补全
		//生成商品ID
		Long itemId = IDUtils.genItemId();
		item.setId(itemId);
		//商品状态，1-正常，2-下架，3-删除
		item.setStatus((byte) 1);
		item.setCreated(new Date());
		item.setUpdated(new Date());
		//插入到数据库
		itemMapper.insert(item);
		//添加商品 描述信息
		DadaResult result = insertItemDesc(itemId, desc);
		if (result.getStatus() != 200) {
			throw new Exception();
		}
		//添加规格参数
		result = insertItemParamItem(itemId, itemParam);
		if (result.getStatus() != 200) {
			throw new Exception();
		}
		return DadaResult.ok();
	}

	/**
	 * 
	 * @desc 添加商品描述
	 * @author Arcry
	 * @param itemId
	 * @param desc
	 * @return
	 * @return DadaResult
	 * @time 2019年5月18日 下午7:50:29
	 */
	private DadaResult insertItemDesc(Long itemId, String desc) {
		TbItemDesc itemDesc = new TbItemDesc();
		itemDesc.setItemId(itemId);
		itemDesc.setItemDesc(desc);
		itemDesc.setCreated(new Date());
		itemDesc.setUpdated(new Date());
		itemDescMapper.insert(itemDesc);
		return DadaResult.ok();
	}

	/**
	 * 添加规格参数
	 * @desc 
	 * @author Arcry
	 * @param itemId
	 * @param itemParam
	 * @return
	 * @return DadaResult
	 * @time 2019年5月19日 下午3:24:26
	 */
	private DadaResult insertItemParamItem(Long itemId, String itemParam) {
		//创建一个pojo
		TbItemParamItem itemParamItem = new TbItemParamItem();
		itemParamItem.setItemId(itemId);
		itemParamItem.setParamData(itemParam);
		itemParamItem.setCreated(new Date());
		itemParamItem.setUpdated(new Date());
		//向表中插入数据 
		itemParamItemMapper.insert(itemParamItem);

		return DadaResult.ok();

	}

}
