<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
<script type="text/javascript" src="/dev_jsp20180417/js/jquery-1.12.0.js"></script>
</head>
<body>
<!-- 
get방식 : 링크를 걸 수 있다.
		 넘길 수 있는 값에 제한이 있다.
		 단위테스트가 가능하다.
		 한글처리는 erver.xml에 한다.
		 인터셉트를 당할 수 있다.
post방식 : 링크를 걸 수 없다.
		   넘길 수 있는 값에 제한이 없다.
		   단위테스트가 불가능하다.
		   값이 노출 안된다.
		 toKor메소드로 한글 처리함.
		  인터셉트 할 수 없다.(포장되어 있어 노출이 안되므로 무조건 서버로 넘김.)  
 -->
 <!-- 페이지 이동하기 -->
 <!-- 
 자바스크립트에서 페이지 이동 코드
 ajax페이지 이동 코드
 jsp나 서블릿에서 페이지 이동 코드
 a태그에서 페이지 이동 코드
 폼전송에서 페이지 이동코드
 easuyi에서 페이지 이동코드
 
  -->
<!-- <form action="p72.jsp" method="get"> -->
<form action="/dev_jsp/Login.do" method="get">
	<input type="text" name="name"><br>
	<input type="text" name="hp"><br>
	<input type="text" name="zipcode"><br>
	<input type="text" name="address"><br>
	<input type="checkbox" name="pet" value="강아지">강아지
	<input type="checkbox" name="pet" value="고양이">고양이
	<input type="checkbox" name="pet" value="돼지">돼지
	<input type="submit" name="전송">
</form>
</body>
</html>