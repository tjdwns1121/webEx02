<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action ="/webEx02/param" method ="post">
		<label for ="gender"> 성별 : </label>
		<input type ="radio" id = "gender" name = "gender" value ="남자" checked> 남자
		<input type ="radio" id = "gender" name = "gender" value ="여자" > 여자 <br><br>
		<label for="chk_mail"> 메일 정보 수신 여부 : </label>
		<input type="radio" id="chk_mail" name="chk_mail" value="yes" checked>수신
		<input type="radio" id="chk_mail" name="chk_mail" value="no">거부 <br><br>
		<label for="item"> 관심 항목을 선택하세요 : </label>
		<input type="checkbox" name="item" value="신발">신발
		<input type="checkbox" name="item" value="가방">가방
		<input type="checkbox" name="item" value="벨트">벨트
		<input type="checkbox" name="item" value="모자">모자
		<input type="checkbox" name="item" value="시계">시계<br><br>
		<label for="job"> 직업</label>
		<select id="job" name="job" size="1">
			<option value="">선택하세요</option>
			<option value="학생">학생</option>
			<option value="공무원">공무원</option>
			<option value="회사원">회사원</option>
			<option value="교사">교사</option>
			<option value="군인">군인</option>		
		</select>
		<br><br>
		
		<label for="content"> 간단한 가입 인사를 적어주세요^o^ </label>
		<textarea id="content" name="content" rows ="3" cols="35"></textarea><br>
		<input type ="submit" value ="전송">
	
	</form>

</body>
</html>