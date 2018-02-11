package com.wyb.serialize;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class ObjectSeriaDemo2 {
	public static void main(String[] args) throws Exception {
		// ObjectOutputStream oos = new ObjectOutputStream(new
		// FileOutputStream("demo/obj1.dat"));
		// Foo2 foo2 = new Foo2();
		// oos.writeObject(foo2);
		// oos.flush();
		// oos.close();
		//
		// // �����л��Ƿ�ݹ���ø���Ĺ��캯��
		// ObjectInputStream ois = new ObjectInputStream(new
		// FileInputStream("demo/obj1.dat"));
		// Foo2 foo21 = (Foo2) ois.readObject();
		// System.out.println(foo21);
		// ois.close();

		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("demo/obj1.dat"));
		Bar2 bar2 = new Bar2();
		oos.writeObject(bar2);
		oos.flush();
		oos.close();

		// �����л��Ƿ�ݹ���ø���Ĺ��캯��
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("demo/obj1.dat"));
		Bar2 bar21 = (Bar2) ois.readObject();
		System.out.println(bar21);
		ois.close();

		/*
		 * �����������з����л�����ʱ, ����丸��û��ʵ�����л��ӿ�, ��ô�丸��Ĺ��캯���ᱻ����
		 */
	}
}

/*
 * һ����ʵ�������л��ӿ�,��ô�����඼���Խ������л�
 */
class Foo implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Foo() {
		System.out.println("foo...");
	}
}

class Foo1 extends Foo {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Foo1() {
		System.out.println("foo1...");
	}
}

class Foo2 extends Foo1 {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Foo2() {
		System.out.println("foo2...");
	}
}

class Bar {
	public Bar() {
		System.out.println("bar...");
	}
}

class Bar1 extends Bar implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Bar1() {
		System.out.println("bar1...");
	}
}

class Bar2 extends Bar1 {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Bar2() {
		System.out.println("bar2...");
	}
}