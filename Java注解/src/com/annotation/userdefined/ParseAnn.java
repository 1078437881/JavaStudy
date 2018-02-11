package com.annotation.userdefined;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class ParseAnn {
	public static void main(String[] args) {
		// 1.使用类加载器加载类
		try {
			Class c = Class.forName("com.annotation.userdefined.ChildTest");

			// 2.找到类上面的注解
			boolean isExist = c.isAnnotationPresent(Represent.class);
			if (isExist) {
			//3.拿到注解实例
				Represent p = (Represent) c.getAnnotation(Represent.class);
				System.out.println(p.value());
			}
			//4.找到方法上的注解
			Method[] ms= c.getMethods();
			for(Method m:ms){
				boolean isMExist = m.isAnnotationPresent(Represent.class);
				if(isMExist){
					Represent p = (Represent) m.getAnnotation(Represent.class);
					System.out.println(p.value());
				}
			}
			//另一种解析方法
			for(Method m:ms){
				Annotation[] as = m.getAnnotations();
				for(Annotation a:as){
					if(a instanceof Represent){
						Represent r = (Represent) a;
						System.out.println(r.value());
					}
				}
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
