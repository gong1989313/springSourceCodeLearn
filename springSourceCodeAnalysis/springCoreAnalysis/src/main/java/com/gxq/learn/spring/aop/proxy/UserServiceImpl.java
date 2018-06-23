package com.gxq.learn.spring.aop.proxy;

public class UserServiceImpl implements UserService {

	@Override
	public void add() {
		System.out.println("---------------add-------------------");
	}

}
