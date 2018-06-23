package com.gxq.learn.rmi.service.impl;

import com.gxq.learn.rmi.service.HelloRMIService;

public class HelloRMIServiceImpl implements HelloRMIService {

	@Override
	public int getAdd(int a, int b) {
		return a+b;
	}

}
