package com.gxq.learn.spring.bean.factory.custom;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CustomBeanTest {

	@Test
	public void test() {
		String xml = "classpath:configuration/beanCustomTagTest.xml";  
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[] { xml });  
        System.out.println(context.getBean("testCustom"));
	}

}
