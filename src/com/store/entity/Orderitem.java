package com.store.entity;

import java.util.Date;

public class Orderitem {
	private String oid;		//������
	private Double subtotal;//���
	private Integer ostate;	//����״̬   1��δ����	2���ѷ���	0�����ջ�
	
	private String address;	//�ջ��˵�ַ
	private Date odate;		//�µ�ʱ��
	private Users users;	//�ջ�����Ϣ
	
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
