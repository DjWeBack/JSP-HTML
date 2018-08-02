<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ page import="java.util.List, java.util.Map, java.util.ArrayList"%>
<%@ page import="java.util.HashMap"%>
<%@ page import="com.util.*"%>
<%
List<GameVO> gamelist = (List<GameVO>) request.getAttribute("gamelist");

%>
        <table border="10" borderColor="white"> 
<%
		for (int i = 0; i < gamelist.size(); i++) {
	%>
        
        <tr>
		<td class="pictTD"><img src="<%=gamelist.get(i).getG_IMG()%>" width="250" height="200"></td>
        <td style="width:250px;" class="pictTD"><%=gamelist.get(i).getG_COM()%></td>
        </tr>
        </table>
        <% } %>