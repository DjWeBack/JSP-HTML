<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>��ȣ Ȯ���ϱ�</title>
<script type="text/javascript" src="../js/jquery-1.12.0.js"></script>
<script type="text/javascript">
	function dmsgInit(){
		//alert("goȣ�⼺��");
		//keyup�̺�Ʈ�� ���� �Ǹ� �޼����� �����.
		$("#txtPw").keyup(function(){
			$("#d_msg").text("");
		});
		$("#txtPw2").keyup(function(){
			if($("#txtPw").val() != $("#txtPw2").val()){
				$("#d_msg").html("<font color='red'>��ȣ�� Ʋ���ϴ�.</font>");
			}else{
				$("#d_msg").html("<font color='blue'>��ȣ�� ��ġ�մϴ�.</font>");
			}
		});
	}
</script>
</head>
<body>
<script type="text/javascript">
	$(document).ready(function(){
		dmsgInit();
	});
</script>
<table style="border:lpx solid skyblue">  
  <tr>
	<td>��ȣ : </td><td><input type="password" id="txtPw" size="10"></td>
  </tr>
  <tr>	
  	<td>��ȣ Ȯ�� : </td><td><input type="password" id="txtPw2" size="10"></td>
  </tr>
</table> 		
<div id="d_msg">��ȣ�� �Է��Ͻÿ�.</div>
��ȣ : <textarea rows= "1" cols="40"></textarea><br>
��ȣ Ȯ�� : <textarea rows= "1" cols="40"></textarea><br>
<input type="button" value="Ȯ��" onClick="confirm()"> 
</body>
</html>