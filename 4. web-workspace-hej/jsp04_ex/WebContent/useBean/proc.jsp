<%@page import="java.time.LocalDate"%>
<%@page import="ex01.useBean.Student"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	Student student = new Student();
	
	String name = request.getParameter("name");
	int age = Integer.parseInt(request.getParameter("age"));
	LocalDate birth = LocalDate.parse(request.getParameter("birth"));
	int kor = Integer.parseInt(request.getParameter("kor"));
	int eng = Integer.parseInt(request.getParameter("eng"));
	int math = Integer.parseInt(request.getParameter("math"));
	
	student.setName(name);
	student.setAge(age);
	student.setBirth(birth);
	student.setKor(kor);
	student.setEng(eng);
	student.setMath(math);
	
	request.setAttribute("student", student);
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