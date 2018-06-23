package com.gxq.learn.spring.listener;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ListenerTest {

	@Test
	public void test() {
		ApplicationContext bf = new ClassPathXmlApplicationContext("configuration/eventListener.xml");
		TestEvent event = new TestEvent("gxq", "hello");
		bf.publishEvent(event);
	}

}
