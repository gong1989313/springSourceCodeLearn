package com.gxq.learn.mybatis.dao;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.gxq.learn.mybatis.bean.User;

@Repository
public class UserDao {

	@Resource
	private SqlSessionTemplate sqlSessionTemplate;

	public User getUser(int id) {
		return sqlSessionTemplate.selectOne(this.getClass().getName() + ".getUser", 1);
	}
	
	public void saveUser(User user) {
		sqlSessionTemplate.insert("", user);
	}
}
