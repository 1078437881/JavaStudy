package com.wyb.spring.aop.advice;

import org.springframework.aop.ThrowsAdvice;

public class HijackTHrowExceptionMethod implements ThrowsAdvice{

	public void afterThrowing(IllegalArgumentException e)throws Throwable{
		
		System.out.println("HijackThrowException : Throw exception hijacked!");
	}
}
