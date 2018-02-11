<%@page import="java.sql.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>session内置对象</title>
</head>
<body>
	<h1>session内置对象</h1>
	<hr>
	<%
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日   HH:mm:ss");
		Date d = new Date(session.getCreationTime());
		session.setAttribute("username", "admin");
		session.setAttribute("password", 123456);
		session.setAttribute("age", "20");
		
		//设置打钱session最大生存期限
		//session.setMaxInactiveInterval(10);//10秒过期
		
	%>
	Session 创建时间:<%=sdf.format(d)%><br>
	Session ID编号:<%=session.getId()%><br>
	从Session 中获取用户名:<%=session.getAttribute("username")%><br>
	<%
		//session.invalidate();//销毁当前会话 
	%>
	<a href="session_page2.jsp">跳转到 Session_page2</a>
</body>
</html>