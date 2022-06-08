<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>계산기</title>
		<style>
			.cal_main{
				border: 2px solid #000000;
				margin: 0 auto;
				width: 300px;
				font-size: 30px;
			}
			.result{
				margin: 5px;
				width: 100%;
				height: 80px;	
			}
			.number_button{
				width: 30%;
				height: 50px;
				border: 1px solid #000000;
				display: inline-block;
				cursor: pointer;
			}
			.number_button_zero{
				width: 95%;
				height: 50px;
				border: 1px solid #000000;
				display: inline-block;
				cursor: pointer;
			}
			.cal_button{
				width: 16%;
				height: 50px;
				border: 1px solid #000000;
				display: inline-block;
				cursor: pointer;
			}
			.line{
				margin: 5px 0px;
				text-align: center;
			}
		</style>
	</head>
	<body>
		<div class="cal_main">
			<div class="result" id="result"></div>
			<div class="line">
				<span class="number_button" onclick="btn_click(7)">7</span>
				<span class="number_button" onclick="btn_click(8)">8</span>
				<span class="number_button" onclick="btn_click(9)">9</span>
			</div>
			<div class="line">
				<span class="number_button" onclick="btn_click(4)">4</span>
				<span class="number_button" onclick="btn_click(5)">5</span>
				<span class="number_button" onclick="btn_click(6)">6</span>
			</div>
			<div class="line">
				<span class="number_button" onclick="btn_click(1)">1</span>
				<span class="number_button" onclick="btn_click(2)">2</span>
				<span class="number_button" onclick="btn_click(3)">3</span>
			</div>
			<div class="line">
				<span class="number_button_zero" onclick="btn_click(0)">0</span>
			</div>
			<div class="line">
				<span class="cal_button" onclick="btn_click('+')">+</span>
				<span class="cal_button" onclick="btn_click('-')">-</span>
				<span class="cal_button" onclick="btn_click('/')">÷</span>
				<span class="cal_button" onclick="btn_click('*')">x</span>
				<span class="cal_button" onclick="btn_click('=')">=</span>
			</div>
		</div>
		
		<script>
			let firstValue = '';
			let secondValue = '';
			let mark = '';
		
			function btn_click(param) {
				
				/*var firstText = document.getElementById("result").innerHTML;
				document.getElementById("result").innerHTML = firstText + param;*/
				document.getElementById("result").innerHTML += param;
				
				if (param == '=') {
					//CalFunction Class 연산기능 활용해서 결과 가지고오기
					let data = 'firstValue=' + firstValue + '&' + 'secondValue=' + secondValue + '&' + 'mark=' + encodeURIComponent(mark);
					location.href = '/model1/gocalculate.jsp?' + data;
				} else{
					if (param == '+' || param == '-' || param == '/' || param == '*'){
						mark = param;
					} else {
						if (firstValue == '') {
							firstValue = param;
						} else {
							secondValue = param;
						}
					}
					document.getElementById("result").innerHTML = firstValue + mark + secondValue;
				}
			}
		</script>
	</body>
</html>