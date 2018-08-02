<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<!-- time.jsp -> time_jsp.java(서블릿)-> time_jsp.class - 브라우저 -->
<%!
	//디클러레이션 - declaration
	//사용하지 않는 이유 - 인스턴스화가 불가함 - 재사용성이 떨어짐.
	//메소드 선언은 POJO class에서..(?) 
	// POJO class는 상속 받지 않은 깨끗한 상태의 순수 java 클래스
	int i; // 전역변수 
	public int methodA(){int b=3;
	return b;
	}
	/* 
	E:\dev_kosmo201804\.metadata\.plugins\org.eclipse.wst.server.core\tmp1\work\Catalina\localhost\dev_jsp\org\apache\jsp\ch3
	*/
%>

<%
	//스크립틀릿, 인스턴스화 가능, 제어문 사용가능, 자료구조
	int i = 0; //지역변수 > service(){}
	i= methodA();//당연 디클러레이션에서 선언된 메소드 사용 가능.
	
	out.print(i);
	out.print("스크립틀릿");
%>
<%!
//익스프레션
%>
</body>
</html>