<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
<script type="text/javascript">
function login(){
	$("#f_login").attr("method","post");
	$("#f_login").attr("action","/dev_jsp/login6.do");
	$("#f_login").submit();
}
</script>
<%@ include file="../include/commonUI.jsp" %>
<!-- 	<link rel="stylesheet" type="text/css" href="../themes/default/easyui.css">
	<link rel="stylesheet" type="text/css" href="../themes/icon.css">
	<script type="text/javascript" src="../js/jquery-1.12.0.js"></script>
	<script type="text/javascript" src="../js/jquery.easyui.min.js"></script> -->

</head>
<body>
<center>
		<script type="text/javascript">
		$(document).ready(function(){
			$('#mem_id').textbox({
				iconCls:'icon-man',
				iconAlign:'left'
			})
		$(function(){
   			 $('#mem_pw').passwordbox({
       		 prompt: 'Password',
       		iconCls:'icon-lock',
       		iconAlign:'left',
             showEye: true
    });
});

		});
			
			</script>
			<form id="f_login">
			<input type="hidden" name="command" id="command" value="login">
<table border="1"width="250px" height="auto">
	<tr>
		<td><input id="mem_id" name="mem_id" type="text" style="width:300px"><br></td>
		<td rowspan="4"><a id="btn"href="javascript:login()" class="easyui-linkbutton" data-options="iconCls:'icon-ok'">login</a> <br>
		</td>
		</tr>
		<tr>
		<td><input id="mem_pw" name="mem_pw" type="text" style="width:300px"></td>
		</tr>
</table>
</form>
</center>
</body>
</html>
