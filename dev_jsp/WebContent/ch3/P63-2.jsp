<%@ page language="java" contentType="text/html; charset=EUC-KR"	pageEncoding="EUC-KR"%>
<%@ page import="java.util.List, java.util.Map, java.util.ArrayList"%>
<%@ page import="java.util.HashMap"%>
<%@ page trimDirectiveWhitespaces="true"%><%-- json�����̳� xml�������� �������� --%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
 <!-- jsp��Ȱ
	 1)ȭ���� ó���Ҷ�
		:json�� ��� ������ Gson�� Ȱ���ϹǷ� �ش� ����.
	 3)xml���������� ������ ��
	 	:xml�� ��� �����ڰ� ���������� ���������� �����ϹǷ� �ʿ���.
	 	������ ���̷�Ƽ�� �ڸ��� �������� ���� ���� �ذ��ϱ� 
-->	 

<%

	//mime type ����� response��ü�� Ȱ����.
	 response.setContentType("text/html; charset=euc-kr"); 
	out.print("<table border='1' width='300'>");
	out.print("<tr><td>404</td></tr>");
	out.print("<tr><td>�������� 5���ǵ�</td></tr>");
	out.print("</table>");
	%>
