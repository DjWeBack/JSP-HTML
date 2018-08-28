package com.mvc;

import java.util.List;
import java.util.Map;

public class ActionForward {
	private boolean isRedirect = false; // 포워드인지 리다이렉트인지 판별하는 변수 //샌드리다이렉트면 트루
	private String path = null;//이동할 페이지의 이름
	private List<Map<String, Object>> list=null;
	public boolean isRedirect() {
		return isRedirect;
	}

	public void setRedirect(boolean isRedirect) {
		this.isRedirect = isRedirect;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public List<Map<String, Object>> getList() {
		return list;
	}

	public void setList(List<Map<String, Object>> list) {
		this.list = list;
	}
}
