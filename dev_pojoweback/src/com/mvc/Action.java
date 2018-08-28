package com.mvc;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Action {
	 public ActionForward execute(HttpServletRequest req, HttpServletResponse res)
			 throws Exception;
	 public ActionForward execute(HttpServletRequest req, HttpServletResponse res, Map<String,Object> pMap)
			 throws Exception;
}
