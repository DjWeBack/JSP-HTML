package com.mvc;

import java.util.HashMap;
import java.util.Map;

public class logic {
	Map<String, Object> pMap = new HashMap<String, Object>();
	int result = 0;
	String path=null;
	ActionForward forward = new ActionForward();
	
	
	public void sal(Map<String, Object> pMap) {
		if("insert".equals(pMap.get("gubun"))) {
			if(result==1) {
				path ="./getPojoList.kos";
				forward.setRedirect(true);
				//트루면 샌드리다이렉트
			}
			else {
				path ="./getPojoFail.jsp";
			}
		}
		else if("update".equals(pMap.get("gubun"))) {
			if(result==1) {
				path ="./getPojoupdate.kos";
				forward.setRedirect(true);
			}
			else {
				path ="./getPojoFail.jsp";
			}
			
			}
		else if("delete".equals(pMap.get("gubun"))) {
			if(result==1) {
				path ="./getPojodelete.kos";
				forward.setRedirect(true);
			}
			else {
				path ="./getPojoFail.jsp";
			}
			}
		
	}

	public void member(Map<String, Object> pMap) {
		
	}
	public void cstom(Map<String, Object> pMap) {
		
	}
}

