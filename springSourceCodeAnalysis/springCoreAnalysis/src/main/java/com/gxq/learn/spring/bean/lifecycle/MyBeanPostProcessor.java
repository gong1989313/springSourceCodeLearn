package com.gxq.learn.spring.bean.lifecycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanPostProcessor implements BeanPostProcessor {

	public MyBeanPostProcessor() {
		super();
		System.out.println("����BeanPostProcessorʵ���๹��������");
	}

	@Override
	public Object postProcessAfterInitialization(Object arg0, String arg1) throws BeansException {
		System.out.println("BeanPostProcessor�ӿڷ���postProcessAfterInitialization�����Խ��и��ģ�");
		return arg0;
	}

	@Override
	public Object postProcessBeforeInitialization(Object arg0, String arg1) throws BeansException {
		System.out.println("BeanPostProcessor�ӿڷ���postProcessBeforeInitialization�����Խ��и��ģ�");
		return arg0;
	}
}
