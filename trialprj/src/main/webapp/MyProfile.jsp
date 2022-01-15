<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Account</title>
</head>
<body>
<%@include file="Header.jsp" %>
<h2>
Want to Update Account Details <br>
Please Fill up the form<br>
</h2>
	<h1 align="center">Update Details</h1>
	<%
		String s = (String) request.getAttribute("error");
	%>
	<%
		if (request.getAttribute("error") != null) {
	%>
	<h3 align="center">
		<font color="red"><%=s%></font>
	</h3>
	<%
		}
	%>
	
	
	
	<form action="MyProfileUpdate" method="post">
		<table align="center">
			<tr>
				<td>First Name</td>
				<td><input type="text" name="fname" id=""></td>
			</tr>
			<tr>
				<td>Last Name</td>
				<td><input type="text" name="lname" id=""></td>
			</tr>
			<tr>
				<td>DOB</td>
				<td><input type="date" name="dob" id=""></td>
			</tr>
			<tr>
				<td>Mobile Number</td>
				<td><input type="text" name="mobile" id=""></td>
			</tr>
			
			<tr>
				<td>Username</td>
				<td><input type="text" name="username" id=""></td>
			</tr>
			<tr>
				<td>Password</td>
				<td><input type="password" name="password" id=""></td>
			</tr>
			<tr>
				<td>Confirm Password</td>
				<td><input type="password" name="confirmpassword" id=""></td>
			</tr>
			<tr>
				<td>Email ID</td>
				<td><input type="email" name="emailid" id=""></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="Submit" value="Signup"><a href="MyProfile.jsp"><input
					type="button" value="Cancel" ></a></td>
			</tr>
			

		</table>
	</form>
	
<%@include file="Footer.jsp" %>

</body>
</html>