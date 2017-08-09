package com.store.entity;

import java.util.Date;

public class Orderitem {
	private String oid;		//订单号
	private Double subtotal;//金额
	private Integer ostate;	//订单状态   1：未发货	2：已发货	0：已收货
	
	private String address;	//收货人地址
	private Date odate;		//下单时间
	private Users users;	//收货人信息
	
	public String getOid() {
		return oid;
	}
	public void setOid(String oid) {
		this.oid = oid;
	}
	public Double getSubtotal() {
		return subtotal;
	}
	public void setSubtotal(Double subtotal) {
		this.subtotal = subtotal;
	}
	public Integer getOstate() {
		return ostate;
	}
	public void setOstate(Integer ostate) {
		this.ostate = ostate;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Date getOdate() {
		return odate;
	}
	public void setOdate(Date odate) {
		this.odate = odate;
	}
	public Users getUsers() {
		return users;
	}
	public void setUsers(Users users) {
		this.users = users;
	}
	
}
