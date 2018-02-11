package com.wyb.io;

import java.io.File;
import java.io.IOException;

//列出File的一些床用操作比如过滤、遍历等操作
public class FileUtils {

	/**
	 * 列出制定目录下(包括其子目录)的所有文件
	 * 
	 * @param dir
	 * @throws IOException
	 */
	public static void listDirectory(File dir) throws IOException {

		if (!dir.exists()) {
			throw new IllegalArgumentException("目录:" + dir + "不存在");
		}
		if (!dir.isDirectory()) {
			throw new IllegalArgumentException(dir + "不是目录");
		}
		// String[] filenames = dir.list();
		// for (String s : filenames) {
		// System.out.println(s);
		// }
		File[] files = dir.listFiles();
		if(files!=null&&files.length>0){
			for(File file:files){
				if(file.isDirectory()){
					listDirectory(file);//递归操作
				}else{
					System.out.println(file);
				}
			}
		}
		

	}

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			FileUtils.listDirectory(new File("F:/"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
