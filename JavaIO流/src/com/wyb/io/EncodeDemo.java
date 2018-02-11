package com.wyb.io;

public class EncodeDemo {

	public static void main(String[] args) throws Exception {
		String s = "编码测试ABC";
		byte[] bytes1 = s.getBytes();
		for (byte b : bytes1) {
			// 把字节转换成int以16进制显示
			System.out.print(Integer.toHexString(b & 0xff) + " ");
		}
		System.out.println();
		byte[] byte2 = s.getBytes("gbk");

		for (byte b : byte2) {
			System.out.print(Integer.toHexString(b & 0xff) + " ");
		}
		System.out.println();
		byte[] byte3 = s.getBytes("utf-8");

		for (byte b : byte3) {
			System.out.print(Integer.toHexString(b & 0xff) + " ");
		}
		//java是双字节编码utf-16be
		System.out.println();
		byte[] byte4 = s.getBytes("utf-16be");

		for (byte b : byte4) {
			System.out.print(Integer.toHexString(b & 0xff) + " ");
		}
		System.out.println();
		/*
		 * 当你的字节序列是某种编码是,这个时候想把字节序列变成字符串,
		 * 也需要用这种编码方式,否则会出现乱码
		 */
		String str1 = new String(byte4,"utf-16be");
		System.out.println(str1);
	}
}
