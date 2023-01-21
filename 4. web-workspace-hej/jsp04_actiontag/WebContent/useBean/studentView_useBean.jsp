<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- 이미 request에 useBean 객체가 있다면 새로 만들지 않고 가져옴  -->
<%-- <jsp:useBean id="student" class="ex01.Student" scope="request"/> --%>
    
<!-- type은 "무조건" 존재하는 객체를 가져옴 -->
<jsp:useBean id="student" type="ex01.Student" scope="request"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>studentView_useBean</title>
</head>
<body>
	이름:<jsp:getProperty property="name" name="student"/>
	나이:<jsp:getProperty property="age" name="student"/>
</body>
</html>