package com.gxq.learn.spring.aop.test;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class AspectJTest {
	@Pointcut("execution(* *.test1(..))")
	public void test111() {
		System.out.println("point test");
	}
	
	@Before("test111()")
	public void beforeTest() {
		System.out.println("beforeTest");
	}
	
	@After("test111()")
	public void afterTest() {
		System.out.println("afterTest");
	}
	
	@Around("test111()")
	public Object aroundTest(ProceedingJoinPoint p) {
		System.out.println("before1");
		Object o = null;
		try {
			o = p.proceed();
		} catch (Throwable e) {
			e.printStackTrace();
		}
		System.out.println("after1");
		return o;
	}
}
