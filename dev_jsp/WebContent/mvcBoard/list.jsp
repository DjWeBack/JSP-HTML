<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>�۸��</title>
<script type="text/javascript">
function search() {
	
}
function boardinsert() {
	alert("�۾���");
	$('#d_insert').dialog({
		closed: false
		
	});
}
function insertcommit() {
	alert("�ۼ��Ǿ����ϴ�.");
	$("#f_insert").submit();
	}
</script>
<%@ include file="../include/commonUI.jsp" %>
</head>
<body>
<script type="text/javascript">
//&cb_type='+$("#cb_type").val()+'&sb_keyword='+$("#sb_keyword"),
$(document).ready(function(){
	$('#dg_list').datagrid({
		url:'./mvcBoard.bd?gubun=getBoardList',
		columns:[[
			{field:'B_NO',title:'�۹�ȣ',width:100},
			{field:'B_TITLE',title:'����',width:250},
			{field:'B_NAME',title:'�ۼ���',width:100},
			{field:'B_FILE',title:'÷������',width:250},
			{field:'B_HIT',title:'��ȸ��',width:150}
		]]
	});
	$('#pg_board').pagination({
	    total:2000,
	    pageSize:10
	});
	$('#d_insert').dialog({
		closed: true,
		 width: 300,
		 height: 400
	});
});
</script>
�۸��
<table align="center" width="900px" border="1">
<!-- �˻����� ȭ�� �߰��ϱ� -->
<form id="f_search">
	<tr>
		<td>
		<select id="cb_type" name="cb_type" class="easyui-combobox" name="type" style="width:100px;">
   			<option value="b_title">����</option>
    		<option value="b_content">����</option>
    		<option value="b_name">�ۼ���</option>
   		</select>
   		<input id="sb_keyword" name="sb_keyword" class="easyui-searchbox" style="width:300">
		<a id="btn" href="#" class="easyui-linkbutton" data-options="iconCls:'icon-search'" onclick="search()">�˻�</a>
		<a id="btn" href="#" class="easyui-linkbutton" data-options="iconCls:'icon-add'" align="right"onclick="boardinsert()">�۾���</a>
		</td>
	</tr>
<!-- ���ó�� ȭ�� �߰��ϱ� -->
	<tr>
		<td><table id="dg_list"></table></td>
		
	</tr>
<!-- ������ ���̼� ó��(pagination) -->
	<tr>
		<td><div id="pg_board" style="background:#efefef;border:1px solid #ccc;"></div></td>
	</tr>
	</form>
</table>


<!-- �۾��� ���̾� �α� ó��(writeForm.jspȭ�� ó��)
ó���� ���� ���·� �ִٰ� �۾��� ��ư�� Ŭ���ϸ� â�� ���.
 -->
 <div id="d_insert" class="easyui-dialog" title="�Խñ� �ۼ�" style="width:400px;height:200px;"
        data-options="iconCls:'icon-save',resizable:true,modal:true">
        <form action="./mvcBoard.bd?gubun=BoardInsert" method="post" id="f_insert">
    	�ۼ��� : <input id="in_name" name="in_name" class="easyui-textbox" style="width:300"><br>
    	������ : <input id="in_title" name="in_title" class="easyui-textbox" style="width:300"><br>
    	�۳��� : <input id="in_content" name="in_content" class="easyui-textbox" multiline="true" style="width:300;height:200px;"><br>
    	�н����� : <input id="in_pwd" name="in_pwd" class="easyui-passwordbox"style="width:300;"><br>
    	<a id="btn" href="#" class="easyui-linkbutton" data-options="iconCls:'icon-add'" onclick="insertcommit()"style="margin-left: 60px;margin-top: 20px;">�ۼ�</a>
    	<a id="btn" href="#" class="easyui-linkbutton" data-options="iconCls:'icon-cancel'" onclick="search()"style="margin-top: 20px;">���</a>
</form>
</div>

</body>
</html>