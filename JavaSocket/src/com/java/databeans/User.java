package com.java.databeans;

import java.io.Serializable;

public class User implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3610875123600813926L;
	
	private int id;
	private int age;
	private String name;
	private String password;
	
	
	public User(int id,int age,String name,String password) {
		this.id = id;
		this.age = age;
		this.name = name;
		this.password = password;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "User[ id="+id+" name="+name+" password="+password+ " age="+age+"]";
	}

}
