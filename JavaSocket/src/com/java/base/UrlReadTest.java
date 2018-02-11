package com.java.base;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class UrlReadTest {
	public static void main(String[] args) throws MalformedURLException {
		try {
			//创建一个URL实例
			URL url = new URL("https://www.baidu.com/");
			//通过URL的openStream方法获取URL的对象所标识的资源的字节输入流
			InputStream is = url.openStream();
			//将字节输入流转换为字符输入流
			InputStreamReader isr = new InputStreamReader(is,"utf-8");
			//为字符输入流添加缓冲
			BufferedReader br = new BufferedReader(isr);
			String data = br.readLine();//读取数据
			while(data!= null){
				//循环读取数据
				System.out.println(data);
				data= br.readLine();
			}
			br.close();
			isr.close();
			is.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
