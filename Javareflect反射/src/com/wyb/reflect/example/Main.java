package com.wyb.reflect.example;

public class Main {
	public static void main(String[] args) {
		Test t1 = new Test();
		Test t2 = new Test("小狗", "小白", "小明");
//		t2.setNumber(1, "雷莉米亚");
		Test.setNumber(1, "雷莉米亚");
		long t = System.currentTimeMillis();
		ReflectUtils.clone(t1, t2);
		t=t-System.currentTimeMillis();
		System.out.println(t);
		System.out.println(t1);
		System.out.println(t2);
	}
}
