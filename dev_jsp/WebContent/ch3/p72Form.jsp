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
get��� : ��ũ�� �� �� �ִ�.
		 �ѱ� �� �ִ� ���� ������ �ִ�.
		 �����׽�Ʈ�� �����ϴ�.
		 �ѱ�ó���� erver.xml�� �Ѵ�.
		 ���ͼ�Ʈ�� ���� �� �ִ�.
post��� : ��ũ�� �� �� ����.
		   �ѱ� �� �ִ� ���� ������ ����.
		   �����׽�Ʈ�� �Ұ����ϴ�.
		   ���� ���� �ȵȴ�.
		 toKor�޼ҵ�� �ѱ� ó����.
		  ���ͼ�Ʈ �� �� ����.(����Ǿ� �־� ������ �ȵǹǷ� ������ ������ �ѱ�.)  
 -->
 <!-- ������ �̵��ϱ� -->
 <!-- 
 �ڹٽ�ũ��Ʈ���� ������ �̵� �ڵ�
 ajax������ �̵� �ڵ�
 jsp�� �������� ������ �̵� �ڵ�
 a�±׿��� ������ �̵� �ڵ�
 �����ۿ��� ������ �̵��ڵ�
 easuyi���� ������ �̵��ڵ�
 
  -->
<!-- <form action="p72.jsp" method="get"> -->
<form action="/dev_jsp/Login.do" method="get">
	<input type="text" name="name"><br>
	<input type="text" name="hp"><br>
	<input type="text" name="zipcode"><br>
	<input type="text" name="address"><br>
	<input type="checkbox" name="pet" value="������">������
	<input type="checkbox" name="pet" value="�����">�����
	<input type="checkbox" name="pet" value="����">����
	<input type="submit" name="����">
</form>
</body>
</html>