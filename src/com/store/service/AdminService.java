package com.store.service;

import java.util.List;

import com.store.entity.Users;

public interface AdminService {

	boolean isLogin(String username, String password);

	List<Users> getListUsers(int ustate,int pageNumber,int pageSize);

	void getCodeByUsid(String usid);

	void getMailByUsid(String usid) throws Exception;

	boolean getInsertToAdmin(String name, String password, String authority);

	boolean getNameCheck(String name);

	int getLengthToList(int ustate);

}
