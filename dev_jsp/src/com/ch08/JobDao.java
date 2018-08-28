package com.ch08;

import java.io.Reader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.Logger;

import com.ch17.BoardDAO;

public class JobDao {


	public List<Map<String,Object>> getJobList(String j_yn){
		String resource = "com/mybatis/mapper/MapperConfig.xml";
		SqlSessionFactory sqlMapper = null;

		Logger logger = Logger.getLogger(getClass());
		logger.info("호출 성공");
		List<Map<String,Object>> joblist=null;
		joblist = new ArrayList<Map<String, Object>>();
		Map<String, Object> pMap = new HashMap<>();
		pMap.put("j_yn", j_yn);
		Reader reader = null;
		try {
			reader= Resources.getResourceAsReader(resource);//DB연동 후 dept.xml을 참조.
			sqlMapper = new SqlSessionFactoryBuilder().build(reader);
			SqlSession sqlSes = sqlMapper.openSession();
			
			joblist = sqlSes.selectList("getJobList", pMap);
			System.out.println("통과 - 정상 진행//Connection");
		} catch (Exception e) {
			System.out.println(e.toString());

		}
		return joblist;
	}
	
}


