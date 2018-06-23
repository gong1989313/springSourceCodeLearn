package com.gxq.learn.spring.bean.factory.custom;

public class TestBean {
	private long id;
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("TestBean [id=").append(id).append(", name=").append(name).append("]");
		return builder.toString();
	}
	
	
}
