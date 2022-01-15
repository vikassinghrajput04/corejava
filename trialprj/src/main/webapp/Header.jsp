<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title></title>
</head>
<body>

<p align="center"><img alt="" src="img/logo.png" ></p>
<% if(session.getAttribute("fname") == null){%>
Welcome Guest
<%}else{ %>
Welcome <%= session.getAttribute("fname") %>
<%} %>

<%if (session.getAttribute("fname") != null){ 
%>

<hr>
<h4><a href="ContactUs.jsp"> ContactUs</a>||<a href="Location.jsp">Location</a>||<a href="MyProfile.jsp">My Profile</a>||<a href="">Change Password</a>||<a href="Logout.jsp" align="right">Logout</a></h4>
<hr>

<%
}
 %>
 <hr>

</body>
</html>