<%@page import="java.util.HashSet"%>
<%@page import="java.util.Set"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	for(int i = 1 ; i <= 5 ; i++){
		out.write(i + " ");
	}
%>
<hr>
<c:forEach var="i" begin="1" end="5">
	<%-- 문자열을 합치는 연산 --%>
	${i += " "}
</c:forEach>
<hr>
<h3>0~10까지 2의 배수 출력</h3>
<c:forEach var="i" begin="0" end="10" step="2">
	${i+=" " }
</c:forEach>
<hr>
<h3>자바의 foreach</h3>
<%
	Set<Integer> lotto = new HashSet<Integer>();
	while(lotto.size() < 6){
		lotto.add((int)(Math.random() * 45 + 1));
	}
	
	for(int num : lotto){
		out.write(num + " ");
	}
%>
<br>
<%-- list, Set, Iterator, Enumeration, Map 등등 컬렉션들 사용가능! --%>
<c:forEach var="num" items="<%=lotto %>" varStatus="s">
	${num += " " }
	
</c:forEach>

<hr>
<c:forEach var="num" items="<%=lotto %>" varStatus="s">
	<c:if test='${s.first }'>
		첫번째냐? ${num}<br>
	</c:if>
	index: ${s.index }<br>
	count: ${s.count }<br>
	<c:if test="${s.last }">
		마지막이냐? ${num}<br>
	</c:if>	
</c:forEach>
</body>
</html>