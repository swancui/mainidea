package com.store.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.store.entity.Admin;
import com.store.entity.Users;

public interface AdminDao {

	Admin getAdminByName(String name);

	List<Users> getActivatedUsers(@Param("ustate")int ustate, @Param("pageSize")int pageSize, @Param("actionPage")int actionPage);

	void getCodeByUsid(@Param("ustate")int ustate, @Param("code")String code,@Param("usid")String usid);

	Users getUserByUsid(String usid);

	int getInsert(@Param("aid")String aid, @Param("name")String name, @Param("password")String password, @Param("authority")String authority);

	int findName(String name);

	int getLengthToListUser(int ustate);

}
