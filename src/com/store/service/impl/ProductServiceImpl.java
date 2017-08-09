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
	 * 查看商品
	 * */
	@Override
	public List<Product> getListProduct(int pflag,int pageNumber,int pageSize) {
		int pageSizes = pageNumber*pageSize;		//最后一条的数据
		int actionPage = (pageNumber-1)*pageSize;	//开始的数据
		return productDao.getListProduct(pflag,pageSizes,actionPage);
	}
	/**
	 * 根据pid查找商品
	 * */
	@Override
	public Product getProductByPid(String pid) {
		return productDao.getObjectById(pid);
	}
	
	/**
	 * 查看商品类型
	 * */
	@Override
	public List<Category> getListCategory() {
		return productDao.getListCategory();
	}
	
	/**
	 * 修改商品
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
	 * 查询在售商品数量
	 * */
	@Override
	public int getLengthToList(int pflag) {
		return productDao.getLengthToList(pflag);
	}
	
	/**
	 * 查询商品类型数量
	 * */
	@Override
	public int getLengthToListCartgory() {
		return productDao.getLengthToListCartgory();
	}
	
	/**
	 * 添加商品类型判断
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
