package com.store.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.store.entity.Category;
import com.store.entity.Product;

public interface ProductDao {

	List<Product> getListProduct(@Param("pflag")int pflag, @Param("pageSize")int pageSize, @Param("actionPage")int actionPage);

	Product getObjectById(String pid);

	List<Category> getListCategory();

	int getUpdateProductByPid(Product product);

	int getLengthToList(int pflag);

	int getLengthToListCartgory();

	Category getCnameByCname(String cname);

	void getInsertToCategory(@Param("cid")String cid, @Param("cname")String cname);

	List<Product> getHotListProduct(@Param("isHot")int isHot, @Param("pflag")int pflag);

}
