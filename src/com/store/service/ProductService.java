package com.store.service;

import java.util.List;

import com.store.entity.Category;
import com.store.entity.Product;

public interface ProductService {

	Product getProductByPid(String pid);

	List<Product> getListProduct(int pflag,int pageNumber,int pageSize);

	List<Category> getListCategory();

	boolean getUpdateProductByPid(Product product);

	int getLengthToList(int pflag);

	int getLengthToListCartgory();

	boolean getInsertToCategory(String cid,String cname);

	List<Product> getHotListProduct(int isHot, int pflag);

	List<Product> getNewListProduct(int pflag);

}
