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
import com.dada.pojo.TbItemParamItemExample;
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

	/**
	 * 得到商品详情
	 * @desc
	 * @author Arcry
	 * @param itemId
	 * @return
	 * @time 2019年5月30日 下午4:20:31
	 */
	@Override
	public DadaResult getItemDesc(long itemId) {
		//创建查询条件
		TbItemDesc itemDesc = itemDescMapper.selectByPrimaryKey(itemId);
		return DadaResult.ok(itemDesc);
	}

	/**
	 * 得到商品规格
	 * @desc
	 * @author Arcry
	 * @param itemId
	 * @return
	 * @time 2019年5月30日 下午4:20:54
	 */
	@Override
	public DadaResult getItemParam(long itemId) {
		//根据商品id查询规格参数
		//设置查询条件
		TbItemParamItemExample example = new TbItemParamItemExample();
		com.dada.pojo.TbItemParamItemExample.Criteria criteria = example.createCriteria();
		criteria.andItemIdEqualTo(itemId);
		//执行查询
		List<TbItemParamItem> list = itemParamItemMapper.selectByExampleWithBLOBs(example);
		if (list != null && list.size() > 0) {
			TbItemParamItem paramItem = list.get(0);
			return DadaResult.ok(paramItem);
		}
		return DadaResult.build(400, "无此商品规格");
	}

	/**
	 * 修改商品
	 * @desc
	 * @author Arcry
	 * @param itemId
	 * @return
	 * @throws Exception 
	 * @time 2019年5月30日 下午4:29:43
	 */
	@Override
	public DadaResult updateItem(long itemId, TbItem item, String desc, String itemParams) throws Exception {
		TbItem oldItem = itemMapper.selectByPrimaryKey(itemId);
		//item补全
		// '商品状态，1-正常，2-下架，3-删除',
		item.setStatus((byte) 1);
		item.setCreated(oldItem.getCreated());
		item.setUpdated(new Date());
		//更新数据库
		itemMapper.updateByPrimaryKey(item);
		
		//添加商品描述信息
		DadaResult result = updateItemDesc(itemId, desc);
		if (result.getStatus() != 200) {
			throw new Exception();
		}
		//添加规格参数
		/*		result = updateItemParam(itemId, itemParams);
				if (result.getStatus() != 200) {
					throw new Exception();
				}*/
		return DadaResult.ok();
	}

	/**
	 * 更新商品描述
	 * @desc 
	 * @author Arcry
	 * @return
	 * @return DadaResult
	 * @time 2019年5月30日 下午7:58:08
	 */
	public DadaResult updateItemDesc(long itemId, String desc) {
		TbItemDesc itemDesc = new TbItemDesc();
		itemDesc.setItemId(itemId);
		itemDesc.setItemDesc(desc);
		itemDesc.setUpdated(new Date());
		itemDescMapper.updateByPrimaryKeyWithBLOBs(itemDesc);
		return DadaResult.ok();
	}

	/**
	 * 修改参数
	 * @desc 
	 * @author Arcry
	 * @param itemId
	 * @param itemParams
	 * @return
	 * @return DadaResult
	 * @time 2019年5月30日 下午8:03:54
	 */
	public DadaResult updateItemParam(long itemId, String itemParams) {
		TbItemParamItem itemParamItem = itemParamItemMapper.selectByItemKey(itemId);
		itemParamItem.setParamData(itemParams);
		itemParamItem.setUpdated(new Date());
		itemParamItemMapper.updateByPrimaryKeyWithBLOBs(itemParamItem);
		return DadaResult.ok();
	}

	/**
	 * 删除商品
	 * @desc
	 * @author Arcry
	 * @param itemId
	 * @return
	 * @time 2019年5月31日 上午12:07:20
	 */
	@Override
	public DadaResult deleteItem(long itemId) {
		itemMapper.deleteByPrimaryKey(itemId);
		return DadaResult.ok();
	}

	/**
	 * 根据id，更改商品状态1-正常，2-下架，3-删除
	 * @desc
	 * @author Arcry
	 * @param ids
	 * @param method
	 * @return
	 * @time 2019年5月31日 下午8:48:46
	 */
	@Override
	public DadaResult updateItemStatus(List<Long> ids, String method) {
		TbItem item = new TbItem();
		if (method.equals("reshelf")) {
			// 正常，更新status=3即可
			item.setStatus((byte) 1);
		} else if (method.equals("instock")) {
			// 下架，更新status=3即可
			item.setStatus((byte) 2);
		} else if (method.equals("delete")) {
			// 删除，更新status=3即可
			item.setStatus((byte) 3);
		}

		for (Long id : ids) {
			// 创建查询条件，根据id更新
			TbItemExample tbItemExample = new TbItemExample();
			Criteria criteria = tbItemExample.createCriteria();
			criteria.andIdEqualTo(id);
			// 第一个参数 是要修改的部分值组成的对象，其中有些属性为null则表示该项不修改。
			// 第二个参数 是一个对应的查询条件的类， 通过这个类可以实现 order by 和一部分的where 条件。
			itemMapper.updateByExampleSelective(item, tbItemExample);
		}
		return DadaResult.ok();

	}
}
