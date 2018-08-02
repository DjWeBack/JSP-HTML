package com.util;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
@WebServlet(urlPatterns="/Login.do")
public class LoginServlet extends HttpServlet{
Logger logger = Logger.getLogger(LoginServlet.class);
public void doService(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
	HttpSession session = req.getSession();
	Cookie cookies[] = req.getCookies();
	Map<String, Object> pMap = new HashMap<String, Object>();
	HashMapBinder hmb = new HashMapBinder(req);
	hmb.bind(pMap);
	Object keys[] = pMap.keySet().toArray();
	for(int i=0;i<keys.length;i++) {
		String key = (String)keys[i];
		logger.info(pMap.get(key));
		
	}
	PrintWriter out= res.getWriter();
	res.setContentType("text/html;charset=euc-kr");
			out.print("<b>³¡......</b>");
}
public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
	doService(req, res);	
}
@Override
public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
	HttpSession session = req.getSession();
	Cookie cookies[] = req.getCookies();
	Map<String, Object> pMap = new HashMap<String, Object>();
	HashMapBinder hmb = new HashMapBinder(req);
	hmb.bind(pMap);
	Object keys[] = pMap.keySet().toArray();
	for(int i=0;i<keys.length;i++) {
		String key = (String)keys[i];
		logger.info(pMap.get(key));
		
	}
	PrintWriter out= res.getWriter();
	res.setContentType("text/html;charset=euc-kr");
			out.print("<b>³¡......</b>");
}

}
