package com.wyb.serialize;

import java.io.Serializable;

public class Student implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String stuNo;
	private transient String stuName;
	// ��Ԫ�ز������jvmĬ�ϵ����л�,Ҳ�����Լ�������Ԫ�ص����л�
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
		s.defaultWriteObject();// ��jvm��Ĭ�����л���Ԫ�ؽ������л�����
		s.writeObject(stuName);
		s.writeObject(stuAge);// �Լ����stuAge�����л�
	}

	private void readObject(java.io.ObjectInputStream s) throws java.io.IOException, ClassNotFoundException {
		s.defaultReadObject();// ��jvm��Ĭ�Ϸ����л���Ԫ�ؽ��з����л�����
		this.stuName = (String) s.readObject();
		this.stuAge = (String) s.readObject();// �Լ����stuAge�ķ����л�
		
	}
}
