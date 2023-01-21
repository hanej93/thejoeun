<%@page import="jsp05_ex.MarvelMovie"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="marvelMovie1" class="jsp05_ex.MarvelMovie" scope="request"></jsp:useBean>
<jsp:setProperty property="korTitle" name="marvelMovie1" param="korTitle1"/>
<jsp:setProperty property="engTitle" name="marvelMovie1" param="engTitle1"/>
<jsp:setProperty property="worldBoxOffice" name="marvelMovie1" param="worldBoxOffice1"/>
<jsp:useBean id="marvelMovie2" class="jsp05_ex.MarvelMovie" scope="request"></jsp:useBean>
<jsp:setProperty property="korTitle" name="marvelMovie2" param="korTitle2"/>
<jsp:setProperty property="engTitle" name="marvelMovie2" param="engTitle2"/>
<jsp:setProperty property="worldBoxOffice" name="marvelMovie2" param="worldBoxOffice2"/>
<jsp:useBean id="marvelMovie3" class="jsp05_ex.MarvelMovie" scope="request"></jsp:useBean>
<jsp:setProperty property="korTitle" name="marvelMovie3" param="korTitle3"/>
<jsp:setProperty property="engTitle" name="marvelMovie3" param="engTitle3"/>
<jsp:setProperty property="worldBoxOffice" name="marvelMovie3" param="worldBoxOffice3"/>
<%
	List<MarvelMovie> movieList = new ArrayList<>();
	movieList.add(marvelMovie1);
	movieList.add(marvelMovie2);
	movieList.add(marvelMovie3);
	
	request.setAttribute("marvelMovies", movieList);
	request.getRequestDispatcher("show.jsp").forward(request, response);
%>

