package com.his1.service;

import com.his1.pojo.User;

/**
 * 
 * @Title:LoginService
 * @author hxiaope
 * @date 2016年10月21日下午7:45:53
 * @version 1.0
 */
public interface LoginService {
	public  User findUser(String str) throws Exception;
	
	public  void updateUserById(User user) throws Exception;
	
	public void insertUsre(User user) throws Exception;
}
