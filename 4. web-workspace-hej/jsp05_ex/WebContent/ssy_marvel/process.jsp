<%@page import="ssy.MarvelMovie"%>
<%@page import="java.time.LocalDate"%>
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%
	request.setCharacterEncoding("utf-8");
%>
<jsp:useBean id="marvelMovie" class="ssy.MarvelMovie" scope="request">
	<jsp:setProperty property="korName" name="marvelMovie" param="korName"/>
	<jsp:setProperty property="engName" name="marvelMovie" param="engName"/>
	<jsp:setProperty property="boxOffice" name="marvelMovie" param="boxOffice" />
	<jsp:setProperty property="openingDate" name="marvelMovie" value='<%=LocalDate.parse(request.getParameter("openingDate")) %>' />
</jsp:useBean>
<%
	List<MarvelMovie> movieList;

	if(session.getAttribute("movieListOut") == null){
		movieList = new ArrayList<MarvelMovie>();
	} else{
		movieList = (ArrayList<MarvelMovie>)session.getAttribute("movieListOut");
	}
	
	movieList.add(marvelMovie);
	
	session.setAttribute("movieListOut", movieList);
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>

<style>
html {
	position: relative;
}

.boxAll {
	position: absolute;
	height: 100%;
	width: 500px;
	border: 1px solid #dcdcdc;
	height: 100%;
}

.box {
	width: 100%;
	height: 50px;
	line-height: 50px;
	padding-left: 20px;
}

.buttonDetale1 {
	background: red;
	border: none;
	color: white;
}

.buttonDetale2 {
	background: green;
	border: none;
	color: white;
}

.button {
	height: 50px;
	margin-bottom: 20px;
}
</style>
<body>
	<form action="input.jsp" method="post">

		<div class="box button">
			<button class="buttonDetale1">돌아가기</button>
		</div>

	</form>
	<form action="show.jsp" method="post">
		<div class="box button">
			<input class="buttonDetale2" type="submit" value="결과보기">
		</div>
	</form>
</body>
</html>