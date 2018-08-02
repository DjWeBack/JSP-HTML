package com.mybatis.mapper;

import java.io.Reader;
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
}
