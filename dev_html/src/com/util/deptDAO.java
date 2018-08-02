package com.util;

import java.io.Reader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
public class deptDAO {
	String resource = "com/mybatis/MapperConfig.xml";
	SqlSessionFactory sqlMapper = null;
	SqlSession			sqlSes = null;
	//��ȸó�� - �޼ҵ� ���� - getEmpList(?):?
	public List<Map<String,Object>> getDeptList(int deptno){
		List<Map<String,Object>> deptlist = null;
		try {
			Reader reader = null;
			reader= Resources.getResourceAsReader(resource);//DB���� �� dept.xml�� ����.
			sqlMapper = new SqlSessionFactoryBuilder().build(reader);
			sqlSes = sqlMapper.openSession();
			reader.close();
			deptlist = sqlSes.selectList("getDeptList",deptno);
			
			System.out.println(deptlist.size());
				} catch (Exception e) {
			System.out.println(e.toString());
		}
		return deptlist;
	}
}
