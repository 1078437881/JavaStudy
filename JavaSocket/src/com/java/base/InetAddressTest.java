package com.java.base;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class InetAddressTest {
	public static void main(String[] args) throws UnknownHostException {
		// 获取本机的InetAddress实例
		InetAddress address = InetAddress.getLocalHost();
		System.out.println("计算机名:" + address.getHostName());
		System.out.println("IP地址:" + address.getHostAddress());
		byte[] bytes = address.getAddress();// 获取字节数据形式的IP地址
		System.out.println("字节数组形式的IP:" + Arrays.toString(bytes));
		System.out.println(address);// 直接输出InetAddress对象

		// 根据机器名获取InetAddress实例
//		InetAddress address2 = InetAddress.getByName("AFOEA-606111053");
		InetAddress address2 = InetAddress.getByName("192.168.250.2");
		System.out.println("计算机名:" + address2.getHostName());
		System.out.println("IP地址:" + address2.getHostAddress());
	}
}
