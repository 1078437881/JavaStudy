package com.wyb.java8;

import java.util.ArrayList;
import java.util.List;

/**
 * Lambda表达式:方法引用
 * 
 * Java 8中方法也是一种对象，可以通过名字来引用。不过方法引用的唯一用途是支持Lambda的简写，使用方法名称来表示Lambda。
 * 不能通过方法引用来获得诸如方法签名的相关信息。
 * 
 * 方法引用提供了一个很有用的语义来直接访问类或者实例的已经存在的方法或者构造方法。
 * 
 * 方法引用可以通过方法的名字来引用其本身。方法引用是通过::符号（双冒号）来描述的。
 * 
 * 它可以用来引用下列类型的方法：
 * 
 * 构造器引用。语法是Class::new，或者更一般的Class< T >::new，要求构造器方法是没有参数；
 * 
 * 静态方法引用。语法是Class::static_method，要求接受一个Class类型的参数；
 * 
 * 特定类的任意对象方法引用。它的语法是Class::method。要求方法是没有参数的；
 * 
 * 特定对象的方法引用，它的语法是instance::method。要求方法接受一个参数，与3不同的地方在于，3是在列表元素上分别调用方法，
 * 而4是在某个对象上调用方法，将列表元素作为参数传入；
 * 
 */
public class NewFeaturesTester2 {

	public static void main(String[] args) {
		List names = new ArrayList();
		names.add("Peter");
		names.add("Tom");
		names.add("Smith");
		names.add("Zack");
		names.add("Bob");
		names.add("Linda");
		names.add("Marry");
		names.forEach(System.out::println);
		
		for (Object  s : names) {
			System.out.println(s);
		}
	}

}
