package com.gxq.learn.spring.aop.demo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class PostProcessor implements BeanPostProcessor {

	@Override

	public Object postProcessBeforeInitialization(Object bean, String beanName)

			throws BeansException {

		System.out.println("------------------------------");

		System.out.println("对象" + beanName + "开始实例化");

		return bean;

	}

	@Override

	public Object postProcessAfterInitialization(Object bean, String beanName)

			throws BeansException {

		System.out.println("对象" + beanName + "实例化完成");

		System.out.println("------------------------------");

		return bean;

	}

}
