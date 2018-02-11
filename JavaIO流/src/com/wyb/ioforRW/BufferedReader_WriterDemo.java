package com.wyb.ioforRW;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class BufferedReader_WriterDemo {
	public static void main(String[] args) throws IOException {
		// 对文件进行读写操作
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("E:/JavaIo/file.txt")));

		BufferedWriter bw = new BufferedWriter(
				new OutputStreamWriter(new FileOutputStream("E:/JavaIo/BufferWriter.txt")));

		PrintWriter pw = new PrintWriter("E:/JavaIo/PrintWriter.txt");
//		PrintWriter pw1 = new PrintWriter(OutputStream outputStream,boolean autoFlush)
		String line;
		while ((line = br.readLine()) != null) {
			System.out.println(line);// 一次读一行,不识别换行符
			bw.write(line);
			bw.newLine();// 单独写出换行操作
			bw.flush();

			pw.println(line);
			pw.flush();
		}
		br.close();
		bw.close();
		pw.close();
	}
}
