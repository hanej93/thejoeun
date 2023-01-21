<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<style>
.boxAll {
	width: 500px;
	border: 1px solid #dcdcdc;
}

.box {
	width: 100%;
	height: 50px;
	line-height: 50px;
	padding-left: 20px;
}

.button {
	height: 50px;
	margin-bottom: 20px;
}

.buttonDetale {
	background: gray;
	border: none;
	color: white;
}

.header {
	width: 480px;
	height: 160px;
	font-size: 40px;
	line-height: 150px;
	background: #dcdcdc;
	padding-left: 20px;
}

hr {
	background-color: #dcdcdc;
}
div>div:last-child {
	display:flex;
	justify-content: center;
}

</style>
<body>
	<form action="process.jsp" method="post">
		<div class="boxAll">
			<div class="header">영화 장바구니</div>
			<br>
			<div class="box">
				<label for="korName"> 영화한글제목 </label><input type="text"
					name="korName" id="korName" placeholder="영화 한글제목을 입력하세요">
			</div>
			<hr>
			<div class="box">
				<label for="engName"> 영화영어제목 </label><input type="text"
					name="engName" id="engName" placeholder="영화 영어제목을 입력하세요">
			</div>
			<hr>
			<div class="box">
				<label for="boxOffice"> 박스오피스 </label><input type="number" min=0
					name="boxOffice" id="boxOffice" placeholder="박스오피스를 입력하세요">
			</div>
			<hr>
			<div class="box">
				<label for="openingDate"> 개봉일 </label><input type="date"
					name="openingDate" id="openingDate">
			</div>
			<hr>
			<div class="box button">
				<input type="submit" class="buttonDetale" value="영화 추가">
			</div>
		</div>
	</form>
</body>
</html>