<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户注册</title>
</head>
<body>
	<h1>用户注册</h1>
	<hr>
	<!-- <form action="request.jsp" name="reqForm" method="get"> -->
	<form action="response.jsp" name="reqForm" method="post">
		<table>
			<tr>
				<td>用户名:</td>
				<td><input type="text" name="username"></td>
			</tr>
			<tr>
				<td>爱好:</td>
				<td><input type="checkbox" name="favorite" value="read">读书
					<input type="checkbox" name="favorite" value="music">音乐 
					<input type="checkbox" name="favorite" value="movie">电影 
					<input type="checkbox" name="favorite" value="internet">上网
				</td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="提交"></td>
			</tr>
		</table>
	</form>
	<br>
	<br>
	<!-- 通用配置Tomact服务器 server.xml中Connector标签最后面加上 URIEncoding="utf-8"解决url参数中文乱码问题 -->
	<a href="request.jsp?username=lisi">测试URL传参数</a>
</body>
</html>