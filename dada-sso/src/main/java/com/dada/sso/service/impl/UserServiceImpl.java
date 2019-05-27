/**
 * @author Arcry
 * @date 2019年5月27日
 * @time 上午11:59:54
 */
package com.dada.sso.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

import com.dada.common.pojo.DadaResult;
import com.dada.mapper.TbUserMapper;
import com.dada.pojo.TbUser;
import com.dada.pojo.TbUserExample;
import com.dada.pojo.TbUserExample.Criteria;
import com.dada.sso.service.UserService;

/**
 * 用户管理Service
 *  
 * @author Arcry
 * @version 0.1
 * @date 2019年5月27日 下午12:00:15
 */
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private TbUserMapper userMapper;

	@Override
	public DadaResult checkData(String content, Integer type) {
		//创建查询条件
		TbUserExample example = new TbUserExample();
		Criteria criteria = example.createCriteria();
		//对数据进行校验：1、2、3分别代表username、phone、email
		//用户名校验 
		if (1 == type) {
			criteria.andUsernameEqualTo(content);
			//电话校验
		} else if (2 == type) {
			criteria.andPhoneEqualTo(content);
			//email校验
		} else {
			criteria.andEmailEqualTo(content);
		}
		//执行查询
		List<TbUser> list = userMapper.selectByExample(example);
		if (list == null || list.size() == 0) {
			return DadaResult.ok(true);
		}
		return DadaResult.ok(false);
	}

	@Override
	public DadaResult createUser(TbUser user) {
		user.setUpdated(new Date());
		user.setCreated(new Date());
		//md5加密
		user.setPassword(DigestUtils.md5DigestAsHex(user.getPassword().getBytes()));
		userMapper.insert(user);
		return DadaResult.ok();

	}

}
