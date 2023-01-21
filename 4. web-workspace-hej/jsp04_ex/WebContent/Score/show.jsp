<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="data.jspf" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	div>div{
		text-align:center;
	}
	
	.container{
		display: grid;
		grid-template-areas:
		"name name name name name"
		"kor eng math app le"
		"stat stat stat stat stat";
		grid-auto-rows: minmax(50px, auto);
		
		border: 1px solid black;
		gap: 5px;
		padding: 5px;
		
		font-size: 1.5rem;
		font-weight: bold;
	}
	.container2{
		display: grid;
		grid-template-areas:
		"tot avg";
		gap: 5px;
		grid-area:stat;
		margin:0px;
	}
	
	.items{
		border: 1px solid black;
		padding : 5px;
	}
	.container2_item{
		border: 1px solid black;
		padding : 5px;
		
	}
	
	.items:nth-child(1) {
		grid-area:name;
	}
	.items:nth-child(2) {
		grid-area:kor;
	}
	.items:nth-child(3) {
		grid-area:eng;
	}
	.items:nth-child(4) {
		grid-area:math;
	}
	.items:nth-child(5) {
		grid-area:app;
	}
	.items:nth-child(6) {
		grid-area:le;
	}
	.container2_item:nth-child(1) {
		grid-area:tot;
	}
	.container2_item:nth-child(2) {
		grid-area:avg;
	}

	
</style>
</head>
<body>
	<div class="container">
	
		<div class="items"><%=name %></div>
		<div class="items">국어<br><%=kor %></div>
		<div class="items">영어<br><%=eng %></div>
		<div class="items">수학<br><%=math %></div>
		<div class="items">사회<br><%=app %></div>
		<div class="items">과학<br><%=le %></div>
		<div class="itmes container2">
			<div class="container2_item">총점<br><%=tot %></div>
			<div class="container2_item">평균<br><%=avg %></div>
		</div>
	</div>
</body>
</html>