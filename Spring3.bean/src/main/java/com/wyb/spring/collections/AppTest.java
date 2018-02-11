package com.wyb.spring.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppTest {

	private static ApplicationContext context;
	
	public static void main(String[] args) {
		context =new ClassPathXmlApplicationContext("SpringCollections.xml");
		
		/*
		 * case 1:List
		 */
		Customer customer = (Customer) context.getBean("customerBean");
		System.out.println(customer.getLists().toString());
		System.out.println(customer.getSets().toString());
		System.out.println(customer.getMaps().toString());
		System.out.println(customer.getPros().toString());
	}
}
