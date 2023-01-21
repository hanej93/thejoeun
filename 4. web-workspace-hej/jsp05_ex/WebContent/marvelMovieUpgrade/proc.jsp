<%@page import="java.time.format.DateTimeFormatter"%>
<%@page import="java.util.Formatter"%>
<%@page import="java.util.ArrayList"%>
<%@page import="jsp05_ex.MarvelMovie"%>
<%@page import="java.util.List"%>
<%@page import="java.time.LocalDate"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>

<%
	request.setCharacterEncoding("utf-8");
%>
<jsp:useBean id="marvelMovie" class="jsp05_ex.MarvelMovie" scope="request">
	<jsp:setProperty property="*" name="marvelMovie"/>
</jsp:useBean>
<jsp:setProperty property="releaseDate" name="marvelMovie" value='<%=LocalDate.parse(request.getParameter("release"))%>'/>
<%
	List<MarvelMovie> movieList;
	if(session.getAttribute("movieList") == null){
		movieList = new ArrayList<MarvelMovie>();
		System.out.println("무비리스트가 없습니다.");
	} else {
		movieList = (ArrayList<MarvelMovie>)session.getAttribute("movieList");
		System.out.println("무비리스트가 존재합니다.");
	}

	movieList.add(marvelMovie);
	for(MarvelMovie movie : movieList){
		System.out.println(movie.getKorTitle());
	}
	session.setAttribute("movieList", movieList);
	
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	div{
		display: grid;
	    justify-content: center;
	    align-content: center;
	    height: 500px;
	}
	form{
		margin: 15px;
	}
	input{
		display: inline-block;
		width: 300px;
		height: 100px;
		border-radius: 20px;
		
		background: linear-gradient(180deg, red, #990000);
		color: white;
		font-size: 2rem;
		font-weight: bold;		
	}
	input:hover {
		cursor: pointer;
		color: transparent;
		-webkit-background-clip: text;
	}
</style>
</head>
<body>
	<div>
		<form action="input.jsp">
			<input type="submit" value="돌아가기">
		</form>
		<form action="show.jsp">
			<input type="submit" value="결과보기">
		</form>
	</div>
</body>
</html>