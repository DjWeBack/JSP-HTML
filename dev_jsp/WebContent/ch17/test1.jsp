<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%
/******************************************************************
*	자바스크립트는 싱글쿼테이션이나 더블쿼테이션이 없으면 변수취급함
*	자바스크립트는 더블과 싱글을 구분하지 않는다(하지만 권장사항은 밖에는 더블 내부는 싱글)
*	자바스크립트 변수에 자바코드의 값을 담을 수 있다.
*	그러나 정적인값만 담김. ->동적으로 변하는 값은 담을 수 없다.
*	자바스크립트 코드보다 자바코드가 먼저 실행되고(어디서-톰캣) 그 결과(HTML)가
*	로컬pc에 다운로드(버퍼캐시메모리 적재 - get-인터셉트를 함) 되어 브라우저에서 실행됨.
*	그렇다면 브라우저는 어떻게 그 사람의 요청을 알고 있는거지?
	브라우저마다 서버는 세션아이디를 부여함(상수값.)
	세션(서버:캐시메모리)아이디는 쿠키(클라이언트-text)에 저장됨.
	새로운 브라우저를 열면 세션 아이디 바뀜
	완결편
	1.자바스크립트 변수에 자바값을 담을 수 있다.
	그러나 반대는 안됨.
	2. 주의할 점.
	자바변수의 값은 이미 서버에서 결정된 값이므로 변화 없다.
*******************************************************************/

	String name = "김위백";

%>
<script>
var sname = "<%=name%>";

	alert(sname);

</script>
</body>
</html>