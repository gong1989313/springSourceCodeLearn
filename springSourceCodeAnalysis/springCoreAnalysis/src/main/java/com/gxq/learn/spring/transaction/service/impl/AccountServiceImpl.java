package com.gxq.learn.spring.transaction.service.impl;

import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;

import com.gxq.learn.spring.transaction.dao.AccountDao;
import com.gxq.learn.spring.transaction.service.AccountService;

public class AccountServiceImpl implements AccountService {

	private AccountDao accountDao;

	// ע����������ģ��
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
				// �˴���0ģ��ת�˷����쳣
				int i = 1 / 0;
				System.out.println(i);
				accountDao.inMoney(in, money);
			}
		});
	}
}
