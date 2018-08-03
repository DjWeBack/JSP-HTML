package com.mybatis.mapper;

import java.io.Reader;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;



public class Connection {
	String resource = "com/mybatis/mapper/MapperConfig.xml";
	SqlSessionFactory sqlMapper = null;
	Connection() {
		try {
			
			Reader reader = null;
			reader= Resources.getResourceAsReader(resource);//DB연동 후 dept.xml을 참조.
			sqlMapper = new SqlSessionFactoryBuilder().build(reader);
			System.out.println("통과 - 정상 진행//Connection");
				} catch (Exception e) {
			System.out.println(e.toString());
			
		}


	}
}
