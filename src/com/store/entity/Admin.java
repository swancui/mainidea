package com.store.entity;

public class Admin {
	private String aid;			//����Աid
	private String name;		//����Ա�û���
	private String password;	//����
	private Integer authority;	//Ȩ�� 1����������Ա	0����ͨ����Ա
	
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
