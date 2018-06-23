package com.gxq.learn.spring.bean.factory.placeholder;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gxq.learn.spring.bean.factory.MyTestBean;

public class PlaceholderTest {

	@Test
	public void test() {
		ApplicationContext bf = new ClassPathXmlApplicationContext("configuration/propertyPlaceholderConfigurer.xml"); 
		MyTestBean my = (MyTestBean) bf.getBean("myTestBean");
		System.out.println(my);
	}

}
