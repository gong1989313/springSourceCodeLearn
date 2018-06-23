package com.gxq.learn.spring.transaction.dao;

public interface AccountDao {
	public void outMoney(String out, Double money);

	public void inMoney(String in, Double money);
}
