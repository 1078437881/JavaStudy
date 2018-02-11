package com.annotation.jdk;

import com.annotation.userdefined.Represent;

@Represent("I'm class annotation")
public interface Person {
	public String name();

	@Represent("I'm method annotation")
	public int age();

	@Deprecated // 方法过时
	public void sing();
}
