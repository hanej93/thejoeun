<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
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

</head>

<body>
	<h1>아이구 귀찮아...</h1>
	<table>
		<tr>
			<th s>아이디</th>
			<th>${marvelSpec.id}</th>
		</tr>
		<tr>
			<td>장르</td>
			<td>${marvelSpec.genre}</td>
		</tr>
		<tr>
			<td>감독</td>
			<td>${marvelSpec.director}</td>
		</tr>
		<tr>
			<td>제작</td>
			<td>${marvelSpec.scenario}</td>
		</tr>
		
		<tr>
			<td>제목</td>
			<td>${marvelSpec.title}</td>
		</tr>
		
		<tr>
			<td>제작</td>
			<td>${marvelSpec.scenario}</td>
		</tr>
		
		<tr>
			<td>감독</td>
			<td>${marvelSpec.producer}</td>
		</tr>
		
		<tr>
			<td>출연진</td>
			<td>${marvelSpec.actor}</td>
		</tr>
		
		<tr>
			<td>음악감독</td>
			<td>${marvelSpec.music}</td>
		</tr>
		
		<tr>
			<td>촬영시작</td>
			<td>${marvelSpec.beginFilming}</td>
		</tr>
		
		<tr>
			<td>촬영종료</td>
			<td>${marvelSpec.endFilming}</td>
		</tr>
		
		<tr>
			<td>개봉일</td>
			<td>${marvelSpec.releaseDate}</td>
		</tr>
		
		<tr>
			<td>상영시간</td>
			<td>${marvelSpec.runningTime}</td>
		</tr>
		
		<tr>
			<td>제작비</td>
			<td>${marvelSpec.productionCost}</td>
		</tr>
		<tr>
			<td>북미 박스오피스</td>
			<td>${marvelSpec.northAmericaBoxOffice}</td>
		</tr>
		<tr>
			<td>월드 박스오피스</td>
			<td>${marvelSpec.wordlBoxOffice}</td>
		</tr>
		<tr>
			<td>한국 관객 수</td>
			<td>${marvelSpec.koreanNumberOfAudience}</td>
		</tr>
		<tr>
			<td>상영 등급</td>
			<td>${marvelSpec.northAmericaBoxOffice}</td>
		</tr>
		<tr>
			<td>작성일</td>
			<td>${marvelSpec.wDate}</td>
		</tr>
		<tr>
			<td>수정일</td>
			<td>${marvelSpec.uDate}</td>
		</tr>
		
	</table>

	
	<a href="/marvel/list">리스트로 돌아가기</a>
</body>
</html>