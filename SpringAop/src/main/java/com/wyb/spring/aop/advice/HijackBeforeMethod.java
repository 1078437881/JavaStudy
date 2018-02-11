package com.wyb.spring.aop.advice;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class HijackBeforeMethod implements MethodBeforeAdvice{

	public void before(Method arg0, Object[] args, Object target) throws Throwable {
		
		System.out.println("HijackBeforeMethod:Before method hijacked!");
	}

}
