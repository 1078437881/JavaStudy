package com.wyb.reflect.example;

public class Test {
	public static int number;
	private static String name;
	public String like;
	private String what;
	protected String mine;

	public Test() {

	}

	public Test(String like, String what, String mine) {
		this.like = like;
		this.setWhat(what);
		this.mine = mine;
	}

	public static void setNumber(int num, String na) {
		number = num;
		setName(na);
	}

	public String getWhat() {
		return what;
	}

	public void setWhat(String what) {
		this.what = what;
	}

	public static String getName() {
		return name;
	}

	public static void setName(String name) {
		Test.name = name;
	}

	@Override
	public String toString() {
		return "number:" + number + "name:" + name + "like:" + like + "what:" + what + "mine:" + mine;
	}
}
