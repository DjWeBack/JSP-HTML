<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
<!-- �����ڵ� ���� -->
	<link rel="stylesheet" type="text/css" href="../themes/default/easyui.css">
	<link rel="stylesheet" type="text/css" href="../themes/icon.css">
	<script type="text/javascript" src="../js/jquery-1.12.0.js"></script>
	<script type="text/javascript" src="../js/jquery.easyui.min.js"></script>
</head>
<body>
<script type="text/javascript">
	$("document").ready(function(){
/* 		$("#dg_member").datagrid({
			width:500,
			height:250,
			singleSelect:true,
			url:"../json/memberJSON.json",
		    columns:[[
		        {field:'mem_id',title:'���̵�',width:100},
		        {field:'mem_name',title:'�̸�',width:150},
		        {field:'mem_gender',title:'����',width:50,align:'right'},
		        {field:'mem_hp',title:'HP',width:120,align:'center'}
		    ]],
		    onLoadSuccess:function(){
		    	alert("ok");
		    },
		    onLoadError:function(){
		    	alert("fail");
		    },
		    onDblClickRow:function(index,row){
		    	//alert("����Ŭ��");
		    	//document.write("index:"+index+", row:"+row);
		    	alert("index:"+index+", row:"+row
		    	     +", �̸�:"+row.mem_name+", hp:"+row.mem_hp);
		    }
		});//��ü-�Ӽ��� �Լ� */
	});
</script>
	<table id="dg_member" class="easyui-datagrid" width="500px" 
	data-options="url:'../json/memberJSON.json',fitColumns:true,singleSelect:true">
		<thead>
			<tr>
				<th data-options="field:'mem_id',width:120">���̵�</th>
				<th data-options="field:'mem_name',width:150">�̸�</th>
				<th data-options="field:'mem_gender',width:60">����</th>
			</tr>
		</thead>
		<tbody>
<%
	for(int i=0;i<3;i++){
%>		
			<tr>
				<td><%out.print("test"); %></td>
				<td><%out.print("�庸��"); %></td>
				<td><%out.print("��"); %></td>
			</tr>
<%
	}
%>			
		</tbody>
	</table>
</body>
</html>























