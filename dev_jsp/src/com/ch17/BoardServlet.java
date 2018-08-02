package com.ch17;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

/*************************************
 * 다음은 게시판 관리를 위해 위백이 만든 클래스의 일부이다.
 * 위백은 이 클래스에서 조회, 입력, 수정, 삭제 기능이 처리되기를 원한다
 * 이 업무를 영식이에게 위임하기로 하였다.
 * 영식이는 위 4가지 업무처리를 위해 메소드를 어떻게 나누어 관리해야 할까?
 * 
 *
 *************************************/

public class BoardServlet extends HttpServlet{
	Logger logger = Logger.getLogger(BoardServlet.class);
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//http://127.0.0.1:8080/dev_jsp/ch17/crud.do?command=select or insert or update or delete
		logger.info("doGet 호출 성공");
		String command = req.getParameter("command");
		BoardDAO dao = new BoardDAO();
		//게시글 목록 조회하기
		if("select".equals(command)) {logger.info("select 호출 성공");}
		//글 등록하기
		else if("insert".equals(command)) {logger.info("insert 호출 성공");}
		//글 수정하기
		else if("update".equals(command)) {logger.info("update 호출 성공");}
		//글 삭제하기
		else if("delete".equals(command)) {logger.info("delete 호출 성공");}
		}
		
	}

