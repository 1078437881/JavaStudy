package com.wyb.spring.aop.advice;

public class CustomerService {

	private String name;
	private String url;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	
	public void pringName(){
		System.out.println("Customer name:"+this.name);
	}
	
	public void printURL(){
		System.out.println("Customer website:"+this.url);
	}
	
	public void printThrowException(){
		throw new IllegalArgumentException();
	}
}
