package com.mvc;

import java.util.List;
import java.util.Map;

public class ActionForward {
	private boolean isRedirect = false; // ���������� �����̷�Ʈ���� �Ǻ��ϴ� ���� //���帮���̷�Ʈ�� Ʈ��
	private String path = null;//�̵��� �������� �̸�
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
