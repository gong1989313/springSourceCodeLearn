package com.gxq.learn.spring.bean.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycle {

	public static void main(String[] args) {
		System.out.println("���ڿ�ʼ��ʼ������");
		ApplicationContext factory = new ClassPathXmlApplicationContext("configuration/beans_lifecycle.xml");
		System.out.println("������ʼ���ɹ�");
		// �õ�Preson����ʹ��
		Person person = factory.getBean("person", Person.class);
		System.out.println(person);

		System.out.println("���ڿ�ʼ�ر�������");
		((ClassPathXmlApplicationContext) factory).registerShutdownHook();
	}
}