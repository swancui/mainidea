package com.store.entity;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
/**
 * 购物车
 * */
public class Cart {
	private Map<String,CartItem> itemMap = new HashMap<String,CartItem>();
	private Double total = 0.0;
	/**
	 * 获取所有购物项
	 * */
	public Collection<CartItem> getCartItems(){
		return itemMap.values();
	}
	
	public Map<String, CartItem> getItemMap() {
		return itemMap;
	}
	public void setItemMap(Map<String, CartItem> itemMap) {
		this.itemMap = itemMap;
	}
	public Double getTotal() {
		return total;
	}
	public void setTotal(Double total) {
		this.total = total;
	}
	/**
	 * 加入购物车
	 * */
	public void add2cart(CartItem cartItem){
		//获取商品id
		String pid = cartItem.getProduct().getPid();
		//判断购物车是否有
		if(itemMap.containsKey(pid)){
			//有--修改数量=原数量+新添加数量
			CartItem oItem = itemMap.get(pid);
			
			oItem.setCount(oItem.getCount()+cartItem.getCount());
		}else {
			//无
			itemMap.put(pid, cartItem);
		}
		total +=cartItem.getSubtotal();
	}
	/**
	 * 从购物车移除一个购物项
	 * */
	public void removerFromCart(String pid){
		CartItem item = itemMap.remove(pid);
		total -= item.getSubtotal();
	}
	/**
	 * 清空购物车
	 * */
	public void clearCart(){
		itemMap.clear();
		total=0.0;
	}
}
