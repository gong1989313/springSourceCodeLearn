package com.gxq.learn.spring.bean.factory;

public class MyTestBean {
	private String userName;
	private String password;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("MyTestBean [userName=").append(userName).append(", password=")
				.append(password).append("]");
		return builder.toString();
	}

}
