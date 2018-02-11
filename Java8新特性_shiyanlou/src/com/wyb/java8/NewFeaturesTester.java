package com.wyb.java8;

/**
 * Lambda表达式:表达式
 * 
 * 一个Lambda表达式具有下面这样的语法特征。它由三个部分组成：第一部分为一个括号内用逗号分隔的参数列表，参数即函数式接口里面方法的参数；
 * 第二部分为一个箭头符号：->；第三部分为方法体，可以是表达式和代码块
 */
public class NewFeaturesTester {

	public static void main(String[] args) {
		NewFeaturesTester tester = new NewFeaturesTester();
		//
		MathOperation addition = (int a, int b) -> a + b;

		MathOperation subtraction = (a, b) -> a - b;

		MathOperation multiplication = (int a, int b) -> {
			return a * b;
		};

		MathOperation division = (int a, int b) -> a / b;

		// 输出结果
		System.out.println("10 + 5 = " + tester.operate(100, 2, addition));
		System.out.println("10 - 5 = " + tester.operate(100, 2, subtraction));
		System.out.println("10 x 5 = " + tester.operate(100, 2, multiplication));
		System.out.println("10 / 5 = " + tester.operate(100, 2, division));

		// 没有括号的表达式
		GreetingService greetService1 = message -> System.out.println("Hello " + message);

		// 有括号的表达式
		GreetingService greetService2 = (message) -> System.out.println("Hello " + message);

		// 调用sayMessage方法输出结果
		greetService1.sayMessage("Shiyanlou");
		greetService2.sayMessage("Classmate");
	}

	interface MathOperation {
		int operation(int a, int b);
	}

	interface GreetingService {
		void sayMessage(String message);
	}

	private int operate(int a, int b, MathOperation mathOperation) {
		return mathOperation.operation(a, b);
	}
}
