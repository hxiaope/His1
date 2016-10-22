package com.his1.pojo;
/**
 * 
 * @Title:User
 * @author hxiaope
 * @date 2016年10月21日上午10:59:50
 * @version 1.0
 */
public class User {
	private Integer id;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	private String username;
	private String password;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
