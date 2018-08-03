package com.mybatis.mapper;

import java.io.Reader;
import java.sql.CallableStatement;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;



public class LoginDAO {
	Connection con = new Connection();
	SqlSession			sqlSes = null;
	public List<Map<String,Object>> getMemberList(Map<String,Object> pMap){
		List<Map<String,Object>> memlist = null;
		try {
			sqlSes= con.sqlMapper.openSession();
			memlist = sqlSes.selectList("getMemberList", pMap);//member.xml�� ��ϵ� select���� ���� �Ķ���Ͱ��� pMap�� �����.
			//pMap mem_id[Ű],ID[�Ӽ�]
			//pMap mem_pw[Ű],pw[�Ӽ�] �� �ΰ����� ������ �������� ��ȸ�ϰԵ�.
			//System.out.println(memlist.get(0).get("MEM_NAME"));//��û�� �����͸� ������ ��ȸ �� �� ������ ������� �ӽ������� ��Ե�.			
				} catch (Exception e) {
			System.out.println(e.toString());
		}
		return memlist;//ó���� �̸��� ������. //�ٵ� �̰� ��Ÿ���� �ʿ䰡 �ֳ�..? �ܼ��� ��Ʈ������ ó���ϴ°� ������ ������?
	}
	public String addMember(Map<String, Object> pMap) {
		String msg = "";
		DBConnectionJSP dbcon = new DBConnectionJSP();
		java.sql.Connection ccon = dbcon.getConnetion();
		CallableStatement	 cstmt	 = null;
		try {
			cstmt = ccon.prepareCall("call proc_addmem(?,?,?,?)");
			cstmt.setString(1, pMap.get("mem_id").toString());
			cstmt.setString(2, pMap.get("mem_pw").toString());
			cstmt.setString(3, pMap.get("mem_name").toString());
			cstmt.registerOutParameter(4, java.sql.Types.VARCHAR);
			cstmt.executeUpdate();
			msg = cstmt.getString(4);
			System.out.println(msg);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.toString());
			System.out.println(pMap.get("mem_id").toString());
			System.out.println(pMap.get("mem_pw").toString());
			System.out.println(pMap.get("mem_name").toString());
		}
		return msg;
	}
}
