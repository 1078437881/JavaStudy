package com.java.base;

import java.net.MalformedURLException;
import java.net.URL;

public class UrlTest {

	public static void main(String[] args) {
		
		try {
			//创建一个URL实例
			URL baidu = new URL("https://www.baidu.com/");
			//?后面表示参数,#后面标识锚点
			URL url = new URL(baidu,"/p/%E4%B8%AA%E4%BA%BA%E5%BE%88%E4%B8%8D%E7%8E%B0%E5%AE%9E?from=msg");
			
			System.out.println("协议:"+url.getProtocol());
			System.out.println("主机:"+url.getHost());
			//如果未指定端口号,则使用默认的端口号,此时getPort()方法返回值为-1;
			System.out.println("端口:"+url.getPort());
			System.out.println("文件路径:"+url.getPath());
			System.out.println("文件名:"+url.getFile());
			System.out.println("相对路径:"+url.getRef());
			System.out.println("查询字符串:"+url.getQuery());
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}
}
