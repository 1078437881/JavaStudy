package com.java.socket_tcp;

import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ObjServer {

	public static void main(String[] args) {

		try {
			@SuppressWarnings("resource")
			ServerSocket serverSocket = new ServerSocket(8989);
			int count = 0;// 记录客户端的数量
			System.out.println("服务端启动,等待客户端连接...");
			Socket socket = null;
			// 如果使用多线程，那就需要线程池，防止并发过高时创建过多线程耗尽资
			ExecutorService threadPool = Executors.newFixedThreadPool(100);
			while (true) {
				socket = serverSocket.accept();
				ObjectServerThread objServerThread = new ObjectServerThread(socket);
				// //优先级调度,优先级搞抢占资源的概率高,同样的优先级在前面的调度更快
				// objServerThread.setPriority(4);
				threadPool.submit(objServerThread);
				++count;
				System.out.println("上线的客户端有" + count + "个!");

				InetAddress inetAddress = socket.getInetAddress();
				System.out.println("当前客户端的IP地址是:" + inetAddress.getHostAddress());
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
