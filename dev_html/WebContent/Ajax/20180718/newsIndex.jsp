<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ page import="com.util.HangulConversion"%>
<%
	String n_title = request.getParameter("n_title");
	String n_content = request.getParameter("n_content");
	out.print("�Ķ���ͷ� �Ѿ�� ����:" + n_title + ", ����:" + n_content);
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>���� ��� - Ajax��� ������ ����[���ó������]</title>
<!-- $ is defined  -->
<script type="text/javascript" src="../../js/jquery-1.12.0.js"></script>
<script type="text/javascript">
	function newsInsert() {
		alert("newsInsertȣ�� ����");
		$("#f_newsIns").attr("method", "get");
		$("#f_newsIns").attr("action", "newsInsAction.jsp");
		$("#f_newsIns").submit();
	}
	var watch;
   	var isStart = false;
   	
	   var i=0;
	    function autoReload(){
	        $("#d_news").text("��������...."+i)
	        i=i+1;
	        if(i==1500){
	        	stop();
	        }
	    }
		
		
	    function start(){
	    	isStart = true;
	    	$("input[value='����']").focus();
	        watch=setInterval(autoReload,1);
	        //$("#d_news2").hide(100);
	     
	        
	    }
	    function stop(){
	    	isStart = false;
	        setTimeout(function(){
	            clearInterval(watch);
	            i = 0;
	        });
	    }
	    
	 
</script>
</head>
<body>
	<script type="text/javascript">
		$(document).ready(function() {
			$("input[value='����']").hover(function(event) {
				if(isStart==true)
					$("#d_news2").hide();
			}, function(event) {
				if(isStart==true)
					$("#d_news2").show();	
			});
			
			
			$("#btn_reple").click(function() {
				//insert here - ajax�ڵ� �߰��ϱ�
				$.ajax({
					//newsAction.jsp�� ������ ����? - 
					//�� ==> d_reple�ȿ� �� ȭ���� �־�� ��.	- html�±׾� �ƴϸ� �ڹ��ڵ��
					url : "./newsAction.jsp"//"ó�������� url-XXX.jsp or /hello.dk"
					,
					method : "GET",
					success : function(data) {//���⼭ data�� ������ �Ӵ�?
						//$("#d_reple").html("<b>��۾��� ȭ��</b>");
						$("#d_btnreple").hide();
						$("#d_reple").html(data);
					},
					error : function(xhrObject) {
						alert("error : " + xhrObject.responseText);
					}
				});
			});
			
		});
		function login() {
			var id = $("#mem_id").val();
			var pw = $("#mem_pw").val();
			var param = "mem_id=" + id + "&mem_pw" + pw;
			$.ajax({
				method : "POST",
				url : "�α���������",
				data : param,
				success : function(result) {

				},
				error : function(xhrObject) {
					alert("error:" + xhrObject.responseText);
				}

			});

		}
	</script>
	<table width="800px" height="600px">
		<!-- top ���� ���� -->
		<tr>
			<td width="100%" height="80px">
				<table border="1" borderColor="orange" width="100%" height="100%">
					<tr>
						<td align="center">
						 <div id="d_news"> 
						  ���մ��� : <br><input type="button" value="����" onclick="start()">
            </div>
            <div id="d_news2">
            <br><input type="button" value="����" onclick="stop()">
            </div>
						</td>
					</tr>
				</table>
			</td>
		</tr>
		<!-- top ����  ��   -->
		<!-- ���� ���� ���� -->
		<tr>
			<td width="100%" height="480px">
				<table border="1" borderColor="green" width="100%" height="100%">
					<tr>
					<td>
						<!-- �α���â ���� ���̺� -->
						<table border="1" bordercolor="blue" width="100%">
							<tr>
								<td><input type="text" id="mim_id" value="���̵�" size="10"
									onclick="javascript:document">
								<td rowspan="2"><input type="button" value="Ȯ��"
									onclick="login()"></td>
							</tr>
							<td><input type="text" id="mim_pw" value="�н�����" size="10"
								onclick="javascript:document"></td>
								
						</table>
						</td>
						
						<td align="center"><h1>���������� ���塯 PC�� ��� ���� ���� �������� 8�� 10�ϡ������?</h1>
	<br>


	<table border="1" width="300px" height="80px">
		<tr>
			<td width="170px"><span id="cost"><img
					src="L20180710.99099004401i1.jpg"></span></td>
		</tr>
	</table>

	10�� ���� 1��(�ѱ��ð�) ���������� ���塯 ��Ʃ��ä�ο��� PC���� ��ø� �˸��� ����� ���������� ��ũ�� ������ ���� �Բ�
	�Խõƴ�.
	<br> �̹� PC������ �ѱ�ȭ�Ǿ� ��õǸ� �۷ι� ���� �÷��� ������ ���� �Ǹŵȴ�.
	<br> ���� ����Ȩ���������� ���������͡��� �̿��ϱ� ���� PC ���� ���� �ּ� ��絵 �Բ� �����ߴ�.
	<br>
	<table border="1" width="300px" height="80px">
		<tr>
			<td width="170px"><span id="cost"><img
					src="L20180710.99099004401i2.jpg"></span></td>
		</tr>
	</table>
	PS4���� ���������� ���塯�� ���� ������ �������� PC���� ������ ȯȣ�� ���°�, �ѱ������� �ǽð� �˻�� ������ ��
	�α⸦ �����ߴ�.
    <br>

							<!-- �ۼ��� ��� ������ ��⿡ ��µǰ� �ϰ� �;��..... --> <%
 	//��۳����� �ֳ���? - ���� �� ó���� ����
 	if ((n_title != null) && (n_content != null)) {
 		out.print("��� ����:" + n_title);
 		out.print("<br>");
 		out.print("��� ����:" + n_content + "<br>");
 	}
 %>
							<div id="d_btnreple">
								<input id="btn_reple" type="button" value="��۾���">
							</div>
							<div id="d_reple">��⿡ ��۾���ȭ��(jsp����)</div>

						</td>
					</tr>
				</table>
			</td>
		</tr>
		<!-- ���� ����  ��   -->
		<!-- bottom ���� ���� -->
		<tr>
			<td width="100%" height="40px">
				<table border="1" borderColor="brown" width="100%" height="100%">
					<tr>
						<td align="center">ȸ��Ұ� | �λ縻 | ����å����(��ȭ���� ����-ajax������κ�)</td>
					</tr>
				</table>
			</td>
		</tr>
		<!-- bottom ����  ��   -->
	</table>
</body>
</html>