/**
 * @author Arcry
 * @date 2019年5月24日
 * @time 上午11:38:19
 */
package com.dada.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dada.common.pojo.DadaResult;
import com.dada.rest.service.RedisService;

/**
 * 缓存同步Controller
 *  
 * @author Arcry
 * @version 0.1
 * @date 2019年5月24日 上午11:38:24
 */
@Controller
@RequestMapping("/cache/sync")
public class RedisController {

	@Autowired
	private RedisService redisService;

	@RequestMapping("/content/{contentCid}")
	@ResponseBody
	public DadaResult contentCacheSync(@PathVariable Long contentCid) {
		DadaResult result = redisService.syncContent(contentCid);
		return result;
	}
}

