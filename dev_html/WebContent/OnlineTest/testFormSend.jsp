<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%
	//�� ������ ������ ���� ����
	int perJumsu = 20;
	//���� ����
	int cnt = 0;
	//���� �ϱ�
	boolean isPass = false;//true�̸� �հ�, false�̸� ���հ�.
	//�հ� ���� ����
	int pass = 60;
	String daps[] = {"3","4","1","2","4"};
	String tests[] = new String[5];
	tests[0] = request.getParameter("htest1");
	tests[1] = request.getParameter("htest2");
	tests[2] = request.getParameter("htest3");
	tests[3] = request.getParameter("htest4");
	tests[4] = request.getParameter("htest5");
	for(int i=0;i<daps.length;i++){
		for(int j=0;j<daps.length;j++){
			if(daps[i].equals(tests[j])) {
				if(i==j) {
					cnt++;
				}
			}
		}
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>���� ���� Ȯ��</title>
</head>
<body>
���� ���� : <%out.print("���� ����:"+cnt); %> �� �Դϴ�.
����� ������ : <%out.print(perJumsu*cnt); %> �Դϴ�.
<%
	if((perJumsu*cnt)>=pass){
	isPass = true;
	}
	else{
	isPass = false;
	}
	response.sendRedirect("account.ju");

	/* if((perJumsu*cnt)>=pass){
		isPass = true;
	}
	else{
		isPass = false;
	}
	response.sendRedirect("account.jsp?isPass="+isPass); */
%>
</body>
</html>