/**
 * @author Arcry
 * @date 2019年5月24日
 * @time 上午11:31:24
 */
package com.dada.rest.service;

import com.dada.common.pojo.DadaResult;


public interface RedisService {

	DadaResult syncContent(long congtentCid);
}
