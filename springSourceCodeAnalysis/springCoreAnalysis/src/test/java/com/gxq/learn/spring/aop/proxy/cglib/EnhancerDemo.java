package com.gxq.learn.spring.aop.proxy.cglib;

import java.lang.reflect.Method;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

public class EnhancerDemo {
	public static void main(String[] args) {
		Enhancer enhancer = new Enhancer();
		enhancer.setSuperclass(EnhancerDemo.class);
		enhancer.setCallback(new MethodInterceptorImpl());

		EnhancerDemo demo = (EnhancerDemo) enhancer.create();
		demo.test();
		System.out.println(demo);
	}

	void test() {
		System.out.println("enhancedemo test()");
	}

	private static class MethodInterceptorImpl implements MethodInterceptor {

		@Override
		public Object intercept(Object paramObject, Method paramMethod, Object[] paramArrayOfObject,
				MethodProxy paramMethodProxy) throws Throwable {
			System.out.println("before invoke " + paramMethod);
			Object result = paramMethodProxy.invokeSuper(paramObject, paramArrayOfObject);
			System.out.println("after invoke " + paramMethod);
			return result;
		}

	}
}
