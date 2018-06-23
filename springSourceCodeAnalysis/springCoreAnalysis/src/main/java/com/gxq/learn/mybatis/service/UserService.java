package com.gxq.learn.mybatis.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.gxq.learn.mybatis.bean.User;
import com.gxq.learn.mybatis.dao.UserDao;

@Service
public class UserService {
	@Resource
	private UserDao userDao;

	public User getUser(int id) {
		return userDao.getUser(id);
	}
	
	public void saveUser(User user) {
		userDao.saveUser(user);
	}
}
