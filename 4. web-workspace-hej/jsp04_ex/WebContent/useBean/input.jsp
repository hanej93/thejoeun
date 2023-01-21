<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	*{
		padding: 0;
		margin: 0;
	}
	
	form {
		display: grid;
		grid-templet-columns: 1fr 1fr 1fr;
		grid-templet-rows: 1fr 1fr 1fr;
		gap: 10px; 
		
		width : 500px;
		border: 1px solid black;
		padding : 10px;
	}
	
	.item:nth-child(1) {
		display: flex;
		grid-column: 1/4;
		grid-row: 1/2;
		justify-content: space-around;
	}
	.item:nth-child(1)>*{
		flex: 0 0 30%;
	}
	
	.item:nth-child(n+2):nth-child(-n+4) {
		text-align: center;
	}
	
	.item:nth-child(2) {
		grid-column: 1/2;
		grid-row: 2/3;
	}
	.item:nth-child(3) {
		grid-column: 2/3;
		grid-row: 2/3;
	}
	.item:nth-child(4) {
		grid-column: 3/4;
		grid-row: 2/3;
	}
 	.item:nth-child(5) {
 		text-align:center;
		grid-column: 1/4;
		grid-row: 3/4;
	}
</style>
</head>
<body>
	<form action="proc.jsp" method="get">
		<div class=item>
			<input type="text" name="name" placeholder="이름을 입력해주세요"> <input
				type="number" name="age" min="1" max="100" placeholder="나이를 입력해주세요">
			<input type="date" name="birth">
		</div>
		<div class=item>
			<label>국어 점수</label> <input type="range" name="kor" min="0" max="100"
				step="1"
				oninput="document.getElementById('kor').innerText=this.value;">
			<span id="kor"></span>
		</div>
		<div class=item>
			<label>영어 점수</label> <input type="range" name="eng" min="0" max="100"
				step="1"
				oninput="document.getElementById('eng').innerText=this.value;">
			<span id="eng"></span>
		</div>
		<div class=item>
			<label>국어 점수</label> <input type="range" name="math" min="0"
				max="100" step="1"
				oninput="document.getElementById('math').innerText=this.value;">
			<span id="math"></span>
		</div>
		<div class=item>
			<input type="submit" value="입력 완료">
		</div>
	</form>
</body>
</html>