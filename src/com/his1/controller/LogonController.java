package com.his1.controller;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.his1.pojo.User;
import com.his1.service.LoginService;
/**
 * 
 * @Title:LogonController
 * @author hxiaope
 * @date 2016年10月21日下午7:13:45
 * @version 1.0
 */
@Controller
@RequestMapping(method={RequestMethod.POST,RequestMethod.GET})
public class LogonController {
	
	@Autowired
	private LoginService loginService;
	
	@RequestMapping("/login")
	public String login(User user,HttpSession session) throws Exception{
		
		User us=loginService.findUser(user.getUsername());
		if(us==null){
			return "login";
		}
		if(us.getPassword().equals(user.getPassword())){
				session.setAttribute("username", us.getUsername());
				return "redirect:queryPatient.action";		
		}
		return "login";
	
			
}
	/**
	 * 
	 * @param session
	 * @return 清除session，身份失效
	 * @throws Exception
	 */
	@RequestMapping("/logout")
	public String logout(HttpSession session) throws Exception{
		
		session.invalidate();
		
		return "redirect:login.action";
	}
	
	@RequestMapping("/register")
	public String register(User user,HttpSession session) throws  Exception{
		loginService.insertUsre(user);
		session.setAttribute("username", user.getUsername());
		return "redirect:queryPatient.action";
	}
}
