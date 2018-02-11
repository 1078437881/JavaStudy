package com.wyb.reflect;

public class ClassDemo3 {
	public static void main(String[] args) {
		String s = "hello";
		ClassUtil.printClassMessage(s);
		Integer i = 1;
		ClassUtil.printFieldMessage(s);
		
		ClassUtil.printConMessage("hello");
	}
	

}
