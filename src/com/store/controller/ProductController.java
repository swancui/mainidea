package com.store.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.store.entity.Category;
import com.store.entity.Product;
import com.store.service.ProductService;
import com.store.utils.Constant;
import com.store.utils.FileUp;
import com.store.utils.UUIDUtil;

@Controller
@RequestMapping("admin/")
public class ProductController {

	@Autowired
	private ProductService productService;
	
	/**
	 * 添加商品类型
	 * */
	@RequestMapping("insertcate")
	public ModelAndView insertcate(String cname){
		ModelAndView modelAndView = new ModelAndView("redirect:cartgory?pageNumber=1&pageSize=1");
		String cid = UUIDUtil.getUUID();
		boolean flag = productService.getInsertToCategory(cid,cname);
		if(flag){
			return modelAndView;
		}else{
			modelAndView = new ModelAndView("admin/msg");
			modelAndView.addObject("msg", "商品类型重复，请确认后再添加");
			modelAndView.addObject("eng", "Product type is repeated, please confirm and then add");
			return modelAndView;
		}
	}
	/**
	 * 跳转到添加商品类型
	 * */
	@RequestMapping("insertcategory")
	public String insertcategory(){
		return "admin/product/insertcategory";
	}
	
	/**
	 * 商品类型
	 * */
	@RequestMapping("cartgory")
	public ModelAndView cartgoryList(int pageNumber,int pageSize){
		ModelAndView modelAndView = new ModelAndView("admin/product/cartgory");
		if(pageNumber==0){
			pageNumber=1;
		}
		if(pageSize==0){
			pageSize=10;
		}
		List<Category> list = productService.getListCategory();
		int count = productService.getLengthToListCartgory();
		int page=1;
		if(count%pageSize==0){
			page = count/pageSize;
		}else{
			page = (count/pageSize)+1;
		}
		
		int pagePrevious = pageNumber-1;
		//判断当前页码是否为第一页
		if(pagePrevious <= 0){
			pagePrevious = 1;
		}
		
		int pageNext = pageNumber+1;
		//判断当前页码是否为最后一页
		if(pageNext > page){
			pageNext = page;
		}
		ModelMap modelMap = new ModelMap();
		modelMap.put("page", page);
		modelMap.put("count",count);
		modelMap.put("list",list);
		modelMap.put("pageSize",pageSize);
		modelMap.put("pagePrevious",pagePrevious);
		modelMap.put("pageNext",pageNext);
		modelAndView.addAllObjects(modelMap);
		return modelAndView;
	}
	
	/**
	 * 在售商品详情
	 * */
	@RequestMapping("productFlag")
	public ModelAndView productList(int pflag,int pageNumber,int pageSize){
		ModelAndView modelAndView = new ModelAndView("admin/product/productFlag");
		if(pageNumber==0){
			pageNumber=1;
		}
		List<Product> list = productService.getListProduct(pflag,pageNumber,pageSize);
		int count = productService.getLengthToList(pflag);
		if(count==0){
			modelAndView = new ModelAndView("admin/msg");
			modelAndView.addObject("msg", "没有下架的商品,所有商品都在售卖中");
			modelAndView.addObject("eng", "No goods under the shelves, all goods are sold");
			return modelAndView;
		}
		int page=1;
		if(count%pageSize==0){
			page = count/pageSize;
		}else{
			page = (count/pageSize)+1;
		}
		
		int pagePrevious = pageNumber-1;
		//判断当前页码是否为第一页
		if(pagePrevious <= 0){
			pagePrevious = 1;
		}
		
		int pageNext = pageNumber+1;
		//判断当前页码是否为最后一页
		if(pageNext > page){
			pageNext = page;
		}
		ModelMap modelMap = new ModelMap();
		modelMap.put("page", page);
		modelMap.put("pflag",pflag);
		modelMap.put("count",count);
		modelMap.put("list",list);
		modelMap.put("pageNumber", pageNumber);
		modelMap.put("pageSize",pageSize);
		modelMap.put("pagePrevious",pagePrevious);
		modelMap.put("pageNext",pageNext);
		modelAndView.addAllObjects(modelMap);
		return modelAndView;
	}
	
	/**
	 * 下架商品详情
	 * *//*
	@RequestMapping("productNotFlag")
	public ModelAndView productNotList(int pflag,int pageNumberint,int pageSize){
		ModelAndView modelAndView = new ModelAndView("forward:productFlag");
		return modelAndView;
	}*/
	
	
	
	/**
	 * 跳转修改页面
	 * */
	@RequestMapping("updateproduct")
	public ModelAndView updateproduct(String pid){
		ModelAndView modelAndView = new ModelAndView("admin/product/updateproduct");
		Product product = productService.getProductByPid(pid);
		List<Category> category = productService.getListCategory();
		modelAndView.addObject("category",category);
		modelAndView.addObject("product",product);
		return modelAndView;
	}
	/**
	 * 修改验证
	 * */
	@RequestMapping("updatecheck")
	public String updatecheck(HttpServletRequest request,String pid,String pname,Double market_price,
			Double shop_price,MultipartFile pimage,int is_hot,String pdesc,int pflag,String cid){
		String image = FileUp.fileUpload(request,pimage);
		System.out.println(pimage);
		Product oproduct = productService.getProductByPid(pid);
		
		if(image==null){
			image = oproduct.getPimage();
		}
		
		Product product = new Product(pid, pname, market_price, shop_price, image, null, is_hot, pdesc, pflag, cid);
		
		boolean flag = productService.getUpdateProductByPid(product);
		if(flag){
			return "redirect:productFlag?pflag=0";
		}else{
			return "forward:updateproduct";
		}
	}
	
	/**
	 * 产品下架
	 * */
	@RequestMapping("notflagcheck")
	public String notflagcheck(String pid,int pageNumber,int pageSize){
		System.out.println(pageNumber);
		Product product = new Product(pid, null, null, null, null, null, Constant.IS_NOT_HOT, null, Constant.NOT_PFLAG, null);
		productService.getUpdateProductByPid(product);
		return "forward:productFlag?pflag=0&pageNumber="+pageNumber+"&pageSize="+pageSize;
	}
	
	/**
	 * 产品上架
	 * */
	@RequestMapping("flagcheck")
	public String flagcheck(String pid,int pageNumber,int pageSize){
		Product product = new Product(pid, null, null, null, null, null, Constant.IS_HOT, null, Constant.PFLAG, null);
		productService.getUpdateProductByPid(product);
		return "forward:productFlag?pflag=1&pageNumber="+pageNumber+"&pageSize="+pageSize;
	}
}
