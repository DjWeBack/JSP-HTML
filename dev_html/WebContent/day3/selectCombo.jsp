<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>selectCombo</title>
</head>
<body>
<script type="text/javascript">
  $(document).ready(function(){
	  $("#subject").change(function (){
		  var selectedText = $("#subject option:selected").text();
		  $("#choice").val(selectedText);
	  });
  	  $("#food").change(function(){
  		  var selectedText = "";
  		  $("#food option:selected").each(function(){
  			  selectedText+=$(this).text()+" ";
  		  $("#f_choice").val(selectedText);
  });
  	  });
  });
</script>
���� 1. ���� �߿��� ����̰� �����ϴ� ������ �����ϼ���?<br>
<br>
<select id="subject">
	<option>html</option>
	<option>javascript</option>
	<option>java</option>
	<option>oracle</option>
</select><br>
<br>
<input type="text" id="choice"><!-- ����̰� ������ ������� ����Ͻÿ� .--><br>
���� 2. ���� �߿��� ���� �����ϴ� ������ �� �� �����ϼ���?<br>
<br>
<select id="food" multiple="multiple">
	<option>����</option>
	<option selected="selected">�ɵ��</option>
	<option>��������</option>
	<option>������ũ</option>
</select><br>
<input type="text" id="f_choice"><br>
���� 3. ���� �߿��� �����̰� �����ϴ� ��ü��� �����ΰ���?<br>
<br>
<select id="train">
	<input type="checkbox" id="train1" values="����Ʈ">����Ʈ
	<input type="checkbox" id="train2" values="����">����
	<input type="checkbox" id="train3" values="V����Ʈ">V����Ʈ
	<input type="checkbox" id="train4" values="���̽��ӽ�">���̽��ӽ�
</select><br>
<input type="text" id="t_choice">

</body>
</html>