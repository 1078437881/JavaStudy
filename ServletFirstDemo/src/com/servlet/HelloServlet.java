package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		super.doGet(request, response);
		System.out.println("处理Get请求");
		PrintWriter out = response.getWriter();
		response.setContentType("text/html;charset=utf-8");
		out.println("<strong>处理Get请求HelloServlet</strong><br>");
	}
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		super.doPost(request, response);
		System.out.println("处理Post请求");
		PrintWriter out = response.getWriter();
		response.setContentType("text/html;charset=utf-8");
		out.println("<strong>处理Post请求HelloServlet</strong><br>");
	}

}
