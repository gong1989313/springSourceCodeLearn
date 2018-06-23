package com.gxq.learn.spring.bean.factory.lookup;

public abstract class GetBean {
	public abstract User getBean();
	
	public void showMe() {
		this.getBean().showMe();
	}
}
