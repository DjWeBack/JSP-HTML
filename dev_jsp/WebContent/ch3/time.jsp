<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<!-- time.jsp -> time_jsp.java(����)-> time_jsp.class - ������ -->
<%!
	//��Ŭ�����̼� - declaration
	//������� �ʴ� ���� - �ν��Ͻ�ȭ�� �Ұ��� - ���뼺�� ������.
	//�޼ҵ� ������ POJO class����..(?) 
	// POJO class�� ��� ���� ���� ������ ������ ���� java Ŭ����
	int i; // �������� 
	public int methodA(){int b=3;
	return b;
	}
	/* 
	E:\dev_kosmo201804\.metadata\.plugins\org.eclipse.wst.server.core\tmp1\work\Catalina\localhost\dev_jsp\org\apache\jsp\ch3
	*/
%>

<%
	//��ũ��Ʋ��, �ν��Ͻ�ȭ ����, ��� ��밡��, �ڷᱸ��
	int i = 0; //�������� > service(){}
	i= methodA();//�翬 ��Ŭ�����̼ǿ��� ����� �޼ҵ� ��� ����.
	
	out.print(i);
	out.print("��ũ��Ʋ��");
%>
<%!
//�ͽ�������
%>
</body>
</html>