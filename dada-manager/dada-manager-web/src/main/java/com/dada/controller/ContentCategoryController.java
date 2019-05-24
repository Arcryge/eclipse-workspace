/**
 * @author Arcry
 * @date 2019年5月20日
 * @time 上午11:37:34
 */
package com.dada.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dada.common.pojo.DadaResult;
import com.dada.common.pojo.EUTreeNode;
import com.dada.service.ContentCategoryService;

/**
 * 内容分类管理
 *  
 * @author Arcry
 * @version 0.1
 * @date 2019年5月20日 上午11:37:41
 */
@Controller
@RequestMapping("/content/category")
public class ContentCategoryController {

	@Autowired
	private ContentCategoryService contentCategoryService;

	@RequestMapping("/list")
	@ResponseBody
	public List<EUTreeNode> getContentCatList(@RequestParam(value = "id", defaultValue = "0") Long parentId) {
		List<EUTreeNode> list = contentCategoryService.getCategoryList(parentId);
		return list;
	}

	@RequestMapping("/create")
	@ResponseBody
	public DadaResult createContentCategory(Long parentId, String name) {
		DadaResult result = contentCategoryService.insertContentCategory(parentId, name);
		return result;
	}

}
