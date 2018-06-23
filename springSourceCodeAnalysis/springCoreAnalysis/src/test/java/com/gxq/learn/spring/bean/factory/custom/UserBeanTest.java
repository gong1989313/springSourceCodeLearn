package com.gxq.learn.spring.bean.factory.custom;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserBeanTest {

	@Test
	public void test() {
		String xml = "classpath:configuration/UserBeanTest.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[] { xml });
		User user = (User) context.getBean("testUser");
		System.out.println(user.getUserName() + " -----> " + user.getEmail());
	}

}
