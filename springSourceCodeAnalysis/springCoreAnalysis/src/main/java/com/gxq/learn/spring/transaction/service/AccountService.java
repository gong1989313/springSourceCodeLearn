package com.gxq.learn.spring.transaction.service;

public interface AccountService {
	public void transfer(String out, String in, Double money);
}
