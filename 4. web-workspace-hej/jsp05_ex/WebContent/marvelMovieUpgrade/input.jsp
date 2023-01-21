<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>


<!DOCTYPE html>
<html>

<head>
	<meta charset="UTF-8">
	<title>영화 정보 입력</title>
	<style>
		* {
			margin: 0;
			padding: 0;
		}

		form {
			text-align: center;
			width: 500px;
			height: 300px;
			border: 2px solid #770000;
			margin: 10px auto;
			padding: 10px;

			display: flex;
			flex-wrap: wrap;
			font-weight: bold;
		}

		input {
			margin: 5px;
			width: 80%;
			height: 50%;
		}

		form>* {
			flex: 1 1 40%;
			margin: 5px;
		}

		form>*:first-child {
			flex: 1 1 80%;
			align-self: center;
		}

		form>*:last-child {
			flex: 1 1 80%;
			align-self: center;
		}

		button {
			width: 200px;
			height: 40px;
		}

		input::-webkit-input-placeholder {
			text-align: center;
		}

		#errorText {
			color: red;
		}

		.hidden {
			display: none;
		}
	</style>
	<script>
		window.addEventListener("DOMContentLoaded", function () {

			document.querySelector("form").onsubmit = function () {
				var inputs = document.querySelectorAll("input");
				
				for (const input of inputs) {
					if (input.value == "") {
						document.querySelector("#errorText").classList.remove("hidden");
						input.focus();
						return false;
					}
				}
			};
		});
	</script>
</head>

<body>

	<form action="proc.jsp" method="post">
		<div>
			<h3>영화정보 입력</h3>
		</div>
		<div>
			<input type="text" name="korTitle" placeholder="영화제목(한글)">
		</div>
		<div>
			<input type="text" name="engTitle" placeholder="영화제목(영어)">
		</div>
		<div>
			<label>박스오피스</label><input type="number" name="worldBoxOffice" min="0" max="9223372036854775807" placeholder="박스오피스">
		</div>
		<div>
			<label>개봉일</label><input type="date" name="release" max="9999-12-31">
		</div>
		<div>
			<button>입력완료</button>
			<br><span id="errorText" class="hidden">데이터를 입력바랍니다.</span>
		</div>
	</form>
</body>

</html>