<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	.container{
		display: grid;
		grid-template-columns: 1fr 3fr;
		grid-template-rows: 1fr 3fr 1fr;
		gap: 10px;
		width: 1100px;
		height: 1100px;
		border: 1px solid black;
		position: relative;
		margin: auto;
		padding: 10px;
	}
	.items{
		border: 1px solid black;
	}
	
	
	.items:nth-child(1) {
		grid-column: 1 / 3;
		grid-row: 1 / 2;
	}
	
	.items:nth-child(2) {
		grid-column: 1 / 2;
		grid-row: 2 / 3;
	}
	.items:nth-child(3) {
		grid-column: 2 / 3;
		grid-row: 2 / 3;
	}
	.items:nth-child(4) {
		grid-column: 1 / 3;
		grid-row: 3 / 4;
	}
	
	
</style>
</head>
<body>
	<div class=container>
		<div class=items>
		<jsp:include page="head.jsp"></jsp:include>
		</div>
		
		<div class=items>
		<jsp:include page="menu.jsp"></jsp:include>
		</div>
		
		<div class=items>
		<jsp:include page="contents.jsp"></jsp:include>
		</div>
		
		<div class=items>
		<jsp:include page="footer.jsp"></jsp:include>
		</div>
		
	</div>

</body>
</html>