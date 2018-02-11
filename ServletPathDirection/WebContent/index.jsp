<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Servlet路径跳转_index</title>
</head>
<body>
	<h1>Servlet路径跳转</h1>
	<hr>
	<!-- 使用相对路径访问ServletHello -->
	<!-- /com/servlet/path/ServletHello 第一个/标识服务器的根目录 -->
	<a href="com/servlet/path/ServletHello">访问ServletHello</a><br>
	
	<!-- 使用绝对路径访问ServletHello,可以使用path变量 -->
	<%
		String path = request.getContextPath();//标识项目的根目录
		String basePath = request.getScheme()+"://"+request.getServerName()+":";
	%>
	<a href="<%=path %>/com/servlet/path/ServletHello">访问ServletHello</a><br>
	<!-- 表单中action的URL地址写法,与超链接方式完全相同 -->
	
	<a href="<%=path %>/com/servlet/path/TestServlet">访问TestServlet,跳转到Test.jsp</a><br>
</body>
</html>