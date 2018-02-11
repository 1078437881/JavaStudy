package com.users;

public class Users {
	/*
	 * 用户类
	 */
	private String username;//用户名
	private String password;//密码
	public String getUsername() {
		return username;
	}
	
	//保留此默认的构造方法
	public Users(){
		
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
