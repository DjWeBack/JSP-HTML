<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="/dev_jsp/themes/default/easyui.css">
	<link rel="stylesheet" type="text/css" href="/dev_jsp/themes/icon.css">
	<script type="text/javascript" src="/dev_jsp/js/jquery-1.12.0.js"></script>
	<script type="text/javascript" src="/dev_jsp/js/jquery.easyui.min.js"></script> 
<script type="text/javascript">
function login(){
	$("#f_login").attr("method","post");
	$("#f_login").attr("action","/dev_jsp/login6.do");
	$("#f_login").submit();
}
function addcan(){
	$('#d_insert').window('close');
	}
function addok(){
	$("#f_insert").attr("method","post");
	$("#f_insert").attr("action","/dev_jsp/login6.do");
	$("#f_insert").submit();
}	
function insert(){
	
	$('#d_insert').window({
    width:350,
    height:250,
    modal:true
});
$("#d_insert").show();
$('#a_mem_id').textbox({
	iconCls:'icon-man',
	iconAlign:'left'
})
$('#a_mem_name').textbox({
				iconCls:'icon-man',
				iconAlign:'left'
			})
			$(function(){
	   			 $('#a_mem_pw').passwordbox({
	       		 prompt: 'Password',
	       		iconCls:'icon-lock',
	       		iconAlign:'left',
	             showEye: true
	    });
	});
}


</script>
<%-- <%@ include file="/include/commonUI.jsp" %> --%> 
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
			$("#d_insert").hide();
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
		<td rowspan="4"><a id="btn"href="javascript:login()" class="easyui-linkbutton" data-options="iconCls:'icon-ok'">login</a><br>
		<a id="btn"href="javascript:insert()" class="easyui-linkbutton" data-options="iconCls:'icon-add'">add</a>
		</td>
		</tr>
		<tr>
		<td><input id="mem_pw" name="mem_pw" type="text" style="width:300px"></td>
		</tr>
</table>
</form>
<div id="d_insert">
  <center>
  <form id="f_insert">
  <input type="hidden" name="command" id="command" value="ok">
  <h3>회원가입</h3><br>
  
  <table>
	<tr>
		<td>아이디    :</td><td><input id="a_mem_id" name="a_mem_id" type="text" style="width:150px"></td>
	</tr>
    	<tr>
    		<td>이름       :</td><td><input id="a_mem_name" name="a_mem_name" type="text" style="width:150px"></td>
    	</tr>
    	
    	<tr>
			<td>패스워드 : </td><td><input id="a_mem_pw" name="a_mem_pw" type="text" style="width:150px"></td>
		</tr>
		
		<tr>
			<td colspan="2" align="center"><a id="a_btn_ok"href="javascript:addok()" class="easyui-linkbutton" data-options="iconCls:'icon-ok'">OK</a>
		<a id="a_btn_can"href="javascript:addcan()" class="easyui-linkbutton" data-options="iconCls:'icon-cancel'">Cancel</a>
			</td>
		
</table>
</form>
    </center>
</div>
</center>
</body>
</html>
