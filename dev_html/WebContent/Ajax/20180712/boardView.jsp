<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>�ǸŰ���</title>
<link rel="stylesheet" type="text/css" href="../css/boards.css">
<script type="text/javascript" src="../js/jquery-1.12.0.js"></script>
<script type="text/javascript">
	function createRequest(){
		try{
			request = null;
		}
		if(request==null){
			alert("Error creating XMLHttpRequest Object!!!!")
		}
	}
	function account(){
		createRequest();
		var url = "./boardAction.jsp?"+new Date().getTime();
		request.open("GET",url,true);
		request.onreadystatechange = process;
		request.send(null);
	}
	function process(){
		alert("���°� : "+request.readyState);
		if(request.readyState==4){
			alert("�������� ���� ������°�[���� ��� 200,404,405,500] : "+request.status);
			
			var newTotal = request.responseText;
			alert("���� ����� �Ǹŷ� : "+new Total);
		}
	}
</script>
</head>
<body>
	<h2>����ũ ���� �Ǹ���Ȳ</h2>
	<table border="1" width="300px" height="80px">
		<tr>
			<th width="130px">�����Ǹŷ�</th>
			<td width="170px"><span id="board_sold">12</span></td>
		</tr>
		<tr>
			<th width="130px">�Һ��ڰ�</th>
			<td width="170px"><span id="price">3800000</span></td>
		</tr>
		<tr>
			<th width="130px">���Ű�</th>
			<td width="170px"><span id="cost">2500000</span></td>
		</tr>
	</table>
	<br>
	<input type="button" value="������?" onClick="account()" />
	<div id="d_margin">�� �����ݾ��� XXXXXXX�Դϴ�.</div>
</body>
</html>