<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%=session.getAttribute("bread").toString() %>
<%
	String myName="위백";
	request.setAttribute("myName", myName);
	RequestDispatcher view = request.getRequestDispatcher("account.jsp");
	view.forward(request, response);
	/*
	나는 분명 pageDirective2.jsp를 요청했는데 실제 화면에 출력되는 건 account.jsp페이지가 출력됨.
	톰캣서버가 요청이 유지되는 것으로 판단하여 이름 정보를 account.jsp에서 출력하게됨.
	url은 분명 pageDirective2.jsp라고 되어 있는데 보여지는 화면은 account.js화면이 출력됨.
	
	*/
	
%>
</body>
</html>