<%@page import="java.net.URLDecoder"%>
<%@page import="java.net.URLEncoder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户登录</title>
</head>
<body>
	<h1>用户登录</h1>
	<%
		request.setCharacterEncoding("utf-8");
		String username = "";
		String password = "";

		Cookie[] cookies = request.getCookies();
		if (cookies != null && cookies.length > 0) {
			for (Cookie c : cookies) {
				if (c.getName().equals("username")) {
					username = URLDecoder.decode(c.getValue(), "utf-8");
				} else if (c.getName().equals("password")) {
					password = URLDecoder.decode(c.getValue(), "utf-8");
				}
			}
		}
	%>
	<div id="container">
		<div class="logo">
			<a href="#"><img alt="" src="assets/logo.jpg"></a>
		</div>
		<div id="box">
			<form action="Usersdologin.jsp" method="post">
				<p class="main">
					<label>用户名:</label> <input name="username" value=<%=username%>>
					<label>密 码:</label> <input type="password" name="password" value=<%=password%>>
				</p>
				<p class="check">
					<input type="checkbox" name="isUseCookie" checked="checked">十天内记住登录状态
				</p>
				<p class="space">
					<input type="submit" value="登录" class="login" style="cursor: pointer;">
				</p>
			</form>
		</div>
	</div>
</body>
</html>