package com.gxq.learn.spring.bean.factory.lookup;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class BeanFactoryLookupTest {

	@Test
	public void test() {
		BeanFactory bf = new XmlBeanFactory(new ClassPathResource("configuration/beanLookupFactoryTest.xml")); 
		GetBean get = (GetBean) bf.getBean("getBean");
		get.showMe();
	}

}
