package com.gxq.learn.mvc.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.gxq.learn.mvc.model.User;

public class UserController extends AbstractController {

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		
		List<User> userList = new ArrayList<User>();
		User userA = new User();
		User userB = new User();
		userA.setUsername("aaa");
		userA.setAge(28);
		userB.setUsername("bbb");
		userB.setAge(12);
		userList.add(userA);
		userList.add(userB);
		return new ModelAndView("userList", "users", userList);
	}

}
