package com.wyb.java8;

/**
 * Lambda表达式:作用域
 * 
 * 一个Lambda表达式具有下面这样的语法特征。它由三个部分组成：第一部分为一个括号内用逗号分隔的参数列表，参数即函数式接口里面方法的参数；
 * 第二部分为一个箭头符号：->；第三部分为方法体，可以是表达式和代码块
 */
public class NewFeaturesTester1 {

	final static String salutation = "hello";
	//static String salutation1 = "Hello";
	String salutation2 = "hello";
	final String salutation3 = "Hello";
	
	public static void main(String[] args) {
		String salutation  = "wwwwww";//隐性为final,不可再次赋值;
//		salutation = "sss";
//		System.out.println(salutation);
		GreetingService greetService1 = message->
		System.out.println(salutation +message);
		greetService1.sayMessage("Shiyanlou");
		
	}
	
	interface GreetingService{
		void sayMessage(String message);
	}
}
