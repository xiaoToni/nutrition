package com.cn.houst.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.cn.houst.dao.IUserDao;
import com.cn.houst.pojo.User;
import com.cn.houst.service.IUserService;

@Service  
public class UserServiceImpl implements IUserService {

	@Resource
	private IUserDao userDao;
	
	@Override
	public User getUserById(int userId) {
		return this.userDao.selectByPrimaryKey(userId);
	}

}
