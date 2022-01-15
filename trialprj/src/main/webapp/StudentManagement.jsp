<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Management</title>
</head>
<body>
<form action="StudentManagementCtl.jsp" method="post">

<table align="center">
<tr>
<td>Roll No</td>
<td><input type="text" name="rollNo"></td>
</tr>
<tr>
<td>First Name</td>
<td><input type="text" name="fname"></td>
</tr>
<tr>
<td>Last Name</td>
<td><input type="text" name="lname"></td>
</tr>
<tr>
<td>Session</td>
<td><input type="text" name="session"></td>
</tr>
<tr>
<td></td>
<td><input type="submit" value="Add" name="operation"><input type="submit" value="Delete" name="operation"><input type="submit" value="Modify" name="operation"></td>
</tr>
</table>
</form>
</body>
</html>