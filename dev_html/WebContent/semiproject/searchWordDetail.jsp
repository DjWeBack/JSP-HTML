<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ page import="java.util.List, java.util.Map, java.util.ArrayList"%>
<%@ page import="java.util.HashMap"%>
<%@ page import="com.util.*"%>
<%
List<GameVO> gamelist = (List<GameVO>) request.getAttribute("gamelist");

%>
        <table border="10" borderColor="pink" style="background-color: #FFD1FF;"> 
<%
		for (int i = 0; i < gamelist.size(); i++) {
	%>
        
        <tr>
		<td class="pictTD" style="padding:10px;"><img src="<%=gamelist.get(i).getG_IMG()%>" width="250" height="200"></td>
        </tr>
        </table>
        <% } %>