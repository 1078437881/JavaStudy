package com.wyb.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutDemo {

	public static void main(String[] args) throws IOException {
		// 如果该文件不存在,则直接创建,如果存在,在原来的文件里追加
		// FileOutputStream out = new FileOutputStream("demo/out.dat",true);
		// 如果该文件不存在,则直接创建,如果存在,删除后创建
		FileOutputStream out = new FileOutputStream("demo/out.dat");
		out.write('A');// 写出了'A'的低八位
		out.write('B');// 写出了'B'的低八位
		int a = 10;// write只能写八位,写入一个int需要写4次
		out.write(a >>> 24);
		out.write(a >>> 16);
		out.write(a >>> 8);
		out.write(a);
		byte[] gbk = "中国".getBytes("gbk");
		out.write(gbk);
		out.close();

		IOUtil.printHex("demo/out.dat");
	}

	/**
	 * 文件拷贝,字节批量读取
	 * @param srcFile
	 * @param destFile
	 * @throws IOException
	 */
	public static void copyFile(File srcFile, File destFile) throws IOException {
		if (!srcFile.exists()) {
			throw new IllegalArgumentException("文件:" + srcFile + "不存在");
		}
		if (!srcFile.isFile()) {
			throw new IllegalArgumentException(srcFile + "不是文件");
		}
		FileInputStream in = new FileInputStream(srcFile);
		FileOutputStream out = new FileOutputStream(destFile);
		byte[] buf = new byte[8 * 1024];
		int b;
		while ((b = in.read(buf, 0, buf.length)) != -1) {
			out.write(buf, 0, b);
			out.flush();
		}
		in.close();
		out.close();
	}

	/**
	 * 利用带缓冲的字节流进行文件拷贝
	 * 
	 * @param srcFile
	 * @param destFile
	 * @throws IOException
	 */
	public static void copyFileByBuffer(File srcFile, File destFile) throws IOException {
		if (!srcFile.exists()) {
			throw new IllegalArgumentException("文件:" + srcFile + "不存在");
		}
		if (!srcFile.isFile()) {
			throw new IllegalArgumentException(srcFile + "不是文件");
		}
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(srcFile));
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destFile));

		int c;
		while ((c = bis.read()) != -1) {
			bos.write(c);
			bos.flush();// 刷新缓冲区
		}
		bis.close();
		bos.close();
	}
	/**
	 * 单字节不带缓冲进行文件拷贝
	 * @param srcFile
	 * @param destFile
	 * @throws IOException
	 */
	public static void copyFileByByte(File srcFile, File destFile) throws IOException {
		if (!srcFile.exists()) {
			throw new IllegalArgumentException("文件:" + srcFile + "不存在");
		}
		if (!srcFile.isFile()) {
			throw new IllegalArgumentException(srcFile + "不是文件");
		}
		FileInputStream in = new FileInputStream(srcFile);
		FileOutputStream out = new FileOutputStream(destFile);
		int c;
		while((c=in.read())!=-1){
			out.write(c);
			out.flush();
		}
		in.close();
		out.close();
	}
}
