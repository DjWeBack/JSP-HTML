
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>���� 1</title> 
<script type="text/javascript">	
	function next(){
		if(document.f_test1.cb_1.checked ==1){ 
			alert("1�� üũ"); 
			dap=1; 
			document.f_test1.htest1.value=1;
			} 
		else if(document.f_test1.cb_2.checked ==1){ 
			alert("2�� üũ"); 
			dap=2; 
			document.f_test1.htest1.value=2;
			} 
		else if(document.f_test1.cb_3.checked ==1){ 
			alert("3�� üũ"); 
			dap=3; 
			document.f_test1.htest1.value=3;
			} 				
		else if(document.f_test1.cb_4.checked ==1){ 
			alert("4�� üũ"); 
			dap=4; 
			document.f_test1.htest1.value=4;
			}
		alert("����ڰ� ������ ����� ������:"+document.f_test1.htest1.value);
		for(var i=0;i<document.f_test1.elements.length;I++) {
			if(document.f_test1.cb[i].checked==1){
				document.f_test1.htest2.value = temp;
			}else{
				temp = temp+1;
				}
			}
			alert("2.����ڰ� ������ ����� ������:"+document.f_test1.htest2.value);
			document.f_test1.submit(); 
}
<!-- //���۵ȴ�(������->����[Tomcat-dev_html5]->������) -->
</script>
</head>
<body>
	a.html - �� �±׿� ���� ���۳͵忡 value�� ������ ������ �� �ִ�.<br>
	<form name="f_test1" method="get" action="./b.html">
		<input type="hidden" name="htest1"> <br> 
		<input type="hidden" name="htest2"> <br> 
		<input type="checkbox" name="cb_1">select<br> 
		<input type="checkbox" name="cb_2">insert<br> 
		<input type="checkbox" name="cb_3">update<br> 
		<input type="checkbox" name="cb_4">delete<br>
		<input type="button" value="����" onClick="next()">
		<br>
		<input type="checkbox" name="cb">�߻�Ŭ����<br> 
		<input type="checkbox" name="cb">�������̽�<br> 
		<input type="checkbox" name="cb">�Ϲ�Ŭ����<br> 
		<input type="checkbox" name="cb">�޼ҵ�<br> 
		<input type="button" value="����" onClick="next()">
	</form>
</body>
</html>