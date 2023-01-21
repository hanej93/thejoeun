<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	이름: ${requestScope.student.name}<br>
	<!-- ((Student)request.getAttribute("student")).getName() -->
	<!-- pageContext, request, session, application 순으로 student 객체가 있는지 확인 -->
	<!-- request에 student객체가 있기 때문에 생략이 가능함 -->
	생일: ${student.birth}<br>
	국어: ${student.score.kor }<br>
	영어: ${student.getScore().getEng() }<br>
	수학: ${student.score.math }<br>
	총점: ${student.score.tot }<br>
	평균: ${student.score.avg }<br>
</body>
</html>