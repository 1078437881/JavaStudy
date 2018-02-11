<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("utf-8");//防止中文乱码
%>
<jsp:useBean id="loginUser" class="com.users.Users" scope="page"></jsp:useBean>
<jsp:useBean id="userDao" class="com.users.dao.UserDao" scope="page"></jsp:useBean>
<jsp:setProperty property="*" name="loginUser" />
<%
	if (userDao.usersLogin(loginUser)) {
		session.setAttribute("username", loginUser.getUsername());
		request.getRequestDispatcher("login_success.jsp").forward(request, response);
	} else {
		response.sendRedirect("login_failure.jsp");
	}
%>