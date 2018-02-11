<%@page import="com.users.Users"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>javaBean 的四个作用域范围</title>
</head>
<body>
	<h1>JavaBean 的四个作用域范围</h1>
	<jsp:useBean id="myUsers" class="com.users.Users" scope="request"></jsp:useBean>
	您的用户名为:<jsp:getProperty property="username" name="myUsers" /><br>
	您的密 码为:<jsp:getProperty property="password" name="myUsers" /><br>\
	<!-- 使用内置对象获取用户名和密码 -->
	<hr>
	<!-- 
		application session 能获取到
		request 使用服务器内部转发可以获取,超链接无法获取
		page无法获取
	 -->
	<%--
	用户名:<%=((Users)application.getAttribute("myUsers")).getUsername() %><br>
	密码:<%=((Users)application.getAttribute("myUsers")).getPassword() %><br>
	--%>
	<hr>
	<%-- 
	用户名:<%=((Users)session.getAttribute("myUsers")).getUsername() %><br>
	密码:<%=((Users)session.getAttribute("myUsers")).getPassword() %><br>
	--%>
	<hr>

	用户名:<%=((Users) request.getAttribute("myUsers")).getUsername()%><br>
	密码:<%=((Users) request.getAttribute("myUsers")).getPassword()%><br>

</body>
</html>