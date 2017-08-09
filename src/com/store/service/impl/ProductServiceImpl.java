package com.store.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.store.dao.ProductDao;
import com.store.entity.Category;
import com.store.entity.Product;
import com.store.service.ProductService;
@Service
public class ProductServiceImpl implements ProductService {
	@Autowired
	private ProductDao productDao;
	
	/**
	 * �鿴��Ʒ
	 * */
	@Override
	public List<Product> getListProduct(int pflag,int pageNumber,int pageSize) {
		int pageSizes = pageNumber*pageSize;		//���һ��������
		int actionPage = (pageNumber-1)*pageSize;	//��ʼ������
		return productDao.getListProduct(pflag,pageSizes,actionPage);
	}
	/**
	 * ����pid������Ʒ
	 * */
	@Override
	public Product getProductByPid(String pid) {
		return productDao.getObjectById(pid);
	}
	
	/**
	 * �鿴��Ʒ����
	 * */
	@Override
	public List<Category> getListCategory() {
		return productDao.getListCategory();
	}
	
	/**
	 * �޸���Ʒ
	 * */
	@Override
	public boolean getUpdateProductByPid(Product product) {
		int a = productDao.getUpdateProductByPid(product);
		boolean flag = false;
		if(a>0){
			flag = true;
		}else{
			flag = false;
		}
		return flag;
	}
	
	/**
	 * ��ѯ������Ʒ����
	 * */
	@Override
	public int getLengthToList(int pflag) {
		return productDao.getLengthToList(pflag);
	}
	
	/**
	 * ��ѯ��Ʒ��������
	 * */
	@Override
	public int getLengthToListCartgory() {
		return productDao.getLengthToListCartgory();
	}
	
	/**
	 * �����Ʒ�����ж�
	 * */
	@Override
	public boolean getInsertToCategory(String cid,String cname) {
		Category category = productDao.getCnameByCname(cname);
		boolean flag = false;
		if(category==null){
			flag = true;
			productDao.getInsertToCategory(cid,cname);
		}else{
			flag = false;
		}
		return flag;
	}
	@Override
	public List<Product> getHotListProduct(int isHot, int pflag) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<Product> getNewListProduct(int pflag) {
		// TODO Auto-generated method stub
		return null;
	}

}
