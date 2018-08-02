package com.ch17;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.istack.internal.logging.Logger;
import com.util.HangulConversion;
@WebServlet(urlPatterns="/hello.weback")
public class HelloServlet extends HttpServlet{
	Logger logger = Logger.getLogger(HelloServlet.class);
	/******************************************
	 * 화면단에서 post방식으로 요청하면 doPost메소드가 호출됨
	 * @req - 톰캣서버가 서블릿에 대한 요청이 일어나면 요청객체를 주입해줌.
	 * @res - 톰캣서버가 서블릿에 대한 요청이 일어나면 응답객체를 주입해줌.
	 * doPost는 메소드 오버라이딩한 메소드 이므로 리턴 타입을 바꿀 수 없음.
	 * doPost는 URL요청으로는 절대로 호출 할 수 없음 - 기억해요
	 * 해결방법 : 자바스크립트 코드에서만 호출 할 수 있음.
	 * 페이지를 이동하는 메소드와 함수 정리해 둘 것.
	 ******************************************/
//	@Override
//	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
//		res.sendRedirect("/dev_jsp/ch17/end.jsp");
//	}
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
		String name = HangulConversion.toKor(req.getParameter("tb_name"));
		logger.info("사용자가 입력한 이름 : " + name);
		logger.info("====================================");
		logger.info("doPost호출 성공");
//		req.setAttribute("name", name);
//		res.sendRedirect("/dev_jsp/ch17/end.jsp");
		 ServletContext context =getServletContext();
	        RequestDispatcher dispatcher = context.getRequestDispatcher("/ch17/end.jsp"); //넘길 페이지 주소
	        dispatcher.forward(req, res);




		
	
    




		
	}

}
