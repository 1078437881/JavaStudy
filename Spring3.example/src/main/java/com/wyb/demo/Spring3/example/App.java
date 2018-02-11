package com.wyb.demo.Spring3.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wyb.demo.helloworld.HelloWorld;
import com.wyb.demo.lossely_coupled.OutputHelper;

/**
 * Hello world!
 *
 */
public class App {

	private static ApplicationContext context;

	public static void main(String[] args) {

//		context = new ClassPathXmlApplicationContext("SpringBeans.xml");
//
//		HelloWorld obj = (HelloWorld) context.getBean("helloBean");
//		obj.printHello();

		context = new ClassPathXmlApplicationContext(new String[] { "Spring-Output.xml" });
		OutputHelper output = (OutputHelper) context.getBean("OutputHelper");
		output.generateOutput();
	}
}
