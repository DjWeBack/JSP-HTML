<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
1�� �ڵ� ó��
2�� �ڵ� ó��
<%
//�� �������� ȭ�鿡�� ���� ���� �����.
//�ֳ��ϸ� �� ������ �ѱ氪���̱⶧���� ���� ���������� �������� ����.
//forwardó���� �Ͼ�� �ǹǷ� ���۰� �����
	String mem_id="test";//�̰��� getParameter�� �а�
request.setAttribute("mem_pw", "123");//�� ���� getAttribute�� �о�ߵ�.
%>
<jsp:include page="a2.jsp">
<jsp:param name="mem_id" value="<%=mem_id %>"/>
</jsp:include>
<!-- jsp:param�� ������� �׳� �� �ٿ��� ó���� �ؾ� ������ �ȶ� ��;;; -->
3�� �ڵ�ó�� �ȵ�

</body>
</html>