package com.gxq.learn.spring.bean.factory;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.gxq.learn.mybatis.bean.User;

/*@ContextConfiguration(locations = { "classpath:configuration/factoryBeanContext.xml" })
// 有不用@RunWith也可以用的，自己没有测试
@RunWith(SpringJUnit4ClassRunner.class)
public class MyFactoryBeanTest {
	@Autowired
	private ApplicationContext context;

	*//**
	 * 测试验证FactoryBean原理，代理一个servcie在调用其方法的前后，打印日志亦可作其他处理
	 * 从ApplicationContext中获取自定义的FactoryBean context.getBean(String beanName)
	 * ---> 最终获取到的Object是FactoryBean.getObejct(),
	 * 使用Proxy.newInstance生成service的代理类
	 *//*
	@Test
	public void testFactoryBean() {
		User helloWorldService = (User) context.getBean("fbHelloWorldService");
		System.out.println(helloWorldService.getUsername());
		System.out.println(helloWorldService.getPassword());
	}
}*/

public class MyFactoryBeanTest {  
    public static void main(String[] args){  
        String url = "classpath:configuration/factoryBeanContext.xml";  
        ClassPathXmlApplicationContext cpxa = new ClassPathXmlApplicationContext(url);  
        Object school=  cpxa.getBean("factoryBeanPojo");  
        MyFactoryBean factoryBeanPojo= (MyFactoryBean) cpxa.getBean("&myFactoryBean");  
        System.out.println(school.getClass().getName());  
        System.out.println(factoryBeanPojo.getClass().getName());  
    }  
}