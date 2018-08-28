/*package com.semantic;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mybatis.mapper.LoginDAO;
@WebServlet(urlPatterns="/log.do")
public class logservlet extends HttpServlet{
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
		Map<String, Object> pMap = new HashMap<String, Object>();
		
		pMap.put("mem_id", req.getParameter("mem_id"));
		pMap.put("mem_pw", req.getParameter("mem_pw"));
		LoginDAO logdao = new LoginDAO();
		logdao.getMemberList(pMap);
		
		Cookie c_id = new Cookie("mem_id",pMap.get("mem_id").toString());
		res.addCookie(c_id);
		Cookie c_pw = new Cookie("mem_pw",pMap.get("mem_pw").toString());
		res.addCookie(c_pw);
		res.sendRedirect("/Semantic/login.jsp");
	}
}
*/