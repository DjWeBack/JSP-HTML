<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!-- 
    	javascript�ڵ�� html�±׾ȿ� ����(head�±׾�,body�±�) �� �� �ִ�.
    	head�±״� ������ �� �����.(����-��������, �Լ�), (�ҷ��� �����.)
    	body�±״� ���� �θ��� �ʾƵ� ������ ��.(���ǻ���-dom��������)
    	:DOM������ ������ �������� �˰� �ִ�.
    	1)DOM������ �Ϸ�Ǿ��� ���� �������� ���� �ʹ�. - ready()ȣ��
    	2)�Լ��� �Ķ���� �ڸ����� �ڵ�����(����) ���� - ���ǻ��� {}
    	3)���߰�ȣ�� ���߰�ȣ�ȿ��� �Ӽ��߰�, �̺�Ʈ ó���� ������.
     -->
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
<script type="text/javascript" src="../js/jquery-1.12.0.js"></script>
<script type="text/javascript" src="../js/jquery.easyui.min.js"></script>
<link rel="stylesheet" type="text/css"
	href="../themes/default/easyui.css">
<link rel="stylesheet" type="text/css" href="../themes/icon.css">

</head>
<body>
	<table border="1" width="500px" class="easyui-datagird" title="�޽���">
		<thead>
			<tr>
				<th data-options="field:nickName,width:120">��ȭ��</th>
				<th data-options="field:roomName,width:200">���̸�</th>
				<th data-options="field:status,width:120">����</th>
			</tr>

		</thead>
		<tbody>
			<tr>
				<td>001</td>
				<td>002</td>
				<td>003</td>
			</tr>
		</tbody>
	</table>
</body>
</html>