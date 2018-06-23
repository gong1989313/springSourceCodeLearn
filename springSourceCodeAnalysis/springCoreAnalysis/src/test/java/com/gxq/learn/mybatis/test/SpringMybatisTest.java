package com.gxq.learn.mybatis.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.gxq.learn.mybatis.bean.User;
import com.gxq.learn.mybatis.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/spring.xml")
public class SpringMybatisTest {
	@Autowired
	private UserService userService;

	@Test
	public void save() {
		User user = new User("zw1","", 20);
		userService.saveUser(user);
	}
}
