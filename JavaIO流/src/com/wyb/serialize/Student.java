package com.wyb.serialize;

import java.io.Serializable;

public class Student implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String stuNo;
	private transient String stuName;
	// 该元素不会进行jvm默认的序列化,也可以自己完成这个元素的序列化
	private transient String stuAge;

	public Student() {

	}

	public Student(String stuNo, String stuName, String stuAge) {
		super();
		this.stuNo = stuNo;
		this.stuName = stuName;
		this.stuAge = stuAge;
	}

	public String getStuNo() {
		return stuNo;
	}

	public void setStuNo(String stuNo) {
		this.stuNo = stuNo;
	}

	public String getStuName() {
		return stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public String getStuAge() {
		return stuAge;
	}

	public void setStuAge(String stuAge) {
		this.stuAge = stuAge;
	}

	@Override
	public String toString() {
		return "Student [stuNo=" + stuNo + ", stuName=" + stuName + ", stuAge=" + stuAge + "]";
	}

	private void writeObject(java.io.ObjectOutputStream s) throws java.io.IOException {
		s.defaultWriteObject();// 把jvm能默认序列化的元素进行序列化操作
		s.writeObject(stuName);
		s.writeObject(stuAge);// 自己完成stuAge的序列化
	}

	private void readObject(java.io.ObjectInputStream s) throws java.io.IOException, ClassNotFoundException {
		s.defaultReadObject();// 把jvm能默认反序列化的元素进行反序列化操作
		this.stuName = (String) s.readObject();
		this.stuAge = (String) s.readObject();// 自己完成stuAge的反序列化
		
	}
}
