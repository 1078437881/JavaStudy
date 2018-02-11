package com.annotation.userdefined;

//@Represent("I'm class annotation")

//继承只会继承类上的注解,而方法上的注解不会被继承
public class ChildTest extends PersonC{

	@Represent("I'am method annotation")
	@Override
	public String name() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int age() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void sing() {
		// TODO Auto-generated method stub
		
	}

}
