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
	String myName="����";
	request.setAttribute("myName", myName);
	RequestDispatcher view = request.getRequestDispatcher("account.jsp");
	view.forward(request, response);
	/*
	���� �и� pageDirective2.jsp�� ��û�ߴµ� ���� ȭ�鿡 ��µǴ� �� account.jsp�������� ��µ�.
	��Ĺ������ ��û�� �����Ǵ� ������ �Ǵ��Ͽ� �̸� ������ account.jsp���� ����ϰԵ�.
	url�� �и� pageDirective2.jsp��� �Ǿ� �ִµ� �������� ȭ���� account.jsȭ���� ��µ�.
	
	*/
	
%>
</body>
</html>