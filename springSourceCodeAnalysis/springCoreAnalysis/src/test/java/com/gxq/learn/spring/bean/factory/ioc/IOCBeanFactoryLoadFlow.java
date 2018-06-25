package com.gxq.learn.spring.bean.factory.ioc;

import org.junit.Test;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;

public class IOCBeanFactoryLoadFlow {

	@Test
	public void test() {
		ClassPathResource resource = new ClassPathResource("configuration/beanFactoryTest.xml");
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions(resource);
	}

}
