package com.wyb.demo.Spring3.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
	
	private static ApplicationContext context;
    public static void main( String[] args )
    {
    	
    	context = new ClassPathXmlApplicationContext("SpringBeans.xml");
        System.out.println( "Hello World!" );
        FileNameGenerator obj = (FileNameGenerator) context.getBean("FileNameGenerator");
        obj.printFileName();
    }
}
