package com.callback.example;

public class Teacher {

	private Student student;

	public Teacher(Student student) {
		this.student = student;
	}

	public void askQuestion() {
		student.resolveQuestion(new Callback() {

			@Override
			public void tellAnswer(String answer) {
				// TODO Auto-generated method stub
				System.out.println("知道了,你的答案是" + answer);
			}
		});
	}
}
