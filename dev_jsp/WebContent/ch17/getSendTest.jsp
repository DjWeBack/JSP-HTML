<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!-- 
    배포 위치는 어디? dev_jsp20180417/ch17/getSendTest.jsp
    
  전송버튼을 클릭했을 때?(누가 - 업무담당자가 어디로? - Tomcat서버 - dev_jsp20180417폴더내에서 무엇을 - 이 요청을 처리할 서블릿)
  -> 이렇게 요청을 서블릿에서 받았을 때 MVC패턴(모델2)을 의심.
  
  질문 : 도대체 자바코드[서블릿]로 어떻게 해서 브라우저에 페이지 처리가 가능한걸까?
   - 서블릿안에서 writer객체를 생성한 다음 out.print();메소드를 호출하게 되는데 이때 파라미터에 html태그를 적어요
   그러면 브라우저에 쓰기가 일어나겠죠?
   그런데 그냥 쓰기만 해서는 안돼요. 왜냐하면 mime type이 없이는 그냥 text에 불과하기 때문이죠
   그래서 먼저 mime type를 꼭 지정해 줘야 해요
   그래야 브러우저가 mime type를 확인하고 플러그인기능으로 자기가 처리를 하죠
   그런데 자바코드에 print한 것이므로 브라우저에 실행시키려면 반드시 url pattern정보가 필요하죠
   이것을 web.xml문서에 등록하죠
   톰캣 서버를 기동하면 맨먼저 web.xml문서를 scan함.
   그래서 서블릿이름으로 같은 서블ㄹ이름 태그정보를 찾게되고 그 태그 정보안에 url-pattern을 확인함.
   그래서 url로 서블릿 자바코드를 호출할 수 있게 되는거 
   
  힌트 : doGet메소드 혹은 doPost메소드는 왜 IOException을 던지도록 되어 있는거지?
  
  JSP문서는 확장자가xxx.jsp이고 servet문서는 확장자가 xxx.java임
  jsp문서는 인스턴스화를 할 수 있을까요?
  만일 인스턴스화를 할 수 없다는 추상클래스나 인터페이스 처럼 생각해야 되나?
  단독으로 인스턴스화를 할 수 없다면 jsp문서에는 메소드를 선언해도 되나?
  선언할 수 있다면 어떻게 호출하지? 인스턴스화를 할 수 없다는데..
  그런데 서블릿은 확장자가 java니까 직접 인스턴스화가 가능할 것 같은데.
  그 안에 오버라이드 메소드가 doGet(req, res), doPost(req, res) 두개로 웹서비스를 요청받고 응답 한다는데
  xxx.jsp페이지에서 요청을 받을 때 doGet과 doPost메소드 호출을 어떻게 구문하지?
  내가 호출할 수 있는건가?
  아님 actionPerformed나 ajax의 콜백메소드처럼 동작되는건가?
 doGet메소드와 doPost메소드 둘 모두 파라미터로 request와 response객채를 제공받던데.
 이걸로 무엇을 할 수 있는걸까?
 이것들은 누가 인스턴스화를 해주는 거지?
 인스턴스화 해주는 시점은 언제일까?
 왜
  
-->
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
<script type="text/javascript" src="../js/jquery-1.12.0.js"></script>
<script type="text/javascript">
function getSend(){
	$("#f_get").attr("method","get");
	$("#f_get").attr("action", "서블릿 호출");
	$("#f_get").submit();
}
</script>
</head>
<body>
<from id="f_get">
<input type="text" id="t_id" name="t_id">
<input type="button" value="전송" onClick="getSend()">
</body>
</html>