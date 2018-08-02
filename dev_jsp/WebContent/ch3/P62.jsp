<%@ page language="java" contentType="text/html; charset=EUC-KR"	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<!-- jsp역활
	 1)화면을 처리할때
	 2)json포멧 파일을 생성할때 - xxx.json포멧 파일 생성할 떄
		:json의 경우 구글의 Gson을 활용하므로 해당 없음.
	 3)xml포멧파일을 생성할 때
	 	:xml의 경우 개발자가 인위적으로 파일포팻을 생성하므로 필요함.
	 	페이지 다이렉티브 자리에 공백줄이 들어가는 문제 해결하기 
	 	 -->

<%
	//mime type 변경시 response객체를 활용함.
	 response.setContentType("text/html; charset=euc-kr"); 
	out.print("<table border='1' width='300'>");
	out.print("<tr><td>404</td></tr>");
	out.print("<tr><td>공과대학 5강의동</td></tr>");
	out.print("</table>");
	%>