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
		logger.info("getBoardListȣ�� ����");
		List<Map<String, Object>> getBoardList = null;
		try {
			Reader reader = null;//2byte������(�ѱ�-2byte����ó��)
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
		logger.info("boardInsertȣ�� ����");
		int result = 0;
		
		return result;
		
	}
	public int getGroup() {
		int b_group=0;
		try {
			Reader reader = null;//2byte������(�ѱ�-2byte����ó��)
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
		logger.info("boardInsertȣ�� ����");
		try {
			Reader reader = null;//2byte������(�ѱ�-2byte����ó��)
			reader = Resources.getResourceAsReader(resource);
			sqlMapper =
					new SqlSessionFactoryBuilder().build(reader);
			sqlSes =  sqlMapper.openSession();
			result = sqlSes.insert("BoardMInsert", pMap);
			sqlSes.commit();
			logger.info("ó���� �Ǽ�:"+result);
			
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
memlist = sqlSes.selectList("getMemberList", pMap);//member.xml�� ��ϵ� select���� ���� �Ķ���Ͱ��� pMap�� �����.
//pMap mem_id[Ű],ID[�Ӽ�]
//pMap mem_pw[Ű],pw[�Ӽ�] �� �ΰ����� ������ �������� ��ȸ�ϰԵ�.
//System.out.println(memlist.get(0).get("MEM_NAME"));//��û�� �����͸� ������ ��ȸ �� �� ������ ������� �ӽ������� ��Ե�.			
	} catch (Exception e) {
System.out.println(e.toString());
}
return memlist;//ó���� �̸��� ������. //�ٵ� �̰� ��Ÿ���� �ʿ䰡 �ֳ�..? �ܼ��� ��Ʈ������ ó���ϴ°� ������ ������?
 * 
 */
