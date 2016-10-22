package com.his1.mapper;

import com.his1.pojo.User;
/**
 * 
 * @Title:UserMapper
 * @author hxiaope
 * @date 2016年10月21日下午7:40:45
 * @version 1.0
 */
public interface UserMapper {
	User findUser(String username);
	
	int updateUserById(User user);
	
	int insertUser(User user);
}
