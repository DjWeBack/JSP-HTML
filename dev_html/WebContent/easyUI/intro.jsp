<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
	<script type="text/javascript" src="../js/jquery-1.12.0.js"></script>
	<script type="text/javascript" src="../js/jquery.easyui.min.js"></script>
	<link rel="stylesheet" type="text/css" href="../themes/default/easyui.css">
	<link rel="stylesheet" type="text/css" href="../themes/icon.css">
	<script type="text/javascript">	
		function showcontent(menu){
	    	if(menu=='login'){
		    	//alert(menu);
	    		$('#p_content').panel({
	    		    width:750,
	    		    height:500,
	    		    href:'login.jsp',
	    		    title:'�α���'
	    		}); 		    	
	    	}else if(menu=='board'){
	    		//alert(menu);
	    		$('#p_content').panel({
	    		    width:750,
	    		    height:500,
	    		    href:'board.jsp',
	    		    title:'�������Խ���'
	    		}); 	    		
	    	}else if(menu=='email'){
	    		//alert(menu);
	    		$('#p_content').panel({
	    		    width:750,
	    		    height:500,
	    		    href:'email.jsp',
	    		    title:'�̸���'
	    		}); 	    		
	    	}
		}
	</script>
</head>
<body>
<table border="1px" borderColor="gray" width="900px" height="500px">
	<tr>
		<td>
		<div class="easyui-layout" style="width:900px;height:500px;">
		<!-- West ���� -->
		    <div region="west" split="true" title="Navigator" style="width:150px;">
		        <p style="padding:5px;margin:0;">Select language:</p>
		        <ul>
		            <li><a href="javascript:void(0)" onclick="showcontent('login')">�α���</a></li>
		            <li><a href="javascript:void(0)" onclick="showcontent('board')">�������Խ���</a></li>
		            <li><a href="javascript:void(0)" onclick="showcontent('email')">�̸���</a></li>
		        </ul>
		    </div>
		<!-- West ��   -->    
		<!-- Center ���� -->
		    <div id="content" region="center" style="width:750px;padding:5px;">
		    <!-- Panel(easyui) ���� -->	
		    	<div id="p_content" class="easyui-panel" title="�������Խ���"></div>
		    <!-- Panel(easyui) ��   -->
		    </div>
		<!-- Center  �� -->    
	    </div>
		</td>
	</tr>
</table>
</body>
</html>