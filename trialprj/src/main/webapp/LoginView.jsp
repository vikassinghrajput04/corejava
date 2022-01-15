<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
</head>
<body>
<%@include file="Header.jsp" %>
	<h1 align="center">Login Page</h1>
	<br>
	<%
		String e = (String) request.getAttribute("error");
	%>
	<%
		if (e != null) {
	%>
	<h4 align="center">
		<font color="red"><%=e%></font>
	</h4>
	<%
		}
	%>

	<br>
	<form action="LoginCtl" method="post">
		<table align="center" width="100%">
			<tr>
				<td style="text-align: right; width: 45%">Login ID</td>
				<td style="text-align: left;width:10%"><input type="email" name="login"
					id="login"></td>
				<td style="width: 5%;margin: left;"><%
					String s1 = (String) request.getAttribute("errorlogin");
				%> 
					<%
 						if (s1 != null) {
 					%>
					
						<font color="red"><%=s1%></font>
					 <%
					 	}
					 %>
					</td>
				
			
			</tr>
			<tr>
				<td align="right">Password</td>
				<td><input type="password" name="pass" id="pass"></td>
				 <td style="width: 45%;margin: left;">
					<%
						String s2 = (String) request.getAttribute("errorpass");
					%> 
					<%
 						if (s2 != null) {
 					%>
					
						<font color="red"><%=s1%></font>
					 <%
					 	}
					 %>
				
				
			
			</tr>
			<tr>
				<td align="right"></td>
				<td><input type="submit" value="Login"></td>
				<td> </td>
			</tr>
			
			<tr>
				<td></td>
				<td width="10px"><a href="UserRegistrationView.jsp">Signup </a>||<a
					href="ForgotPasswordView.jsp">ForgotPassword</a></td>
			</tr>
			
		</table>
	</form>
	<%@include file="Footer.jsp" %>
</body>
</html>