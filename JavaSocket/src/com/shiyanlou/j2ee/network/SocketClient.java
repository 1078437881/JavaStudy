package com.shiyanlou.j2ee.network;

import java.awt.BorderLayout;
import java.net.InetAddress;
import java.net.Socket;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class SocketClient extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1971203049743315597L;

	private Socket socket;// 声明一个Socket对象
	private JTextArea textArea_socketInfo;// 声明一个显示纯文本的多行区域

	public SocketClient() {
		// 自定义窗体的构造方法
		super();
		setTitle("Socket Client");// 设置窗体标题栏内容
		// 设置窗体标题栏内容
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 设置窗体默认的关闭操作为"关闭"
		setBounds(200, 200, 280, 180);
		// 设置窗体所处位置及大小

		final JScrollPane scrollPane = new JScrollPane();
		// 声明并实例化一个带滚动条的窗体
		getContentPane().add(scrollPane, BorderLayout.CENTER);
		// 将这窗格添加到父容器中,使用的布局方案为居中布局约束

		textArea_socketInfo = new JTextArea();// 实例化这个多行文本区域
		scrollPane.setViewportView(textArea_socketInfo);
		;
		// 将创建好的TextArea组件添加到窗格中
	}

	private void connect() {
		// 编写一个链接套接字的方法

		textArea_socketInfo.append("Try to connect server...\n");
		// 在文本区域中输出信息:尝试连接服务器

		try {

			socket = new Socket("localhost", 2017);
			// 实例化Socket对象,设定的IP地址为本地回环地址,端口号为2017
			textArea_socketInfo.append("Connect completed.\n");
			// 在文本区域中输出信息:连接完成
			InetAddress serverAddress = socket.getInetAddress();
			// 从连接的socket中,获取服务器的IP地址,类型为InetAddress对象
			String serverIP = serverAddress.getHostAddress();
			// 获取远程服务器的IP地址,存入serverIP变量中
			int serverPort = socket.getPort();
			// 获得服务器的端口号,类型为int
			InetAddress localAddress = socket.getLocalAddress();
			// 获得客户端的地址,类型为InetAddress对象
			String clientIP = localAddress.getHostAddress();
			// 获取客户端的IP地址
			int clientPort = socket.getLocalPort();
			// 获得客户端的端口号,类型为int

			textArea_socketInfo.append("Server IP: " + serverIP + "\n");
			textArea_socketInfo.append("Server Port: " + serverPort + "\n");
			textArea_socketInfo.append("Client IP: " + clientIP + "\n");
			textArea_socketInfo.append("Client Port: " + clientPort + "\n");
			// 将上述内容追加在文本域中显示出来
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public static void main(String[] args) {
		try {
			SocketClient clientFrame = new SocketClient();
			clientFrame.setVisible(true);// 设置其可见
			clientFrame.connect();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
