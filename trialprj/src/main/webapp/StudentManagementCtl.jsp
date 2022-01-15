<%@page import="com.model.student.StudentModel"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Management</title>
</head>
<body>
<jsp:useBean id="bean" scope="page" class="com.model.student.StudentBean"></jsp:useBean>
<jsp:setProperty name="bean" property="*" />

<%-- <jsp:setProperty property="RollNo" name="RollNo"/>
<jsp:setProperty property="Fname" name="Fname"/>
<jsp:setProperty property="Lname" name="Lname"/>
<jsp:setProperty property="Session" name="Session"/>
 --%>
 <%-- <%
 StudentBean bean  = new StudentBean();
 bean.setRollNo(request.getParameter("RollNo"));
 bean.setFname(request.getParameter("Fname"));
 bean.setLname(request.getParameter("Lname"));
 bean.setSession(request.getParameter("Session"));
 
 %> --%>
 
<%

String op = request.getParameter("operation");
if(op.equals("Add")){
StudentModel.add(bean);	
}
if(op.equals("Delete")){
	StudentModel.Delete(bean);
}
if(op.equals("Modify")){
StudentModel.Update(bean);
}

response.sendRedirect("Data.jsp");
%> 

</body>
</html>