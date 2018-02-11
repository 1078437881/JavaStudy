<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>First Servlet 例子</title>
</head>
<body>
	<h1>First Servlet 例子</h1>
	<a href="com/servlet/HelloServlet">Get方式请求HelloServlet</a>
	<form action="com/servlet/HelloServlet" method="post">
		<input type="submit" value="Post方式请求HelloServlet">
	</form>
</body>
</html>