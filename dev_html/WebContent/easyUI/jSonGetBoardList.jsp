<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import="java.util.*" %>
<%@ page import="com.google.gson.Gson" %>
<% 
	List<HashMap<String,Object>> boardList = new ArrayList<HashMap<String,Object>>();
	HashMap<String,Object> map = new HashMap<String,Object>();
	
	map.put("code",5);
	map.put("b_title","�Խ��� ����");
	map.put("b_writer","�̼���");
	boardList.add(map);
	map = new HashMap<String,Object>();
	map.put("code",4);
	map.put("b_title","�Խ��� ����2");
	map.put("b_writer","������");
	boardList.add(map);
	map = new HashMap<String,Object>();
	map.put("code",3);
	map.put("b_title","�Խ��� ����3");
	map.put("b_writer","�̼���");
	boardList.add(map);
	map = new HashMap<String,Object>();
	Gson g = new Gson();
	String jsonboard = g.toJson(boardList);
	
	out.print(jsonboard);
	
%>