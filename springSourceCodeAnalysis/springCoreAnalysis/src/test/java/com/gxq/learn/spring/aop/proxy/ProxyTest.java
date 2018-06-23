package com.gxq.learn.spring.aop.proxy;

import org.junit.Test;

public class ProxyTest {

	@Test
	public void test() {
		UserService us = new UserServiceImpl();
		MyInvocationHandler ih = new MyInvocationHandler(us);
		UserService proxy = (UserService) ih.getProxy();
		proxy.add();
	}

}
