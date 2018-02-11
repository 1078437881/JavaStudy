package com.javaswing.synopsis;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MySwingWindow extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3973867138428630055L;
	
	//声明各个控件
	private JLabel myLabel;
	private JTextField myTextField;
	private JButton myButton;
	
	
	public MySwingWindow(){
		super();
		
		//设置窗体的大小
		this.setSize(400,300);
		
		this.getContentPane().setLayout(null);//返回此窗体的contentPane对象,设置布局
		
		this.setTitle("My First Swing Window");//设置窗体的标题
		
		this.add(getJLabel(),null);
		this.add(getJTextField(), null);
		this.add(getJButton());
		//在自定义的JFrame构造方法中使用add()方法来添加控件
        //add()方法可以将指定组件添加到此容器的给定位置上
        //第一个参数为待添加的组件，这里的组件来自我们的返回值
        //第二个参数为描述组件的布局限制的对象，我们不加限制，所以填null
	}
	
	private JLabel getJLabel(){
		if(myLabel==null){
			myLabel = new JLabel();
			myLabel.setBounds(5, 10, 250, 30);
			//x,y,width,height 横向,纵向坐标,标签自身宽和高
			myLabel.setText("Hello,Welocome to Swing");
		}
		
		return myLabel;
	}
	
	private JTextField getJTextField(){
		if(myTextField==null){
			myTextField = new JTextField();
			myTextField.setBounds(5, 45, 200, 30);
			
			myTextField.setText("My First Swing text");
		}
		return myTextField;
	}
	private JButton getJButton(){
		if(myButton ==null){
			myButton = new JButton();
			myButton.setBounds(5,80,100,40);
			//x,y,width,height 横向,纵向坐标,标签自身宽和高
			myButton.setText("Click me!");
			myButton.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					myLabel.setForeground(Color.RED);
					myTextField.setBackground(Color.BLUE);
					
				}
			});
		}
		return myButton;
	}
	public static void main(String[] args) {
		
		MySwingWindow window =new MySwingWindow();
		
		window.setVisible(true);//设置窗体可见
		
	}
}
