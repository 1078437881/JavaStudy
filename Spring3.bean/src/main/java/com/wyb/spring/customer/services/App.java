package com.wyb.spring.customer.services;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	private static ApplicationContext context;

	public static void main(String[] args) {

		context = new ClassPathXmlApplicationContext(new String[] { "SpringservicesBeans.xml" });
		CustomerService CSA = (CustomerService) context.getBean("CustomerService");
		CSA.setMessage("Message by CSA");
		System.out.println("Message: " + CSA.getMessage());

		// retrieve it again
		CustomerService CSB = (CustomerService) context.getBean("CustomerService");
		System.out.println("Message: " + CSB.getMessage());
	}
}
