<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	form{
		display: grid;
		grid-template-columns: 1fr 1fr;
		grid-auto-rows: minmax(50px, auto);
		width: 500px;
		gap : 1rem;
		position: relative;
		margin: 10px auto;
		border: 1px solid black;
		padding : 10px;
	}
	fieldset{
		display: flex;
		justify-content: space-around;
		grid-column: 1 / 3;
	}
	
	input:last-child{
		grid-column: 1 / 3;
	}
	


</style>
</head>
<body>
	<form action="result.jsp" method="get">
		<input type="text" name="num1" placeholder="숫자1">
		<input type="text" name="num2" placeholder="숫자2">
		<fieldset>
			<legend>연산자 선택</legend>
			<label><input type="radio" name="oper" value="+">+</label>
			<label><input type="radio" name="oper" value="-">-</label>
			<label><input type="radio" name="oper" value="*">*</label>
			<label><input type="radio" name="oper" value="/">/</label>
			<label><input type="radio" name="oper" value="%">%</label>
		</fieldset>
		<input type="submit" value="전송">
	</form>
</body>
</html>