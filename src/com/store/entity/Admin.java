package com.store.entity;

public class Admin {
	private String aid;			//管理员id
	private String name;		//管理员用户名
	private String password;	//密码
	private Integer authority;	//权限 1：超级管理员	0：普通管理员
	
	public String getAid() {
		return aid;
	}
	public void setAid(String aid) {
		this.aid = aid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Integer getAuthority() {
		return authority;
	}
	public void setAuthority(Integer authority) {
		this.authority = authority;
	}
	
}
