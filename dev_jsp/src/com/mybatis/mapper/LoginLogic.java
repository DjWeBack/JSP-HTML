package com.mybatis.mapper;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.annotation.WebServlet;

public class LoginLogic {
	LoginDAO ldao = new LoginDAO();
	Map<String, Object> userdata = new HashMap<String, Object>();//�������� ���� ���������͵� �̰� DAO�� �Ѱܾߵ�.
	public void logicpross(String u_id, String u_pw) {
		userdata.put("mem_id", u_id);
		userdata.put("mem_pw", u_pw);
		List<Map<String, Object>> username = null;
		username = ldao.getMemberList(userdata);
		//ldao.getMemberList(userdata);//DAO���� ó���� ����� ���� �� username�� �������� ��������.
		System.out.print(username.get(0).get("MEM_NAME"));//[{MEM_NAME=������}] �����ϱ� username�� Ű�� �־� �װ��� ����ϸ� �ɵ���.
	}
	public void insertpross(String u_id, String u_pw, String u_name) {
		userdata.put("mem_id", u_id);
		userdata.put("mem_name", u_name);
		userdata.put("mem_pw", u_pw);
		ldao.addMember(userdata);
		
		
		
	}
}
