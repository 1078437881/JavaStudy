package com.wyb.serialize;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectSeriDemo {

	public static void main(String[] args) {

		String file = "demo/obj.dat";
		try {
			Serialization(file);
			Deserialization(file);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private static void Serialization(String file) throws Exception {
		// 1.对象的序列化
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
		Student stu = new Student("10001", "张三", "20");
		oos.writeObject(stu);
		oos.flush();
		oos.close();
	}

	private static void Deserialization(String file) throws Exception {
		//2.反序列化
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
		Student stu = (Student) ois.readObject();
		System.out.println(stu);
		ois.close();
	}
}
