package com.wyb.io;

import java.io.FileInputStream;
import java.io.IOException;

public class IOUtil {
	/**
	 * 读取指定的文件内容,按照16进制输出到控制台 并且每输出10个byte换行
	 * 
	 * @param fileName
	 */
	public static void printHex(String fileName) throws IOException {
		FileInputStream in = new FileInputStream(fileName);
		int b;
		int i = 0;
		while ((b = in.read()) != -1) {
			if (i++ % 10 == 0) {
				System.out.println();
			}
			if (b <= 0xf)
				System.out.print("0");
			System.out.print(Integer.toHexString(b & 0xff) + " ");
		}
		in.close();
	}

	public static void printHexByByteArray(String fileName) throws IOException {
		FileInputStream in = new FileInputStream(fileName);
		byte[] buf = new byte[20 * 1024];

		// 从in中批量读取字节,放入到buf这个字节数组中,
		// 最多放,buf.length个,返回的是读到的字节的个数
//		int bytes = in.read(buf, 0, buf.length);// 一次性读完,说明字节数组足够大
//		int j = 0;
//		for (int i = 0; i < bytes; i++) {
//			if (j++ % 10 == 0) {
//				System.out.println();
//			}
//			if ((buf[i] & 0xff) <= 0xf) {
//				System.out.print("0");
//			}
//			System.out.print(Integer.toHexString(buf[i] & 0xff) + " ");
//		}

		int bytes = 0;
		int j = 0;
		while ((bytes = in.read(buf, 0, buf.length)) != -1) {
			for (int i = 0; i < bytes; i++) {
				if (j++ % 10 == 0) {
					System.out.println();
				}
				if ((buf[i] & 0xff) <= 0xf) {
					System.out.print("0");
				}
				System.out.print(Integer.toHexString(buf[i] & 0xff) + " ");
			}
		}
		in.close();
	}

	public static void main(String[] args) {
		try {
			IOUtil.printHexByByteArray("E:/JavaIo/FileUtils.java");
			// IOUtil.printHex("E:/JavaIo/FileUtils.java");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
