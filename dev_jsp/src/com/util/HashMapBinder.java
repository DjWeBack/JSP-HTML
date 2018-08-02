package com.util;

import java.util.Enumeration;
import java.util.Map;
/*
 * 공통코드를 작성해 봅시다.
 */

import javax.servlet.http.HttpServletRequest;
public class HashMapBinder {
	HttpServletRequest req=null;
	public HashMapBinder(HttpServletRequest req) {
		this.req = req;
		
	}
	
	public void bind(Map<String, Object> pMap){
		pMap.clear();
		Enumeration<String> en = req.getParameterNames();
		while(en.hasMoreElements()) {
		String key = en.nextElement();
		pMap.put(key, req.getParameter(key));
		}
	}
}
