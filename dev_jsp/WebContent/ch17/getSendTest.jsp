<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!-- 
    ���� ��ġ�� ���? dev_jsp20180417/ch17/getSendTest.jsp
    
  ���۹�ư�� Ŭ������ ��?(���� - ��������ڰ� ����? - Tomcat���� - dev_jsp20180417���������� ������ - �� ��û�� ó���� ����)
  -> �̷��� ��û�� �������� �޾��� �� MVC����(��2)�� �ǽ�.
  
  ���� : ����ü �ڹ��ڵ�[����]�� ��� �ؼ� �������� ������ ó���� �����Ѱɱ�?
   - �����ȿ��� writer��ü�� ������ ���� out.print();�޼ҵ带 ȣ���ϰ� �Ǵµ� �̶� �Ķ���Ϳ� html�±׸� �����
   �׷��� �������� ���Ⱑ �Ͼ����?
   �׷��� �׳� ���⸸ �ؼ��� �ȵſ�. �ֳ��ϸ� mime type�� ���̴� �׳� text�� �Ұ��ϱ� ��������
   �׷��� ���� mime type�� �� ������ ��� �ؿ�
   �׷��� �귯������ mime type�� Ȯ���ϰ� �÷����α������ �ڱⰡ ó���� ����
   �׷��� �ڹ��ڵ忡 print�� ���̹Ƿ� �������� �����Ű���� �ݵ�� url pattern������ �ʿ�����
   �̰��� web.xml������ �������
   ��Ĺ ������ �⵿�ϸ� �Ǹ��� web.xml������ scan��.
   �׷��� �����̸����� ���� �����̸� �±������� ã�Եǰ� �� �±� �����ȿ� url-pattern�� Ȯ����.
   �׷��� url�� ���� �ڹ��ڵ带 ȣ���� �� �ְ� �Ǵ°� 
   
  ��Ʈ : doGet�޼ҵ� Ȥ�� doPost�޼ҵ�� �� IOException�� �������� �Ǿ� �ִ°���?
  
  JSP������ Ȯ���ڰ�xxx.jsp�̰� servet������ Ȯ���ڰ� xxx.java��
  jsp������ �ν��Ͻ�ȭ�� �� �� �������?
  ���� �ν��Ͻ�ȭ�� �� �� ���ٴ� �߻�Ŭ������ �������̽� ó�� �����ؾ� �ǳ�?
  �ܵ����� �ν��Ͻ�ȭ�� �� �� ���ٸ� jsp�������� �޼ҵ带 �����ص� �ǳ�?
  ������ �� �ִٸ� ��� ȣ������? �ν��Ͻ�ȭ�� �� �� ���ٴµ�..
  �׷��� ������ Ȯ���ڰ� java�ϱ� ���� �ν��Ͻ�ȭ�� ������ �� ������.
  �� �ȿ� �������̵� �޼ҵ尡 doGet(req, res), doPost(req, res) �ΰ��� �����񽺸� ��û�ް� ���� �Ѵٴµ�
  xxx.jsp���������� ��û�� ���� �� doGet�� doPost�޼ҵ� ȣ���� ��� ��������?
  ���� ȣ���� �� �ִ°ǰ�?
  �ƴ� actionPerformed�� ajax�� �ݹ�޼ҵ�ó�� ���۵Ǵ°ǰ�?
 doGet�޼ҵ�� doPost�޼ҵ� �� ��� �Ķ���ͷ� request�� response��ä�� �����޴���.
 �̰ɷ� ������ �� �� �ִ°ɱ�?
 �̰͵��� ���� �ν��Ͻ�ȭ�� ���ִ� ����?
 �ν��Ͻ�ȭ ���ִ� ������ �����ϱ�?
 ��
  
-->
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
<script type="text/javascript" src="../js/jquery-1.12.0.js"></script>
<script type="text/javascript">
function getSend(){
	$("#f_get").attr("method","get");
	$("#f_get").attr("action", "���� ȣ��");
	$("#f_get").submit();
}
</script>
</head>
<body>
<from id="f_get">
<input type="text" id="t_id" name="t_id">
<input type="button" value="����" onClick="getSend()">
</body>
</html>