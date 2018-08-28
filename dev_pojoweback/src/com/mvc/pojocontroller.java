package com.mvc;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class pojocontroller implements Action{
	ActionForward forward = new ActionForward();
	List<Map<String,Object>> pojoList = new ArrayList<Map<String, Object>>();
	String path=null;

	int result = 0;
	
	

	public void cstom(String gubun) {
		if("insert".equals(gubun)) {
			if(result==1) {
				path ="./getPojoList.kos";
				forward.setRedirect(true);
				//트루면 샌드리다이렉트
			}
			else {
				path ="./getPojoFail.jsp";
			}
		}
		else if("update".equals(gubun)) {
			if(result==1) {
				path ="./getPojoupdate.kos";
				forward.setRedirect(true);
			}
			else {
				path ="./getPojoFail.jsp";
			}
			
			}
		else if("delete".equals(gubun)) {
			if(result==1) {
				path ="./getPojodelete.kos";
				forward.setRedirect(true);
			}
			else {
				path ="./getPojoFail.jsp";
			}
			}
		
		
	}
	public void member(String gubun) {
		if("insert".equals(gubun)) {
			if(result==1) {
				path ="./getPojoList.kos";
				forward.setRedirect(true);
				//트루면 샌드리다이렉트
			}
			else {
				path ="./getPojoFail.jsp";
			}
		}
		else if("update".equals(gubun)) {
			if(result==1) {
				path ="./getPojoupdate.kos";
				forward.setRedirect(true);
			}
			else {
				path ="./getPojoFail.jsp";
			}
			
			}
		else if("delete".equals(gubun)) {
			if(result==1) {
				path ="./getPojodelete.kos";
				forward.setRedirect(true);
			}
			else {
				path ="./getPojoFail.jsp";
			}
			}
		
	}
	@Override
	public ActionForward execute(HttpServletRequest req, HttpServletResponse res) throws Exception {
		// TODO Auto-generated method stub
		ActionForward forward = new ActionForward();
		return forward;
	}

	@Override
	public ActionForward execute(HttpServletRequest req, HttpServletResponse res, Map<String, Object> pMap)
			throws Exception {
		String gubun = pMap.get("gubun").toString();
		String option = pMap.get("option").toString();
		logic logic = new logic();
		if("member".equals(option)) {
			logic.member(pMap);
		}
		else if("sal".equals(option))
		{
			logic.sal(pMap);
		}
		else if("cstom".equals(option))
		{
			logic.cstom(pMap);
		}
		return forward;
		
		// TODO Auto-generated method stub

	}
	
	
}
