package com.store.entity;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
/**
 * ���ﳵ
 * */
public class Cart {
	private Map<String,CartItem> itemMap = new HashMap<String,CartItem>();
	private Double total = 0.0;
	/**
	 * ��ȡ���й�����
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
	 * ���빺�ﳵ
	 * */
	public void add2cart(CartItem cartItem){
		//��ȡ��Ʒid
		String pid = cartItem.getProduct().getPid();
		//�жϹ��ﳵ�Ƿ���
		if(itemMap.containsKey(pid)){
			//��--�޸�����=ԭ����+���������
			CartItem oItem = itemMap.get(pid);
			
			oItem.setCount(oItem.getCount()+cartItem.getCount());
		}else {
			//��
			itemMap.put(pid, cartItem);
		}
		total +=cartItem.getSubtotal();
	}
	/**
	 * �ӹ��ﳵ�Ƴ�һ��������
	 * */
	public void removerFromCart(String pid){
		CartItem item = itemMap.remove(pid);
		total -= item.getSubtotal();
	}
	/**
	 * ��չ��ﳵ
	 * */
	public void clearCart(){
		itemMap.clear();
		total=0.0;
	}
}
