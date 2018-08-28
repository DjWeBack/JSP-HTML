package com.forward;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(urlPatterns="/for.do")
public class a2Servlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doService(req,res);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doService(req,res);
	}

	protected void doService(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		List<Map<String, Object>> boardList = new ArrayList<Map<String,Object>>();
		Map<String, Object> rMap = new HashMap<String, Object>();
		rMap.put("b_no", 1);
		rMap.put("b_title", "게시판제목1");
		boardList.add(rMap);
		rMap = new HashMap<String, Object>(); 
		rMap.put("b_no", 2);
		rMap.put("b_title", "게시판제목2");
		boardList.add(rMap);
		req.setAttribute("boardList", boardList);
		RequestDispatcher view = req.getRequestDispatcher("a2.jsp");
		view.forward(req, res);
	} 
}
