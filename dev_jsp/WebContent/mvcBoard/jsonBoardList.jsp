<%@page import="com.google.gson.Gson"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@page trimDirectiveWhitespaces="true" %>
<%
	List<Map<String, Object>> getBoardList = (List<Map<String, Object>>) request.getAttribute("getBoardList");
	Gson gs = new Gson();
	String jsonBoard = gs.toJson(getBoardList);
	out.print(jsonBoard);
%>
