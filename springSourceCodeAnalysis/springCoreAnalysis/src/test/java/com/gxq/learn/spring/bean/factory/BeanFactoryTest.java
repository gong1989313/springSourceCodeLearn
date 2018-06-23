package com.gxq.learn.spring.bean.factory;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class BeanFactoryTest {

	@Test
	public void test() {
		BeanFactory bf = new XmlBeanFactory(new ClassPathResource("configuration/beanFactoryTest.xml")); 
		
		MyTestBean my = (MyTestBean) bf.getBean("myTestBean");
		System.out.println(my);
	}

	@Test
	public void testApp() {
		ApplicationContext bf = new ClassPathXmlApplicationContext("configuration/beanFactoryTest.xml"); 
		
		MyTestBean my = (MyTestBean) bf.getBean("myTestBean");
		System.out.println(my);
	}
	
	@Test
	public void testDate() {
		ApplicationContext bf = new ClassPathXmlApplicationContext("configuration/beanFactoryBeanDI.xml"); 
		UserManager my = (UserManager) bf.getBean("userManager");
		System.out.println(my.getDataValue());
	}
	
}
