<%@page import="java.io.PrintWriter"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
	response.setContentType("text/html;charset=UTF-8");

	out.println("<h1>response内置对象<h1>");
	out.println("<hr>");
	//out.flush();//强制清空缓冲去,同时并强制把缓冲区的内容写到浏览器上,则保证标题在前面

	PrintWriter outer = response.getWriter();//获得输出流对象
	outer.println("大家好,我是response对象生成的输出流outer对象");
	//response.sendRedirect("regist.jsp");//请求重定向
	//请求重定向  相当于是两次请求,地址栏地址会发生变化,不会保存第一次的请求数据,是客户端行为
	//response.sendRedirect("request.jsp");
	//请求转发  将原来的请求数据转发到request.jsp,地址栏不会发生变化,是服务器端行为
	request.getRequestDispatcher("request.jsp").forward(request, response);
%>