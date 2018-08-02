<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
	String db_id = "weback";
	String db_pw = "123";
	String db_name = null;
	String u_id = request.getParameter("mem_id");
	String u_pw = request.getParameter("mem_pw");
	if(db_id.equals(u_id)){
		if(db_pw.equals(u_pw)){
			db_name="관리자";
		}
		else{
			out.print("패스워드가 일치하지 않습니다.");
		}
	}else{
		out.print("존재하지 않는 아이디 입니다.");
	}

%>