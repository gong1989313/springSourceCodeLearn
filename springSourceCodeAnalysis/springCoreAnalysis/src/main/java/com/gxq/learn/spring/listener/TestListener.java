package com.gxq.learn.spring.listener;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

@SuppressWarnings("rawtypes")
public class TestListener implements ApplicationListener {

	@Override
	public void onApplicationEvent(ApplicationEvent event) {
		if(event instanceof TestEvent) {
			TestEvent testEvent = (TestEvent) event;
			testEvent.print();
		}
	}
}
