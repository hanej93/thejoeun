<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="student" type="ex01.useBean.Student" scope="request"></jsp:useBean>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:getProperty property="name" name="student"/>
	<jsp:getProperty property="age" name="student"/>
	<jsp:getProperty property="kor" name="student"/>
	<jsp:getProperty property="eng" name="student"/>
	<jsp:getProperty property="math" name="student"/>
	<jsp:getProperty property="birth" name="student"/>
</body>
</html>