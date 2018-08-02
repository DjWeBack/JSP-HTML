<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
<!-- �����ڵ� ���� -->
	<link rel="stylesheet" type="text/css" href="../themes/default/easyui.css">
	<link rel="stylesheet" type="text/css" href="../themes/icon.css?1">
	<link rel="stylesheet" type="text/css" href="../demo/demo.css">
	<script type="text/javascript" src="../js/jquery-1.12.0.js"></script>
	<script type="text/javascript" src="../js/jquery.easyui.min.js"></script>
	<script type="text/javascript">
	    function myformatter(date){
	        var y = date.getFullYear();
	        var m = date.getMonth()+1;
	        var d = date.getDate();
	        return y+'-'+(m<10?('0'+m):m)+'-'+(d<10?('0'+d):d);
	    }
	    function myparser(s){
	        if (!s) return new Date();
	        var ss = (s.split('-'));
	        var y = parseInt(ss[0],10);
	        var m = parseInt(ss[1],10);
	        var d = parseInt(ss[2],10);
	        if (!isNaN(y) && !isNaN(m) && !isNaN(d)){
	            return new Date(y,m-1,d);
	        } else {
	            return new Date();
	        }
	    }	
		function idSearch(){
			alert("�˻�");
		}
		//���߰�
		function addRow(){
			$('#dg_member').datagrid('appendRow',{
				mem_id: '',
				mem_name: '',
				mem_gender: '',
				mem_hp:''
			});
		}
		//�����
		function delRow(index){
			//alert("������ �ο��� index:"+index);
			$('#dg_member').datagrid('deleteRow',index);//ȭ��󿡼��� ����. DB���� �����Ǵ� �� �ƴ�.			
		}
		//��ȸ ó��
		function search1(){
			//alert("��ȸ ȣ�� ����");//document.write();//���� ��ü �ʱ�ȭ
			$("#dg_member").datagrid({
				url:"./jsonBoard.jsp",
			});
		}
		//���ȭ�� ���� ó��
		function add(){
			//alert("��� ȣ�� ����");
			$('#dlg_boardadd').dialog('open');
		}
		//����ó��
		function pencil(){
			alert("���� ȣ�� ����");
		}
		//����ó��
		function cut(){
			//�� �����ϰ� ���� �ο� �����Ѱž�?
			//������ �ο� ������ ������ ��
			var row = $("#dg_member").datagrid('getSelected');//������Ʈ
			if(row==null){
				return;//cut�Լ� Ż��
			}
			//���� ������ �ο��� �ε��� ������ �� �� �ִٸ� �����ٵ�........
			var sindex = $("#dg_member").datagrid('getRowIndex',row);
			delRow(sindex);
			//alert(row);//Object....
			//alert(row.mem_id+", index������? "+sindex);
		}
		//����
		function save(){
			alert("����ȣ�� ����");
		}
		function order2(){
			alert("����ȣ�� ����");
		}
		//���ȭ�鿡�� �����ư ����
		function boardIns(){//���� ����Ŭ�������� INSERTó��
			//alert("DB������ �����Ͽ� INSERTó��");
			$("#f_memIns").attr("method","get");
			$("#f_memIns").attr("action","./boardIns.jsp");//memInsAction.jsp���� DB�� INSERTó���� ����.
			$("#f_memIns").submit();//�� �� �����PC���� ��Ĺ������ ������ �Ͼ.		
			$('#dlg_boardadd').dialog('close');
		}
		</script>
</head>
<body>
<script type="text/javascript">
	$("document").ready(function(){
		$("#dg_member").datagrid({
			width:600,
			height:450,
			title:"ȸ������",
			toolbar:"#tb_member",
			singleSelect:true,
			selectOnCheck:false,/* checkbox �߰��� ������ ��.-API ���� �ҽ����� ��������. */
			//url:"../json/memberJSON.json",
/* 		    columns:[[
		        {field:'mem_ck',title:'����',checkbox:'true',width:50},
		        {field:'mem_id',title:'���̵�',width:100, sortable:'true'},
		        {field:'mem_name',title:'�̸�',width:150},
		        {field:'mem_gender',title:'����',width:50,align:'right'},
		        {field:'mem_hp',title:'HP',width:120,align:'center'}
		    ]], */
		    onLoadSuccess:function(){
		    	//alert("ok");
		    },
		    onLoadError:function(){
		    	alert("fail");
		    },
		    onDblClickRow:function(index,row){
		    	//alert("����Ŭ��");
		    	//document.write("index:"+index+", row:"+row);
		    	//alert("index:"+index+", row:"+row+", �̸�:"+row.mem_name+", hp:"+row.mem_hp);
		    },
		    onCheck:function(index,row){
		    	}
		    });
		    	
		//////////////////////end of datagrid
		$("#pn_member").pagination({
			pageSize:10,
			total:300,
			//�±׳� �Ӽ����� ��ũ��Ʈ�� �߰��� �Ӽ��� �켱��.
			pageList:[10,15,20,25]
		});
	});
