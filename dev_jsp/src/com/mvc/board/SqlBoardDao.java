package com.mvc.board;

import java.io.Reader;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.log4j.Logger;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class SqlBoardDao {
	Logger logger = Logger.getLogger(SqlBoardDao.class);
	SqlSessionFactory sqlMapper = null;
	SqlSession sqlSes = null;
	String resource = "com/mybatis/mapper/MapperConfig.xml";
	public List<Map<String, Object>> getBoardList(Map<String, Object> pMap){
		logger.info("getBoardList호출 성공");
		List<Map<String, Object>> getBoardList = null;
		try {
			Reader reader = null;//2byte단위로(한글-2byte단위처리)
			reader = Resources.getResourceAsReader(resource);
			sqlMapper =
					new SqlSessionFactoryBuilder().build(reader);
			sqlSes =  sqlMapper.openSession();
			getBoardList = sqlSes.selectList("getBoardList", pMap);
			logger.info("getBoardList.size():"+getBoardList.size());
		}catch(Exception e) {
			logger.info("Exception : "+e.toString());
		}
		return getBoardList;
		
	}
	public int boardSInsert(Map<String, Object> pMap){
		logger.info("boardInsert호출 성공");
		int result = 0;
		
		return result;
		
	}
	public int getGroup() {
		int b_group=0;
		try {
			Reader reader = null;//2byte단위로(한글-2byte단위처리)
			reader = Resources.getResourceAsReader(resource);
			sqlMapper =
					new SqlSessionFactoryBuilder().build(reader);
			sqlSes =  sqlMapper.openSession();
			b_group = sqlSes.selectOne("getGroup");
					logger.info("b_group :"+b_group);
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Exception : "+e.toString());
		}
		return b_group;
	}
	public int boardMInsert(Map<String, Object> pMap){
		int result = 0;
		logger.info("boardInsert호출 성공");
		try {
			Reader reader = null;//2byte단위로(한글-2byte단위처리)
			reader = Resources.getResourceAsReader(resource);
			sqlMapper =
					new SqlSessionFactoryBuilder().build(reader);
			sqlSes =  sqlMapper.openSession();
			result = sqlSes.insert("BoardMInsert", pMap);
			sqlSes.commit();
			logger.info("처리된 건수:"+result);
			
		}catch(Exception e) {
			logger.info("Exception : "+e.toString());
		}
		
		return result;
		
	}
	public int stepUpdate(Map<String, Object> pMap) {
		
		return 0;
	}
}



/*
 * sqlSes= con.sqlMapper.openSession();
memlist = sqlSes.selectList("getMemberList", pMap);//member.xml에 등록된 select문을 실행 파라미터값은 pMap에 저장됨.
//pMap mem_id[키],ID[속성]
//pMap mem_pw[키],pw[속성] 이 두가지를 가지고 셀렉문에 조회하게됨.
//System.out.println(memlist.get(0).get("MEM_NAME"));//요청한 데이터를 가지고 조회 한 뒤 나오는 결과값을 임시적으로 찍게됨.			
	} catch (Exception e) {
System.out.println(e.toString());
}
return memlist;//처리된 이름을 리턴함. //근데 이게 맵타입일 필요가 있나..? 단순히 스트링으로 처리하는게 편하지 않을까?
 * 
 */
