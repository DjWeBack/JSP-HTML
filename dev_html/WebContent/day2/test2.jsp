<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
	//1�� �������� �Ѿ�� ������� ����� ����?
	String test1 = request.getParameter("htest1");
	out.print("1�� ���� ���- "+test1);
			
%>
<!-- //üũ�ڽ��� ��� ��Ƽ ������ �����ϴ� �Ӽ��� �������� �����Ƿ� ����ڰ� ���� �����Ѵ�.
//üũ�ڽ��� onChange�̺�Ʈ�� �߰��Ͽ� üũ�ڽ��� ��ȭ�� �߻��Ǹ� �������� �����ϰ� �ǰ�
//�� �� test�Լ��� ȣ���.
//�̶� �Ķ���ͷ� 0,1,2,3�� �޾Ƽ� �� ���� cb�迭�� �ε������� �������� ���Ѵ�.
//���� ������ üũ�ڽ��� üũ�� ���ְ� �������� 0�� �����Ͽ� üũ�� ���� �ǵ��� �Ѵ�. -->
<html><!-- //���� pcb���� 0,1,2,3 �� �ϳ��� ���� ���´�. -->
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title></title>
<script type="text/javascript">
	function test(pcb){//���� pcb���� 0,1,2,3 �� �ϳ��� ���� ���´�.
		for(var i=0;i<document.f_test1.cb.length;i++){
			if(pcb==i){
				document.f_test1.cb[i].checked=1;
			}else{
				document.f_test1.cb[i].checked=0;
			}
		}	
	}
	function 

</script>
</head>
<body>
<form name="f_test1" method="get" action="testForm2.html">
<input type="hidden" name="htest1">
����1. ���� �� DML������ �ƴ� ���� ���ÿ�.<br>
<input type="checkbox" name="cb" onChange="test(0)">select<br>
<input type="checkbox" name="cb" onChange="test(1)">insert<br>
<input type="checkbox" name="cb" onChange="test(2)">create<br>
<input type="checkbox" name="cb" onChange="test(3)">delete<br>
<br>
<input type="button" value=""onClick="next()">
</form>
</body>
</html>