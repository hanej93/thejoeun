<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="result01.jsp" method="get">
		<input type="text" name="name" placeholder="이름을 입력해주세요">
		<input type="text" name="age" placeholder="나이를 입력해주세요">
		<input type="text" name="address" placeholder="주소를 입력해주세요">
		<input type="email" name="email" placeholder="이메일을 입력해주세요">
		<input type="date" name="date">
		<fieldset>
			<legend>성별</legend>
			<input type="radio" name="gender" value="male" id="male"><label for="male">남</label>
			<input type="radio" name="gender" value="female" id="female"><label for="female">여</label>
		</fieldset>
		<select name="lunch">
			<optgroup label="점심메뉴">
				<option value ="돈가스">돈가스</option>
				<option value ="피자">피자</option>
				<option value ="스파게티">스파게티</option>
			</optgroup>
		</select>
		<fieldset>
			<legend>취미</legend>
			<input type="checkbox" name="hobbies" value="Starcraft" id="starcraft"><label for="starcraft">Starcraft</label>
			<input type="checkbox" name="hobbies" value="Battleground" id="battleground"><label for="battleground">Battleground</label>
			<input type="checkbox" name="hobbies" value="LeagueOfLegend" id="LeagueOfLegend"><label for="LeagueOfLegend">LeagueOfLegend</label>
		</fieldset>
		<input type="submit" value="보내기">
	</form>
</body>
</html>