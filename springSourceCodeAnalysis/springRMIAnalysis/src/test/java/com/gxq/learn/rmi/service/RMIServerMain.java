package com.gxq.learn.rmi.service;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RMIServerMain {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		new ClassPathXmlApplicationContext("spring-config-server.xml");
	}

}
