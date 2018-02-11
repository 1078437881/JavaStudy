package com.annotation.userdefined;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


/*
 * CONSTRUCTOR构造方法声明
 * FIELD字段声明
 * LOCAL_VARIABLE局部变量声明
 * METHOD方法声明
 * PACKAGE包声明
 * PARAMETER参数声明
 * TYPE类接口
 */
@Target({ElementType.METHOD,ElementType.TYPE})//注解可使用在方法(METHOD)和类(TYPE)上

/*
 * SOURCE只在源码显示,编译时会丢弃;
 * CLASS编译时会记录到class中,运行时忽略
 * RUNTIME运行时存在,可以通过反射读取
 */
@Retention(RetentionPolicy.RUNTIME)

/*
 *允许子类继承
 */
@Inherited

/*
 * 生成javadoc时会包含注解
 */
@Documented
public @interface Description {

	String desc();
	
	String author();
	
	int age() default 18;
}
