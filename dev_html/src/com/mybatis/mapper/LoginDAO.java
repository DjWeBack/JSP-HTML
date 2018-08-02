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
			memlist = sqlSes.selectList("getMemberList", pMap);//member.xml에 등록된 select문을 실행 파라미터값은 pMap에 저장됨.
			//pMap mem_id[키],ID[속성]
			//pMap mem_pw[키],pw[속성] 이 두가지를 가지고 셀렉문에 조회하게됨.
			//System.out.println(memlist.get(0).get("MEM_NAME"));//요청한 데이터를 가지고 조회 한 뒤 나오는 결과값을 임시적으로 찍게됨.			
				} catch (Exception e) {
			System.out.println(e.toString());
		}
		return memlist;//처리된 이름을 리턴함. //근데 이게 맵타입일 필요가 있나..? 단순히 스트링으로 처리하는게 편하지 않을까?
	}
}
