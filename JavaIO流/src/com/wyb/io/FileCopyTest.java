package com.wyb.io;

import java.io.File;
import java.io.IOException;

public class FileCopyTest {
	public static void main(String[] args) {

		try {
			long start1 = System.currentTimeMillis();
			FileOutDemo.copyFile(new File("E:/JavaIo/XmlAnalyze,xml解析.zip"), new File("E:/JavaIo/1.zip"));
			
			long end1 = System.currentTimeMillis();
			System.out.println(end1-start1);
			long start2 = System.currentTimeMillis();
			FileOutDemo.copyFileByBuffer(new File("E:/JavaIo/XmlAnalyze,xml解析.zip"), new File("E:/JavaIo/2.zip"));
			long end2 = System.currentTimeMillis();
			System.out.println(end2-start2);
			long start3 = System.currentTimeMillis();
			FileOutDemo.copyFileByByte(new File("E:/JavaIo/XmlAnalyze,xml解析.zip"), new File("E:/JavaIo/3.zip"));
			long end3 = System.currentTimeMillis();
			System.out.println(end3-start3);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
