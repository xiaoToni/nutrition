package com.cn.houst.service.impl;

import com.cn.houst.dao.UserMapper;
import com.cn.houst.pojo.User;
import com.cn.houst.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements IUserService {

	@Resource
	private UserMapper userMapper;

	@Override
	public User getUserById(int userId) {
		return this.userMapper.selectByPrimaryKey(userId);
	}
}
