<%@page import="java.time.LocalDate"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<jsp:useBean id="student" class="ex01.useBean.Student" scope="request" />
<jsp:setProperty property="name" name="student" param="name" />
<jsp:setProperty property="age" name="student" param="age" />
<jsp:setProperty property="kor" name="student" param="kor" />
<jsp:setProperty property="eng" name="student" param="eng" />
<jsp:setProperty property="math" name="student" param="math" />
<%
	LocalDate birth = (LocalDate)request.getAttribute("birth");
	student.setBirth(birth);
%>


<jsp:forward page="show.jsp"></jsp:forward>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>