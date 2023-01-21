<%@page import="ex01.Student"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	Student student = (Student)request.getAttribute("student");

%>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	학생 이름: <%=student.getName() %><br>
	학생 나이: <%=student.getAge() %><br>
</body>
</html>