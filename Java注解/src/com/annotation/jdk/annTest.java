package com.annotation.jdk;

public class annTest {

	@SuppressWarnings("deprecation")
	public void sing() {
		Person p = new Child();
		p.sing();
	}
}
