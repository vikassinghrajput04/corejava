<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome</title>
</head>
<body>
<%@include file="Header.jsp" %>
<% 
 String s =(String)request.getAttribute("fname");
%>

<h1 align="center"><font color="red">Welcome to ORS </font></h1>
<h2>Hi, <%=s %></h2>
<%@include file="Footer.jsp" %>
</body>
</html>