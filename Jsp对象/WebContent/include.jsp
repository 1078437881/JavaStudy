<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String path =request.getContextPath();
	String hasePath = request.getScheme()+"://"+request.getServerName()+request.getServerPort()+path+"/";
	Date date = new Date();
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
	String s = sdf.format(date);
	out.print(s+"<br>");
%>