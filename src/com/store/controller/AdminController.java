package com.store.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.store.entity.Users;
import com.store.service.AdminService;

@Controller
@RequestMapping("admin/")
public class AdminController {
	@Autowired
	private AdminService adminService;
	
	/**
	 * ��ת����ӹ���Աҳ��
	 * */
	@RequestMapping("insertAdmin")
	public String insertAdmin(){
		return "admin/user/insertadministrator";
	}
	
	/**
	 * �����֤
	 * */
	@RequestMapping("namecheck")
	public String getNameCheck(String name){
		boolean flag = adminService.getNameCheck(name);
		String date = null;
		if(flag==false){
			date = "false";
		}else{
			date = "true";
		}
		return date;
	}
	
	/**
	 * ��ӹ���Ա
	 * */
	@RequestMapping("insertadmin")
	public ModelAndView insertadmin(String name,String password,String pwd,String authority){
		ModelAndView modelAndView = new ModelAndView("admin/msg");
		boolean flag = adminService.getInsertToAdmin(name,password,authority);
		if(flag){
			if(password.equals(pwd)){
				modelAndView.addObject("msg", "��ӳɹ�");
				modelAndView.addObject("eng", "Congratulations on your success");
				return modelAndView;
			}else{
				modelAndView.addObject("msg", "�Բ������ʧ�ܣ���鿴�����Ƿ���дһ��");
				modelAndView.addObject("eng", "Sorry, add a failure, please check whether the password is filled in");
				return modelAndView;
			}
		}
		modelAndView.addObject("msg", "�Բ������ʧ�ܣ���鿴��ӵ��û����Ƿ�����������ϵά����Ա");
		modelAndView.addObject("eng", "Sorry, add a failure, please see if the added username is renamed or contact the service person");
		return modelAndView;
	}
	
	/**
	 * �˳���¼
	 * */
	@RequestMapping("loginout")
	public String LoginOut(HttpSession session){
		session.removeAttribute("name");
		return "admin/login";
	}
	
	/**
	 * ת����ҳ
	 * */
	@RequestMapping("index")
	public String Index(){
		return "admin/action";
	}
	
	/**
	 * ת����¼
	 * */
	@RequestMapping("login")
	public String login(){
		
		return "admin/login";
	}
	
	/**
	 * ��֤��¼
	 * */
	@RequestMapping("loginCheck")
	public ModelAndView loginCheck(HttpSession session,String name,String password){
		ModelAndView modelAndView;
		boolean flag = adminService.isLogin(name,password);
		if(flag==true){
			session.setAttribute("name",name);
			modelAndView = new ModelAndView("redirect:index");
			return modelAndView;
		}
		modelAndView = new ModelAndView("admin/login");
		modelAndView.addObject("msg", "true");
		return modelAndView;
	}
	
	/**
	 * �鿴ע���Ա��Ϣ
	 * */
	@RequestMapping("activatedUsers")
	public ModelAndView getActivatedUser(int ustate,int pageNumber,int pageSize){
		ModelAndView modelAndView = new ModelAndView("admin/user/ActivatedUsers");
		if(pageNumber==0){
			pageNumber=1;
		}
		List<Users> list = adminService.getListUsers(ustate,pageNumber,pageSize);
		int count = adminService.getLengthToList(ustate);
		if(count==0){
			modelAndView = new ModelAndView("admin/msg");
			modelAndView.addObject("msg", "�����û����Ѽ����ʱ��û��δ����Ļ�Ա");
			modelAndView.addObject("eng", "All users are active and have no active members yet");
			return modelAndView;
		}
		int page=1;
		if(count%pageSize==0){
			page = count/pageSize;
		}else{
			page = (count/pageSize)+1;
		}
		int pagePrevious = pageNumber-1;
		//�жϵ�ǰҳ���Ƿ�Ϊ��һҳ
		if(pagePrevious <= 0){
			pagePrevious = 1;
		}
		
		int pageNext = pageNumber+1;
		//�жϵ�ǰҳ���Ƿ�Ϊ���һҳ
		if(pageNext > page){
			pageNext = page;
		}
		modelAndView.addObject("list", list);
		ModelMap modelMap = new ModelMap();
		modelMap.put("page", page);
		modelMap.put("ustate",ustate);
		modelMap.put("count",count);
		modelMap.put("list",list);
		modelMap.put("pageSize",pageSize);
		modelMap.put("pagePrevious",pagePrevious);
		modelMap.put("pageNext",pageNext);
		modelAndView.addAllObjects(modelMap);
		return modelAndView;
	}
	
	@RequestMapping("notactivatedUsers")
	public ModelAndView getNotActivatedUser(int ustate,int pageNumber,int pageSize){
		ModelAndView modelAndView = new ModelAndView("forward:activatedUsers");
		return modelAndView;
	}
	
	/**
	 * �����˻�
	 * @throws Exception 
	 * */
	@RequestMapping("updateusers")
	public ModelAndView getCodeByUsid(String usid) throws Exception{
		ModelAndView modelAndView = new ModelAndView("redirect:activatedUsers?ustate=1");
		adminService.getCodeByUsid(usid);
		adminService.getMailByUsid(usid);
		return modelAndView;
	}
	
	/**
	 * ���ͼ����ʼ�
	 * @throws Exception 
	 * */
	@RequestMapping("activatemail")
	public ModelAndView getToMailByUsid(String usid) throws Exception{
		ModelAndView modelAndView = new ModelAndView("redirect:activatedUsers?ustate=0");
		adminService.getMailByUsid(usid);
		return modelAndView;
	}
}
