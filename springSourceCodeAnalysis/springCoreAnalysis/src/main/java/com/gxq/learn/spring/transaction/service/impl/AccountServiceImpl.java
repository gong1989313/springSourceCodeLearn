package com.gxq.learn.spring.transaction.service.impl;

import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;

import com.gxq.learn.spring.transaction.dao.AccountDao;
import com.gxq.learn.spring.transaction.service.AccountService;

public class AccountServiceImpl implements AccountService {

	private AccountDao accountDao;

	// 注入事务管理的模板
	private TransactionTemplate transactionTemplate;

	public void setTransactionTemplate(TransactionTemplate transactionTemplate) {
		this.transactionTemplate = transactionTemplate;
	}

	public void setAccountDao(AccountDao accountDao) {
		this.accountDao = accountDao;
	}

	public void transfer(final String out, final String in, final Double money) {
		transactionTemplate.execute(new TransactionCallbackWithoutResult() {
			@Override
			protected void doInTransactionWithoutResult(TransactionStatus transactionStatus) {
				accountDao.outMoney(out, money);
				// 此处除0模拟转账发生异常
				int i = 1 / 0;
				System.out.println(i);
				accountDao.inMoney(in, money);
			}
		});
	}
}
