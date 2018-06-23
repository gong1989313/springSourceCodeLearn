package com.gxq.learn.rmi.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RMIClientMain {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-config-client.xml");
		HelloRMIService hms = context.getBean("myClient", HelloRMIService.class);
		System.out.println(hms.getAdd(1, 10));
	}
}
