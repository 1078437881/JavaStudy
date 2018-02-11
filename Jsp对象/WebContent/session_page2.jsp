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
	%>
	Session 创建时间:<%=sdf.format(d)%><br>
	Session ID编号:<%=session.getId()%><br>
	从Session 中获取用户名:<%=session.getAttribute("username")%><br>
	Session 中保存的属性有:<br><%
		String[] names = session.getValueNames();
		for(int i=0;i<names.length;i++){
			out.println(names[i]+"&nbsp;&nbsp"+":"+session.getAttribute(names[i])+"<br>");
		}
	%><br>
</body>
</html>