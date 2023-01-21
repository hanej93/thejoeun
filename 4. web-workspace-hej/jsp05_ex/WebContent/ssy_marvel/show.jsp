<%@page import="ssy.MarvelMovie"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	ArrayList<MarvelMovie> movieList =  (ArrayList<MarvelMovie>)session.getAttribute("movieListOut");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<c:forEach var="movie" items="<%=movieList %>">
		영화제목: ${movie.korName}<br>
		영화제목: ${movie.engName}<br>
		영화제목: ${movie.boxOffice}<br>
		영화제목: ${movie.openingDate}<br>
	
	</c:forEach>
</body>
</html>