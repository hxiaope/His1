package com.his1.service.implement;

import org.springframework.beans.factory.annotation.Autowired;

import com.his1.mapper.UserMapper;
import com.his1.pojo.User;
import com.his1.service.LoginService;

public class LoginServiceImplement implements LoginService {
	@Autowired
	private UserMapper userMapper;

	@Override
	public User findUser(String str) throws Exception {
		
		return userMapper.findUser(str);
	}

	@Override
	public void updateUserById(User user) throws Exception {
		
		userMapper.updateUserById(user);
	}

	@Override
	public void insertUsre(User user) throws Exception {
		userMapper.insertUser(user);
	}
	
}
