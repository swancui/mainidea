package com.store.entity;

import com.store.entity.Product;

/**
 * 购物项
 * */
public class CartItem {
	
	private Users users;		//用户
	private Product product;	//商品
	private Double subtotal;	//小计
	private Integer count;		//数量
	
	
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
	 * 获取商品小计
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
