<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
	String mem_id 		= request.getParameter("mem_id");
	out.print("���̵�:"+mem_id);
	String mem_name 	= request.getParameter("mem_name");
	out.print("�̸�:"+mem_name);
	String mem_gender 	= request.getParameter("mem_gender");
	out.print("����:"+mem_gender);
	String mem_hp 		= request.getParameter("mem_hp");
	out.print("HP:"+mem_hp);
%>