package com.gxq.learn.spring.aop.test;

public class AOPBean {
	private String testStr = "testStr";

	public String getTestStr() {
		return testStr;
	}

	public void setTestStr(String testStr) {
		this.testStr = testStr;
	}
	
	public void test1() {
		System.out.println("{test.........}");
	}
}
