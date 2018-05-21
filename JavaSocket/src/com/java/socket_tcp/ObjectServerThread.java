package com.java.socket_tcp;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

import com.java.databeans.User;

public class ObjectServerThread implements Runnable {

	Socket socket = null;

	public ObjectServerThread(Socket socket) {
		this.socket = socket;
	}

	@Override
	public void run() {

		OutputStream os = null;
		PrintWriter pw = null;
		User user = null;

		try {
			InputStream is = socket.getInputStream();
			ObjectInputStream ois = new ObjectInputStream(is);
			// readObject()方法必须保证服务端和客户端的User包名一致,否则会出现找不到类的错误
			user = (User) ois.readObject();
			User user1 = (User)ois.readObject();
			System.out.println("客户端发送的对象:" + user);
			System.out.println("客户端发送的对象:" + user1);
			socket.shutdownInput();// 关闭套接字的输入流

			os = socket.getOutputStream();
			pw = new PrintWriter(os);
			pw.println("欢迎登陆!");
			pw.println(user.toString());
			pw.flush();
			ObjectOutputStream oos = new ObjectOutputStream(os);
			oos.writeObject(user);
			oos.flush();
			socket.shutdownOutput();

		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (pw != null) {
					pw.close();
				}

				if (os != null) {
					os.close();
				}
				if (socket != null) {
					socket.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
