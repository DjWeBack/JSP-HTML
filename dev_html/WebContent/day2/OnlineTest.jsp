<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>�¶��� ����</title>
<script type="text/javascript">
	function conform() {
		 //�̸����� ���� ��������
		/* var v_testno = document.f_test.test_no.value;
		var v_testname = document.f_test.test_name.value;
		alert("�����ȣ:"+v_testno+",�̸�:"+v_testname);
		//���̵�� ���� ��������
		var v_testno = document.getElementById("test_no").value;
		var v_testname = document.getElementById("test_name").value;
		alert("�����ȣ2:"+v_testno+",�̸�2:"+v_testname);  */
		document.f_test.submit();
	}
</script>
</head>
<body>
<table align="center" border="1" width="900px" height="600px">
	<tr>
		<td valign="middle">
<!-- ����� ����ȭ�� ���� -->
	<form name="f_test" method="get" action="./OnlineConform.jsp">		
		<table width="250px" height="60px" align="center">
			<tr><td height="25px">�����ȣ : <input type="text" name="test_no"size="15"></td></tr>
			<tr><td height="25px">��&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;�� : <input type="text" name="test_name"size="15"></td></tr>
			<tr><td>�� : <input type="radio"> ��: <input type="radio">
			<tr><td height="30px"align="center">
				<input type="button" value="Ȯ��" onClick="conform()">
			</td></tr>
		</table>
	</form>	
<!-- ����� ���� ȭ�� �� -->		
		</td>
	</tr>
</table>
</body>
</html>