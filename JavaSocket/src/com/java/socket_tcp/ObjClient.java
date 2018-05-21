package com.java.socket_tcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

import com.java.databeans.User;

public class ObjClient {

	public static void main(String[] args) {

		// 创建客户端的Socket,指定合服务器的IP合端口
		try {
			Socket socket = new Socket("127.0.0.1", 8989);

			// 获取该Socket的输出流,用来向服务器发送信息
			OutputStream os = socket.getOutputStream();
			ObjectOutputStream oos = new ObjectOutputStream(os);
			oos.writeObject(new User(1, 15, "张三", "123456"));
			oos.writeObject(new User(2, 18,"赵明","233333"));
			oos.flush();
			socket.shutdownOutput();

			// 获取输入流,取得服务器的信息
			InputStream is = socket.getInputStream();
			BufferedReader br = new BufferedReader(new InputStreamReader(is,"UTF-8"));
			String info = null;
			while ((info = br.readLine()) != null) {
				System.out.println("服务端的信息:" + info);
			}
//		
			ObjectInputStream ois = new ObjectInputStream(is);
			try {
				System.out.println("服务端返回:" + (User) ois.readObject());
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			socket.shutdownInput();
			oos.close();
			os.close();
			ois.close();
			is.close();
			br.close();
			socket.close();
		} catch (UnknownHostException e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
//		catch (ClassNotFoundException e) {
//			// TODO: handle exception
//		}

	}

}
