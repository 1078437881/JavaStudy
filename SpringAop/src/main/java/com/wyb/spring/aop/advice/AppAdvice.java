package com.wyb.spring.aop.advice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppAdvice {

	public static void main(String[] args) {

		ApplicationContext appContext = new ClassPathXmlApplicationContext("SpringAOPAdvice.xml");

		CustomerService cust = (CustomerService) appContext.getBean("customerServiceProxy");

		System.out.println("使用Spring AOP 如下");
		System.out.println("********************");
		cust.pringName();
		System.out.println("********************");
		cust.printURL();
		System.out.println("********************");
		try {
			cust.printThrowException();
		} catch (Exception e) {
			// TODO: handle exception
		}

	}
}
