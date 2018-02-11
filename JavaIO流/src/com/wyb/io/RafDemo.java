package com.wyb.io;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;

public class RafDemo {
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args)throws IOException {
		File demo = new File("demo");
		if(!demo.exists()){
			demo.mkdirs();
		}
		File file = new File(demo,"raf.dat");
		if(!file.exists()){
			file.createNewFile();
		}
		RandomAccessFile raf= new RandomAccessFile(file, "rw");
		//指针的位置
		System.out.println(raf.getFilePointer());
		
		raf.write('A');
		System.out.println(raf.getFilePointer());
		raf.write('b');
		System.out.println(raf.getFilePointer());
		int i = 0x7fffffff;
		//用write方法每次只写一个字节,如果把i写进去就得写4次
		raf.write(i>>>24);//高8位
		raf.write(i>>>16);
		raf.write(i>>>8);
		raf.write(i);
		System.out.println(raf.getFilePointer());
		
		//可以直接写一个int
		raf.writeInt(i);
		
		String s = "中";
		byte[] gbk = s.getBytes("gbk");
		raf.write(gbk);
		System.out.println(raf.length());
		
		//读文件,必需把指针移动到头部
		raf.seek(0);
		//一次性读取,把文件中的内容读到字节数组中
		byte[] buf = new byte[(int)raf.length()];
		raf.read(buf);
		System.out.println(Arrays.toString(buf));
		for(byte b: buf){
			System.out.println(Integer.toHexString(b & 0xff)+" ");
		}
		raf.close();
	}
}
