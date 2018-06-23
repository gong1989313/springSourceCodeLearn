package com.gxq.learn.spring.transaction.service.impl;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.gxq.learn.spring.transaction.dao.AccountDao;
import com.gxq.learn.spring.transaction.service.AccountService;

@Transactional(propagation = Propagation.REQUIRED)
public class AnnotationAccountServiceImpl implements AccountService {
	private AccountDao accountDao;

	public void setAccountDao(AccountDao accountDao) {
		this.accountDao = accountDao;
	}

	public void transfer(String out, String in, Double money) {
		accountDao.outMoney(out, money);
		int i = 1 / 0;
		System.out.println(i);
		accountDao.inMoney(in, money);
	}
}
