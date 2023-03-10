<%@page import="com.myapp.marvel.Marvel"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%
	
	ArrayList<Marvel> movieList = (ArrayList<Marvel>)request.getAttribute("movieList");
	
	String removeEngTitle = (String)request.getParameter("removeEngTitle");
	
	if(removeEngTitle != null){
		Iterator<Marvel> itMovie = movieList.iterator();
		while(itMovie.hasNext()){
			Marvel movie = itMovie.next();
			if(movie.getTitleEng().equals(removeEngTitle)){
				itMovie.remove();
			}
		}
	}
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>์ํ ์กฐํ</title>
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
    
    
    var popupWindow;
    $(".table").dblclick(function(){
        console.log("test");
        let updateCheck = confirm("์ํ๋ฅผ ์์?ํ์๊ฒ?์ต๋๊น?");
        if(updateCheck){
            let titleEng = $(this).children(':first').children(':first').children(':first').children(':last').text();
            console.log(titleEng);
            
            var form = document.createElement('form'); // ํผ๊ฐ์ฒด ์์ฑ
            var objs;
            objs = document.createElement('input'); // ๊ฐ์ด ๋ค์ด์๋ ๋์์ ํ์
            objs.setAttribute('type', 'text'); // ๊ฐ์ด ๋ค์ด์๋ ๋์์ type
            objs.setAttribute('name', 'titleEng'); // ๊ฐ์ฒด์ด๋ฆ
            objs.setAttribute('value', titleEng); //๊ฐ์ฒด๊ฐ
            form.appendChild(objs);
            form.setAttribute('method', 'get'); //get,post ๊ฐ๋ฅ
            form.setAttribute('action', "/marvel/update"); //๋ณด๋ด๋ url
            form.setAttribute('target', "popup_window"); 
            document.body.appendChild(form);
            
            popupWindow = window.open("", "popup_window", 'width=1000px,height=500px,toolbars=no,scrollbars=no');
     		
            console.dir(popupWindow);
            
            form.submit();
        	form.remove();
            return false;
            
			
            
        }
    });

    $(".header").dblclick(function (e) {
        console.log(e);
        let delCheck = confirm("์ํ๋ฅผ ์ญ์?ํ์๊ฒ?์ต๋๊น?");
        if (delCheck) {
            let korTitle = $(this).children(':first').text();
            let titleEng = $(this).children(':last').text();

            let table = $(this).parents('table');
            console.log(korTitle);
            console.log(table);
            console.log(titleEng);

            // table.remove();

            // location.href = '/marvel/list?removeEngTitle=' + encodeURI(engTitle);

            var form = document.createElement('form'); // ํผ๊ฐ์ฒด ์์ฑ
            var objs;
            objs = document.createElement('input'); // ๊ฐ์ด ๋ค์ด์๋ ๋์์ ํ์
            objs.setAttribute('type', 'text'); // ๊ฐ์ด ๋ค์ด์๋ ๋์์ type
            objs.setAttribute('name', 'titleEng'); // ๊ฐ์ฒด์ด๋ฆ
            objs.setAttribute('value', titleEng); //๊ฐ์ฒด๊ฐ
            form.appendChild(objs);
            form.setAttribute('method', 'get'); //get,post ๊ฐ๋ฅ
            form.setAttribute('action', "/marvel/delete"); //๋ณด๋ด๋ url
            document.body.appendChild(form);
            form.submit();
        }
        return false;

    });
    
    $(".header span:last-child").click(function (e){
		
    	let check = confirm("์์ธ๋ณด๊ธฐ");
    	if(check){
    		var titleEng = $(this).text();
    		
    		 var form = document.createElement('form'); // ํผ๊ฐ์ฒด ์์ฑ
             var objs;
             objs = document.createElement('input'); // ๊ฐ์ด ๋ค์ด์๋ ๋์์ ํ์
             objs.setAttribute('type', 'text'); // ๊ฐ์ด ๋ค์ด์๋ ๋์์ type
             objs.setAttribute('name', 'titleEng'); // ๊ฐ์ฒด์ด๋ฆ
             objs.setAttribute('value', titleEng); //๊ฐ์ฒด๊ฐ
             form.appendChild(objs);
             form.setAttribute('method', 'get'); //get,post ๊ฐ๋ฅ
             form.setAttribute('action', "/marvel/spec"); //๋ณด๋ด๋ url
             document.body.appendChild(form);
             form.submit();
    		
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
				<th colSpan="2" class="header"><span>${movie.title}</span><br><span>${movie.titleEng}</span></th>
			</tr>
			<tr>
				<td>๋ฐ์ค ์คํผ์ค</td>
				<td>$<fmt:formatNumber value="${movie.worldBoxOffice}" pattern="#,###"/></td>
			</tr>
			<tr>
				<td>๊ฐ๋ด์ผ</td>
				<td>
				${movie.releaseDate}
				</td>
			</tr>
		</table>
	</c:forEach>
	</div>
	
</body>
</html>