<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>setProperty</title>
</head>
<body>
	<h1>setProperty动作元素</h1>
	<%request.setCharacterEncoding("utf-8"); %>
	<jsp:useBean id="myUsers" class="com.users.Users" scope="request"></jsp:useBean>
	<hr>
	<!-- 根据表单自动匹配所有的属性 -->
	<%--
	<jsp:setProperty property="*" name="myUsers"/>
	--%>
	<!-- 根据表单匹配部分的属性 -->
	<%--
	<jsp:setProperty property="username" name="myUsers"/>
	 --%>
	<!-- 通过手工赋值匹配属性 -->
	<%-- 
	<jsp:setProperty property="username" name="myUsers" value="zhansan"/>
	<jsp:setProperty property="password" name="myUsers" value="12345678"/>
	--%>
	<!-- 通过URL传参数给属性赋值 -->
	<jsp:setProperty property="username" name="myUsers" />
	<jsp:setProperty property="password" name="myUsers" param="mypass" />
	<%--//request.setCharacterEncoding("utf-8");//防止中文乱码 --%>

	用户名:<%=myUsers.getUsername()%><br> 密 码:<%=myUsers.getPassword()%><br>

	您的用户名为:<jsp:getProperty property="username" name="myUsers" /><br>
	您的密 码为:<jsp:getProperty property="password" name="myUsers" /><br>
	<hr>
	<a href="testScope.jsp">测试javaBean的四个作用域范围</a>

	<%
		request.getRequestDispatcher("testScope.jsp").forward(request, response);
	%>


</body>
</html>