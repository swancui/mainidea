package com.store.entity;

public class Users {
	
	private String usid;		//用户id
	private String username;	//用户名
	private String password;	//密码
	
	private String uname;		//真实姓名
	private String email;		//邮箱
	private String telephone;	//电话
	
	private String birthday;	//生日
	private String sex;			//性别
	private Integer ustate;		//激活状态	1：已激活	0：未激活
	
	private String code;		//激活码

	public String getUsid() {
		return usid;
	}

	public void setUsid(String usid) {
		this.usid = usid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Integer getUstate() {
		return ustate;
	}

	public void setUstate(Integer ustate) {
		this.ustate = ustate;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Users(String usid, String username, String password, String uname, String email, String telephone,
			String birthday, String sex, Integer ustate, String code) {
		super();
		this.usid = usid;
		this.username = username;
		this.password = password;
		this.uname = uname;
		this.email = email;
		this.telephone = telephone;
		this.birthday = birthday;
		this.sex = sex;
		this.ustate = ustate;
		this.code = code;
	}

	public Users() {
		super();
	}

	
	
}