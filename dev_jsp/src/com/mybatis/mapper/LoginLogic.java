package com.mybatis.mapper;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.annotation.WebServlet;

public class LoginLogic {
	LoginDAO ldao = new LoginDAO();
	Map<String, Object> userdata = new HashMap<String, Object>();//서블릿에서 받은 유저데이터들 이걸 DAO로 넘겨야됨.
	public void logicpross(String u_id, String u_pw) {
		userdata.put("mem_id", u_id);
		userdata.put("mem_pw", u_pw);
		List<Map<String, Object>> username = null;
		username = ldao.getMemberList(userdata);
		//ldao.getMemberList(userdata);//DAO에서 처리된 결과를 받음 이 username을 서블릿으로 보낼예정.
		System.out.print(username.get(0).get("MEM_NAME"));//[{MEM_NAME=김훈태}] 나오니까 username에 키를 넣어 그것을 출력하면 될듯함.
	}
	public void insertpross(String u_id, String u_pw, String u_name) {
		userdata.put("mem_id", u_id);
		userdata.put("mem_name", u_name);
		userdata.put("mem_pw", u_pw);
		ldao.addMember(userdata);
		
		
		
	}
}
