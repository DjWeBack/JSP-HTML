<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<link rel="stylesheet" type="text/css" href="/dev_html/themes/default/easyui.css">
	<link rel="stylesheet" type="text/css" href="/dev_html/themes/icon.css">
	<script type="text/javascript" src="/dev_html/js/jquery-1.12.0.js"></script>
	<script type="text/javascript" src="/dev_html/js/jquery.easyui.min.js"></script> 

<%-- <%@ include file="../include/commonUI.jsp" %> --%>
<title>Weback의 게임검색</title>
<style type="text/css">
div#d_word {
	position: absolute;
}

.listIn {
	background: #CCFFFF;
}

.listOut {
	background: #FFFFFF;
}

div#d_detail {
	position: absolute;
}

.listIn {
	background: #CCFFFF;
}

.listOut {
	background: #FFFFFF;
}
</style>
<script type="text/javascript">
	var watch;
	var isStart = false;

	var i = 0;
	function autoReload() {
		$("#d_news").text(i)
		i = i + 1;
		if (i == 1500) {
			stop();
		}
	}

	function start() {
		isStart = true;
		$("input[value='중지']").focus();
		watch = setInterval(autoReload, 1);
		//$("#d_news2").hide(100);

	}
	function stop() {
		isStart = false;
		setTimeout(function() {
			clearInterval(watch);
			i = 0;
		});
	}
	function login(){
		var command = $("#f_login").serialize();
		 $.ajax({
			method:"POST",
			url : "/dev_html/login6.do",
			data : command,
			success : function(log){
				
				console.log("success");
				console.log(log);
				$("#d_logs").html(log);
			}
			,error : function(log) {
				console.log("error : " + log);
			}
		});

		
	}
	function addcan(){
		$('#d_insert').window('close');
		}
	function addok(){
		$("#f_insert").attr("method","post");
		$("#f_insert").attr("action","/dev_html/login6.do");
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

</head>
<body>
	<script type="text/javascript">
		//getDetail()
		function Detail() {
			var word = "word=" + $("#word").val();
			$.ajax({

						method : "POST",
						url : "/dev_html/semiproject/searchwordActionDetail.jsp",
						data : word //리퀘스트(URL에서 받을 정보.)
						//result는 URL에서 처리한 response로 보내진 값이 result
						//위치잡아주기(div) -css(), attr()
						//div출력 - text(),html()
						//사용자가 입력한 값 읽어오기 - val()
						/* $("#d_word").css(); */
						,
						success : function(details) {
		$("#d_detail").css("border", "#FFAAAA");
		$("#d_detail").css(
				"left",
				$("#d_word").offset().left
						+ $("#d_word").width() + "px");
		$("#d_detail").css("top",
				$("#d_word").offset().top + "px");
		$("#d_detail").html(details);
		var tds = document.getElementsByClassName("pictTD");

		for (var i = 0; i < tds.length; i++) {
			tds[i].onmouseover = function() {
				this.className = "listIn";
			};
			tds[i].onmouseout = function() {
				this.className = "listOut";
			};
			tds[i].onclick = function() {
				$("#word").val($(this).text());
			}

		}

						}

					});

		}
		function clearMethod() {
			$("#d_word").css("backgrounderColor", "#FFFFFF");
			$("#d_word").css("border", "none");
			$("#d_word").html("");
		}
		function clearMethod2() {
			$("#d_detail").css("backgrounderColor", "#FFFFFF");
			$("#d_detail").css("border", "none");
			$("#d_detail").html("");
		}

		$(document).ready(function() {
			$("#d_insert").hide();
			
			
			$("#word").keyup(function() {	
			var word = "word="+ $("#word").val();
			if ($("#word").val() == "") {
				clearMethod();
				clearMethod2();
				return -1;
				}
			$.ajax({
				method : "POST",
				url : "/dev_html/semiproject/searchWordAction.jsp",
				data : word //리퀘스트(URL에서 받을 정보.)
				,success : function(result) {//result는 URL에서 처리한 response로 보내진 값이 result
																//위치잡아주기(div) -css(), attr()
																//div출력 - text(),html()
																//사용자가 입력한 값 읽어오기 - val()
																/* $("#d_word").css(); */
$("#d_word").css("border","#FFAAAA");
$("#d_word").css("left",$("#word").offset().left+ "px");
$("#d_word").css("top",$("#word").offset().top+ 28+ "px");
$("#d_word").html(result);
var tds = document.getElementsByTagName("td");
for (var i = 0; i < tds.length; i++) {
	tds[i].onmouseover = function() {
			word = "word="+ $("#word").val($(this).text());
			//$("#word").val($(this).text());
			Detail();
		};
		tds[i].onclick = function() {
			word = "word="+ $("#word").val($(this).text());
			Detail();
		};

	}

},
															error : function(xhrObject) {//XMLHttpRequest - 통신객체-변수,함수
																console.log(xhrObject);
															}

														});///////////////end of ajax

											});////////////end of key up 이벤트 헨들러
						
						});///////////////end of ready
	</script>
	<center>
		<img src="/dev_html/semiproject/picture/Webacklogo.png" width="450" height="150"><br>
		<font color="#FFFFFF">검색어 입력 : </font><input type="text" id="word" placeholder="예:ajax"/><br>
		<div id="d_word"></div>

		<div id="d_detail"></div>
	</center>

	<form id="f_login">
	<table>
		<tr>
			<td>숫자놀이 :
				
				<div id="d_news">
				
					<input type="button" value="시작" style="color: black;" onclick="start()">
					
				</div>
				
				<div id="d_news2">
					<input type="button" value="중지" onclick="stop()">
				</div>
				
			</td>
		</tr>
		<tr>
			<td id="d_logs">
				<table style="width:250px; height:auto;">
					<tr>
						<td>
							<input type="hidden" name="command" id="command" value="login">
							<input id="mem_id" name="mem_id" type="text" style="width:150px" class="easyui-textbox" data-options="iconCls:'icon-man', iconAlign:'left'">
						</td>
						<td rowspan="4">
							<a id="btn"href="javascript:login()" class="easyui-linkbutton" data-options="iconCls:'icon-ok'">login</a>
							<a id="btn"href="javascript:insert()" class="easyui-linkbutton" data-options="iconCls:'icon-add'">add</a>
						</td>
					</tr>
					<tr>
						<td>
							<input id="mem_pw" name="mem_pw" type="text" style="width:150px;" 
								class="easyui-passwordbox" data-options="iconCls:'icon-lock',iconAlign:'left', prompt:'Password', showEye:'true'"/>
					 	</td>
					</tr>
				</table>	
			</td>
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
</body>
</html>