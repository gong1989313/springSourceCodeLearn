package com.gxq.learn.spring.bean.factory.circle;

import org.junit.Test;
import org.springframework.beans.BeansException;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CircleBeanFactoryTest {

	@Test
	public void test() {
		try {
			ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("configuration/beanFactoryCircle2.xml");
			ctx.getBean("testA");
		} catch (BeansException e) {
			e.printStackTrace();
		}
	}

}
