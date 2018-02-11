package com.annotation.userdefined;

@Represent("I'm class annotation for extends")
public class PersonC {
	public String name() {
		return null;

	}

	@Represent("I'm method annotation for extends")
	public int age() {
		return 0;
	}

	@Deprecated // 方法过时
	public void sing() {
	}
}
