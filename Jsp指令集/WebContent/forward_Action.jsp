<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>F o r w o r d动作</title>
</head>
<body>
	<h1>F o r w o r d动作</h1>
	<hr>
	 <jsp:forward page="user.jsp">
	 	<jsp:param value="admin@123.com" name="email"/>
	 	<jsp:param value="123456" name="password"/>
	 </jsp:forward>
	<%
		//request.getRequestDispatcher("user.jsp").forward(request, response);
	%>
</body>
</html>