package com.wyb.reflect;

public class ClassDemo1 {
	public static void main(String[] args) {
		//Foo的实例对象如何表示
		Foo foo1 = new Foo();
		//Foo也是Class类的实例对象
		//任意类都是Class类的实例对象,这个实例对象有三种表示方式
		
		//1:-->实例在告诉我们任何一个类都有一个隐含的静态变量
		Class c1 = Foo.class;
		//2: 已知该对的对象那个,通过getClass方法
		Class c2 = foo1.getClass();
		//官网c1,c2便是了Foo类的类类型(class type)
		/*万事万皆对象,
		 * 类也是对象,是Class的实例对象
		 * 这个对象我们称为该类的类类型
		 * */
		
		/*不管c1 或者 c2 都代表了Foo类的类类型,一个类只可能
		 * 是Class的一个实例对象
		 */
		System.out.println(c1==c2);
		
		//3:
		Class c3 = null;
		try {
			c3 = Class.forName("com.wyb.reflect.Foo");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(c2==c3);
		
		//我们可以通过类的类类型创建该类的对象实例
		//-->通过c1/c2/c3创建Foo的实例对象
		try {
			Foo foo = (Foo) c1.newInstance();//需要有无参数的构造方法
			foo.print();
		} catch (InstantiationException | IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
class Foo{
	
	void print(){
		System.out.println("foo");
	}
}