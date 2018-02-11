package com.users.dao;

import com.users.Users;

//用户的业务逻辑类
public class UserDao {

	// 用户登录判定

	String[] username = { "wyb", "张三", "李四", "admin" };
	String[] password = { "123", "888", "123456", "admin" };

	public boolean usersLogin(Users user) {

		boolean judge = false;
		for (int i = 0; i < username.length && i < password.length; i++) {

			if (user.getUsername().equals(username[i]) && user.getPassword().equals(password[i])) {
				judge = true;
			}
		}
		return judge;

	}
}
