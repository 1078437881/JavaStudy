package com.wyb.ioforRW;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class IsRAndOsWDemo {
	public static void main(String[] args) {

		try {
			outputW_And_InputR();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void outputW_And_InputR() throws IOException {

		FileInputStream in = new FileInputStream("E:/JavaIo/file.txt");
		InputStreamReader isr = new InputStreamReader(in, "gbk");// 默认项目的编码

		FileOutputStream out = new FileOutputStream("E:/JavaIo/outputWriter.txt");
		OutputStreamWriter osw = new OutputStreamWriter(out, "gbk");
		// int c;
		// while((c=isr.read())!=-1){
		// System.out.print((char)c);
		// }

		char[] buffer = new char[8 * 1024];
		int c;
		// 批量读取,放入buffer这个字符数组,从第0个位置开始放置,最多放吧buffer.length
		// 返回的是对到的字符个数
		while ((c = isr.read(buffer, 0, buffer.length)) != -1) {
			String s = new String(buffer, 0, c);
			System.out.print(s);
			osw.write(buffer, 0, c);
			osw.flush();
		}
		isr.close();
		osw.close();
	}
}
