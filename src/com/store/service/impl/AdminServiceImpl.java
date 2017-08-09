package com.store.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.store.dao.AdminDao;
import com.store.entity.Admin;
import com.store.entity.Users;
import com.store.service.AdminService;
import com.store.utils.Constant;
import com.store.utils.MailUtil;
import com.store.utils.UUIDUtil;

@Service
public class AdminServiceImpl implements AdminService {
	@Autowired
	private AdminDao adminDao;
	
	@Override
	public boolean isLogin(String name, String password) {
		Admin admin = adminDao.getAdminByName(name);
		if(admin!=null){
			if(admin.getPassword().equals(password)){
				return true;
			}else{
				return false;
			}
		}else{
			return false;
		}
	}

	@Override
	public List<Users> getListUsers(int ustate,int pageNumber,int pageSize) {
		int pageSizes = pageNumber*pageSize;		//最后一条的数据
		int actionPage = (pageNumber-1)*pageSize;	//开始的数据
		return adminDao.getActivatedUsers(ustate, pageSizes,actionPage);
	}

	@Override
	public void getCodeByUsid(String usid) {
		adminDao.getCodeByUsid(Constant.NOT_STATE,UUIDUtil.getUUID(),usid);
	}

	@Override
	public void getMailByUsid(String usid) throws Exception {
		Users users = adminDao.getUserByUsid(usid);
		MailUtil.sendMail(Constant.FROMMAIL, Constant.USERMAIL, Constant.PASSWORDMAIL,
				users.getEmail(), Constant.MAILTITLE,
				"请点击下面的按钮，进行账号激活<br/><a href='http://localhost/Store/actionCode?username="+users.getUsername()+"&code="+users.getCode()+"'>点击激活</a>");
	}

	@Override
	public boolean getInsertToAdmin(String name, String password, String authority) {
		String aid = UUIDUtil.getUUID();
		int b = adminDao.findName(name);
		boolean flag = false;
		if(b==0){
			int a = adminDao.getInsert(aid,name,password,authority);
			if(a>0){
				flag = true;
			}else{
				flag = false;
			}
		}else{
			flag = false;
		}
		
		return flag;
	}

	@Override
	public boolean getNameCheck(String name) {
		int a = adminDao.findName(name);
		boolean flag = false;
		if(a>0){
			flag = true;
		}
		return flag;
	}

	@Override
	public int getLengthToList(int ustate) {
		// TODO Auto-generated method stub
		return adminDao.getLengthToListUser(ustate);
	}

}
