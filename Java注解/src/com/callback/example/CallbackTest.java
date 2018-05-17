package com.callback.example;

public class CallbackTest {

	public static void main(String[] args) {
		Student student = new Tome();
		Teacher teacher = new Teacher(student);
		
		teacher.askQuestion();
	}
}
