package com.wyb.shiyanlou;

public class CreateThread {

	public static void main(String[] args) {
		
		Thread1 thread1 = new Thread1();
		Thread thread2 = new Thread( new Thread2());
		
		
		thread1.start();
		thread2.start();
		
	}
	
	
	
	

}
class Thread1 extends Thread{

	@Override
	public void run() {
		
		//在run()方法中放入线程要完成的工作
        //这里我们把两个线程各自的工作设置为打印100次信息
		for(int i =0;i<100;i++){
			System.out.println("Hello! this is "+i);
		}
	}
}
class Thread2 implements Runnable{

	@Override
	public void run() {
		
		for(int i=0;i<100;i++){
			System.out.println("Thanks. There is "+i);
		}
	}
	
}