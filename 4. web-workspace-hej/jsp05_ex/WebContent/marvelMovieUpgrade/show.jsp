<%@page import="java.util.Iterator"%>
<%@page import="jsp05_ex.MarvelMovie"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%
	
	ArrayList<MarvelMovie> movieList = (ArrayList<MarvelMovie>)session.getAttribute("movieList");
	
	String removeEngTitle = (String)request.getParameter("removeEngTitle");
	
	if(removeEngTitle != null){
		Iterator<MarvelMovie> itMovie = movieList.iterator();
		while(itMovie.hasNext()){
			MarvelMovie movie = itMovie.next();
			if(movie.getEngTitle().equals(removeEngTitle)){
				itMovie.remove();
			}
		}
	}
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>영화 조회</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<script type="text/javascript" src="https://code.jquery.com/ui/1.12.1/jquery-ui.js" ></script>
<style>
    * {
        margin: 0;
        padding: 0;
    }
    
    table {
        border: 2px solid #990000;
        border-collapse: collapse;
        width: 600px;
        margin: 10px auto;
        text-align: center;
        position: relative;
        
    }
    tr {
        border: 1px solid #ddd;
    }
    tr>*:first-child {
        padding: 5px;
        background-color: #990000;
        color:white;
        font-weight: bold;
        width:30%;
    }
    th>span:first-child {
        font-size: 1.5rem;
    }
    th>span:last-child {
        font-style: italic;
    }
    tr>td:last-child {
        text-align: left;
        padding: 5px 10px;
    }
    img {
        display:inline;
    }
   

    
    .box{
        position: relative;
        margin: 10px auto;
        width: 600px;
    }
    .tableplaceholder {
        display: block;

        height: 100px;
        background-color: white;
    }
    .box .header{
        cursor: pointer;
    }

</style>
<script>
    $(function () {
        $(".box").sortable({

            items: ".table",
        
            handle: ".header",
          
            placeholder: "tableplaceholder"
            
        });
       $(".header").dblclick(function(){
            let delCheck = confirm("영화를 삭제하시겠습니까?");
            if(delCheck){
                let korTitle = $(this).children(':first').text();
                let engTitle = $(this).children(':last').text();
                
                let table = $(this).parents('table');
                console.log(korTitle);
                console.log(table);
                console.log(engTitle);
                
                // table.remove();
                
                location.href = 'show.jsp?removeEngTitle=' + encodeURI(engTitle);
            }
        });

    });
    
</script>

</head>
<body>
	<div class="box">
	<c:forEach var="movie" items="<%=movieList %>">
		<table class="table">
			<tr>
				<th colSpan="2" class="header"><span>${movie.korTitle}</span><br><span>${movie.engTitle}</span></th>
			</tr>
			<tr>
				<td>박스 오피스</td>
				<td>$<fmt:formatNumber value="${movie.worldBoxOffice}" pattern="#,###"/></td>
			</tr>
			<tr>
				<td>개봉일</td>
				<td>
				<img width="20px" src="//w.namu.la/s/43a07e65f573eb41fffe67ac0d1008fa73b5c7a04a004ff9004ddf0680524c5c5bd8a30c724fd7966bd7d3a2f60d0bd17c3cc159dd41f704f9b6dc188a21346d58360bd75483a9ab136272549b3462b8443b1b09cc84c426569f3abbfcdcda80">
				${movie.releaseDate}
				</td>
			</tr>
		</table>
	</c:forEach>
	</div>
	
</body>
</html>