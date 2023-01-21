<%@page import="java.util.ArrayList"%>
<%@page import="jsp05_ex.MarvelMovie"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	ArrayList<MarvelMovie> movieList = (ArrayList<MarvelMovie>) request.getAttribute("marvelMovies");
	long totWorldBoxOffice = 0;
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>
		<%
			for (MarvelMovie movie : movieList) {
				request.setAttribute("movie", movie);
		%>
		<ul>
			<li>영화제목(한글): ${ movie.korTitle}</li>
			<li>영화제목(영어): ${movie.engTitle}</li>
			<li>월드 박스오피스: ${ movie.worldBoxOffice}</li>
		</ul>
		<%
				totWorldBoxOffice += movie.getWorldBoxOffice();
			}
			request.setAttribute("TWBO", totWorldBoxOffice);
		%>
	</h1>
	<h2>박스오피스 총합: ${TWBO}</h2>
</body>
</html>