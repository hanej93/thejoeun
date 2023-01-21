<%@page import="java.util.Map"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!-- 
	태그 라이브러리를 사용하려면 taglib를 선언해줘야 한다.
	core는 jstl의 기본 기능인 반복, 변수생성 등등의 기능이 있음
 -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex01.jsp</title>
</head>
<body>
	<h1>변수의 생성과 사용</h1>
	<!-- 변수의 선언 -->
	<c:set var="name1" value="ironman" scope="request"/>
	<%
		// System.out.println(name1); 자바 변수를 만드는 것은 아님
	%>
	<!--
		request.setAttribute("name1", ironman); 이것과 같음
		
	-->
	name1: ${name1 }
	<hr>
	<c:set var="names" value='<%=new String[]{"가렌","카타리나","샤코"} %>' scope="request"></c:set>
	<%--  <c:set var="names" scope="request">value='<%=new String[]{"가렌","카타리나","샤코"} %>'</c:set> --%>
	names: ${ names[0] } , ${ names[1] } , ${ names[2] }
	<hr>
	<c:set var="myList" value='<%=new ArrayList<String>() %>' scope="request"/>
	<hr>
	<!-- 이미 만들어져있는 객체를 참조하는 것도 가능하다 -->
	<%
		Map<String, String> skill = new HashMap<String,String>();
	%>
	<c:set target='<%=skill %>' property="q" value="신비한화살"/>
	<%=skill.get("q")%>
	
	<c:set var="hobbyMap" value='<%=new HashMap<String,String>() %>' scope="request"/>
	<% //request.getAttribute("hobbyMap"); %>
	<c:set target="${hobbyMap }" property="first" value="운동"/>
	<c:set target="${hobbyMap }" property="second" value="독서"/>
	<c:set target="${hobbyMap }" property="third" value="공부"/>
	${hobbyMap["first"] }
	${hobbyMap.second }
	${hobbyMap.third }
	
	<hr>
	
	<c:set var="test01" scope="request">10</c:set>
	<c:set var="test01" scope="page">20</c:set>
	<c:set var="test01" scope="session">30</c:set>
	page:test01 = ${test01 }<br>
	request:test01 = ${requestScope.test01 }<br>
	session:test01 = ${sessionScope.test01 }<br>
	
	<h3>삭제 후</h3>
	<c:remove var="test01" scope="page"/>
	page:test01 = ${pageScope.test01 }<br>
	request:test01 = ${requestScope.test01 }<br>
	session:test01 = ${sessionScope.test01 }<br>
	
	<h3>scope를 정하지 않고 삭제</h3>
	<!-- scope를 정하지 않으면 모든 스코프의 해당 변수 삭제  -->
	<c:remove var="test01"/>
	page:test01 = ${pageScope.test01 }<br>
	request:test01 = ${requestScope.test01 }<br>
	session:test01 = ${sessionScope.test01 }<br>
	
</body>
</html>