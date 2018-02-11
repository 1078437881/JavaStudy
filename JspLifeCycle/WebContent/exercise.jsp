<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>9X9乘法表</title>
</head>
<body>
	<h1>9X9乘法表</h1>
	<hr>
	<%!String PrintMultiTable() {
		String s = "";
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= i; j++) {
				s += i + "*" + j + "=" + (i * j) + "&nbsp;&nbsp;&nbsp;&nbsp;";
			}
			s += "<br>";
		}
		return s;
	}

	//JSP内置out对象,使用脚本方式调用,打印乘法表
	void printMultiTude2(JspWriter out) {
		try {
			for (int i = 1; i <= 9; i++) {

				for (int j = 1; j <= i; j++) {

					out.print(i + "*" + j + "=" + (i * j) + "&nbsp;&nbsp;&nbsp;&nbsp;");

				}
				out.print("<br>");
			}
		} catch (Exception e) {

		}
	}%>
	<%=PrintMultiTable()%>
	<hr>
	<br>
	<%
		printMultiTude2(out);
	%>
	<br>
</body>
</html>