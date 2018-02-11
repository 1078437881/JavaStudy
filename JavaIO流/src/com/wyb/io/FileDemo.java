package com.wyb.io;

import java.io.File;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) {
		// File file = new File("E:\\JavaIo\\file");
		File file = new File("E:/JavaIo/file");
		System.out.println(file.exists());
		if (!file.exists()) {
			file.mkdirs();
		} else {
			file.delete();
		}
		// 是否是一个目录
		System.out.println(file.isDirectory());
		// 是否是一个文件
		System.out.println(file.isFile());

		// File file2 = new File("e:/JavaIo/你是猪x1.txt");
		File file2 = new File("e:/JavaIo", "你是猪x1.txt");
		if (!file2.exists()) {
			try {
				file2.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			file2.delete();
		}
		//常用的File对象的API
		System.out.println(file);//file.toString内容
		System.out.println(file.getAbsolutePath());
		System.out.println(file.getName());
		System.out.println(file2.getName());
		
		System.out.println(file.getParent());
		
	}
}