</script>
	<!--============================= ���� ���� ==============================-->
	<div id="tb_member">
	<table>
	<!-- �˻���� �߰��ϱ� ���� -->
		<tr><!-- ���̵� �˻� and �޷�������Ʈ �߰� 2�� -->
			<td>
			<input id="ss" class="easyui-searchbox" style="width:200px"
        			data-options="searcher:idSearch,prompt:'���̵��Է�'"></input>
        	<!-- ����� �߰� -->
        	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;�����	
        	<input class="easyui-datebox" labelPosition="top" data-options="formatter:myformatter,parser:myparser" style="width:150;">
			</td>
		</tr>
	<!-- �˻���� �߰��ϱ�  ��   -->
	<!--============================= ��ư �߰� ���� ============================-->
		<tr><!-- ��ư �߰� 1�� -->
			<td>	
	    <a href="#" class="easyui-linkbutton" iconCls="icon-search" plain="true" onclick="javascript:search1()">��ȸ</a>
	    <a href="#" onclick="javascript:addRow()">���߰�</a>
	    <a href="#" onclick="javascript:delRow(0)">�����</a>
		<a href="#" class="easyui-linkbutton" iconCls="icon-add" plain="true" onclick="javascript:add()">���</a>
		<a href="#" class="easyui-linkbutton" iconCls="icon-edit" plain="true" onclick="javascript:pencil()">����</a>
		<a href="#" class="easyui-linkbutton" iconCls="icon-cut" plain="true" onclick="javascript:cut()">����</a>
		<a href="#" class="easyui-linkbutton" iconCls="icon-save" plain="true" onclick="javascript:save()">����</a>
	    <a href="#" class="easyui-linkbutton" iconCls="icon-order2" plain="true" onclick="javascript:order2()">����</a>
			</td>
		</tr>
	<!--============================= ��ư �߰� ��  =============================-->			
	</table>		
	</div>
	<!--============================= ���� �� =================================-->
	<!-- ȸ�� ��� ���� -->
	<table id="dg_member" class="easyui-datagrid" url="./jsonBoard.jsp">
	        <thead>
            <tr>
                <th field="mem_ck" checkbox="true"></th>
                <th field="b_no" width="120">�۹�ȣ</th>
                <th field="b_name" width="150">������</th>
                <th field="b_user" width="150">�ۼ���</th>
                <th field="b_date" width="80">�ۼ�����</th>
                <th field="b_view" width="170">��ȸ��</th>
            </tr>
        </thead>
	</table>
	<div id="pn_member" class="easyui-pagination" style="width:600px;background:#efefef;border:1px solid #ccc;"
        data-options="total:100,pageSize:10,pageList: [5,10,15,20]">
    </div>
	<!-- ȸ�� ��� ��   -->
	<!-- ���ȭ�� ���� -->
	<div id="dlg_boardadd" class="easyui-dialog" title="ȸ�����" data-options="iconCls:'icon-save',closed:'false',modal:'true',buttons:'#btn_dlg_boardadd'" style="width:400px;height:280px;padding:10px">
        <form id="f_memIns">
        <table>
        	<tr>
        		<td width="150px">������</td>
        		<td width="250px"><input class="easyui-textbox" id="b_name" name="b_name" size="12" required="true"></td>
        	</tr>
        	<tr>
        		<td width="150px">�ۼ���</td>
        		<td width="250px"><input class="easyui-textbox" id="b_user" name="b_user" size="15" required="true"></td>
        	</tr>
        	<tr>
        		<td width="150px">����</td>
        		<td width="250px"><input class="easyui-textbox"  id="b_comm" name="b_comm" size="40"></td>
        	</tr>
        	        </table>  </form>
    </div>
    <!-- ���ȭ�鿡 ��ư �߰��ϱ� ���� -->
    <div id="btn_dlg_boardadd">
		<a href="javascript:boardIns()" class="easyui-linkbutton">����</a>
		<a href="javascript:$('#dlg_boardadd').dialog('close');" class="easyui-linkbutton">�ݱ�</a>
	</div>
    <!-- ���ȭ�鿡 ��ư �߰��ϱ�  ��   -->
	<!-- ���ȭ��  ��   -->
</body>
</html>















