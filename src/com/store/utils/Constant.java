package com.store.utils;

public interface Constant {
	
	//是否热门 1：热门  0：不热门
	int IS_HOT = 1;
	int IS_NOT_HOT = 0;
	
	//是否下架 1：下架  0：未下架
	int PFLAG = 0;
	int NOT_PFLAG = 1;
	
	//权限 1：超级管理员	0：普通管理员
	int AUTHORITY = 1;
	int NOT_AUTHORITY = 0;
	
	//订单状态   1：未发货	2：已发货	0：已收货
	int IS_THE_DELIVERY_OSTATE = 1;
	int	NON_DELIVERY_OSTATE = 2;
	int RECEIVED_CONDITION_OSTATE = 0;
	
	//激活状态	1：已激活	0：未激活
	int STATE = 1;
	int NOT_STATE = 0;
	
	//邮箱设置
	
	String FROMMAIL = "swancuikqq635@163.com";
	String USERMAIL = "swancuikqq635";
	String PASSWORDMAIL = "a19881023";
	String MAILTITLE = "**商城，用户名激活";
		
	
}
