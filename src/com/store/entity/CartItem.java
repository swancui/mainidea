package com.store.entity;

import com.store.entity.Product;

/**
 * ������
 * */
public class CartItem {
	
	private Users users;		//�û�
	private Product product;	//��Ʒ
	private Double subtotal;	//С��
	private Integer count;		//����
	
	
	public Users getUsers() {
		return users;
	}
	public void setUsers(Users users) {
		this.users = users;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	/**
	 * ��ȡ��ƷС��
	 * */
	public Double getSubtotal() {
		subtotal = product.getShop_price()*count;
		return subtotal;
	}
	public void setSubtotal(Double subtotal) {
		this.subtotal = subtotal;
	}
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	
	
	
}
