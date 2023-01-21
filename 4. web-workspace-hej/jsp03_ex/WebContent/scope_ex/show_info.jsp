<%@page import="java.time.temporal.ChronoUnit"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.time.LocalDate"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>
<%
	String name = (String)pageContext.getAttribute("이름");
	String email = (String)request.getAttribute("이메일");
	LocalDate birth = (LocalDate)session.getAttribute("생일");
	
	LocalDate nowLocalDate = LocalDate.now();
	
	// 생일을 올해로 설정
	int nowYear = nowLocalDate.getYear();
	LocalDate nowYearbirth = birth.withYear(nowYear);
	
	// 이번년도의 생일이 지났다면, 내년으로 설정
	if(birth.isBefore(nowLocalDate)){
		nowYearbirth = birth.withYear(nowYear+1);
	}
	
	// 현재날짜와 설정된 생일간 날짜의 차이를 구함
	long defDay = ChronoUnit.DAYS.between(nowLocalDate, nowYearbirth);
	System.out.println(defDay);
	
	
	ArrayList<String> hobbies = (ArrayList<String>)application.getAttribute("취미");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>이름: <%=name %></h1>
	<h1>이메일: <%=email %></h1>
	<h1>생일: <%=birth %></h1>
	<h1>D-day <%=defDay %>일</h1>
	<h1>
		<oi>취미
		<% for(String hobby : hobbies){%>
		<li><%=hobby %></li>
		<% }%>
		</oi>
	</h1>
</body>
</html>