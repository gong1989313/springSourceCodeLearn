package com.gxq.learn.spring.aop.demo;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gxq.learn.spring.aop.test.AOPBean;

public class AopTest {

	@Test
	public void test() {
		ApplicationContext bf = new ClassPathXmlApplicationContext("configuration/aopConfig.xml");
		AOPBean my = (AOPBean) bf.getBean("DEMO");
		my.test1();
	}
}
