package com.mybatis.maps;

import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.Logger;

public class DeptDao {
	Logger logger = Logger.getLogger(DeptDao.class);
	//�Ʒ� ������ ����Ŭ������ ����̹� Ŭ������ �����.
	//�����̸� �� ����� �����.
	//���������� ������ �ִ� ������ ip�ּҿ� port��ȣ SID�̸��� ����� ��.
	String resource = "com/mybatis/MapperConfig.xml";
	//MapperConfig.xml������ �о ����Ŭ������ Ŀ�ؼ� �δµ� �ʿ��� ������ ��ĵ�ϰ� ��ü�� ������.
	//�� ��ü�� �޸𸮿� �ε��Ǿ� �־�� ����Ŭ ������ ���ǰ�ü�� ������ �� ����.
	//���ǰ�ü�� Ȱ���Ͽ� commit�� rollbackó���� ������.(�Է�|����|������ �� �ʿ���.)
	SqlSessionFactory sqlMapper = null;
	SqlSession        sqlSes    = null;
	//��ȸ
	/********************************************************************************
	 * ���� �˻� ���� ����
	 * @param pMap - ������, ����, ���ǻ�
	 * @return bookList - select��� - ���� - index_book.jsp
	 * �ۼ��� : ����
	 *******************************************************************************/
	//���ν��� ȣ���ϱ�
	public String proc_emp_sal_update(Map<String, Object> pMap)
	{
		logger.info("getDeptList ȣ�� ����");
		//insert here
		String msg = null;
		try {
			Reader reader = null;//2byte������(�ѱ�-2byte����ó��)
			reader = Resources.getResourceAsReader(resource);
			sqlMapper =
					 new SqlSessionFactoryBuilder().build(reader);
			sqlSes =  sqlMapper.openSession();
			reader.close();
			pMap.put("empno",7566);
			sqlSes.selectOne("proc_emp_sal_update", pMap);
			msg = pMap.get("msg").toString();
			logger.info("��ȸ ��� : "+msg);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return msg;
	}
	/*
	public List<Map<String,Object>> getDeptList(int deptno)
	{
		logger.info("getDeptList ȣ�� ����");
		//insert here
		List<Map<String,Object>> deptList = null;
		try {
			Reader reader = null;//2byte������(�ѱ�-2byte����ó��)
			reader = Resources.getResourceAsReader(resource);
			sqlMapper =
					 new SqlSessionFactoryBuilder().build(reader);
			sqlSes =  sqlMapper.openSession();
			reader.close();
			deptList = sqlSes.selectList("getDeptList", deptno);
			logger.info("��ȸ ��� : "+deptList.size());
		} catch (Exception e) {
			// TODO: handle exception
		}
		return deptList;
	}
	
	//�Է�
	*//******************************************************************************
	 * �������� �Է��ϱ� ����
	 * @param pMap ������, ����, ����, ������, ���ǻ�........
	 * @return int 0:��Ͻ��� 1:��ϼ���
	 *****************************************************************************//*
	public int bookInsert(Map<String,Object> pMap)
	{
		logger.info("bookInsert ȣ�� ����");
		//insert here
		int result = 0;
		try {
			Reader reader = null;
			sqlMapper = new SqlSessionFactoryBuilder().build(reader);
			sqlSes = sqlMapper.openSession();
			reader.close();
			result = sqlSes.insert("deptIns", pMap);
			sqlSes.commit();
			//�ڹٴ� commit ����Ŀ�� ��尡 default �ε�
			//���̹�Ƽ���� ����Ŀ�� ��尡 false�̴�.
			logger.info("result : "+result);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return result;
	}	
	//����
	*//******************************************************************************
	 * �������� �����ϱ� ����
	 * @param pMap ������, ����, ����, ������, ���ǻ�........
	 * @return int 0:�������� 1:��������
	 *****************************************************************************//*
	public int deptUpdate(Map<String,Object> pMap)
	{
		logger.info("bookUpdate ȣ�� ����");
		//insert here
		int result = 0;
		try {
			Reader reader = null;
			sqlMapper = new SqlSessionFactoryBuilder().build(reader);
			sqlSes = sqlMapper.openSession();
			reader.close();
			result = sqlSes.update("deptUp", pMap);
			sqlSes.commit();
			//�ڹٴ� commit ����Ŀ�� ��尡 default �ε�
			//���̹�Ƽ���� ����Ŀ�� ��尡 false�̴�.
		} catch (Exception e) {
			// TODO: handle exception
		}
		return result;
	}		
	//����
	*//******************************************************************************
	 * �������� �����ϱ� ����
	 * @param pMap ������, ����, ����, ������, ���ǻ�........
	 * @return int 0:�������� 1:��������
	 *****************************************************************************//*
	public int deptDelete()
	{
		logger.info("deptDelete ȣ�� ����");
		//insert here
		int result = 0;
		try {
			Reader reader = null;
			sqlMapper = new SqlSessionFactoryBuilder().build(reader);
			List<Integer> list = new ArrayList<Integer>();
			sqlSes = sqlMapper.openSession();
			reader.close();
			list.add(55);
			list.add(56);
			list.add(57);
			result = sqlSes.delete("deptDelete", list);
			sqlSes.commit();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return result;
	}
	public int deptDeleteArray()
	{
		logger.info("deptDeleteArray ȣ�� ����");
		//insert here
		int result = 0;
		try {
			Reader reader = null;
			sqlMapper = new SqlSessionFactoryBuilder().build(reader);
			int deptarr[] = new int[4];
			sqlSes = sqlMapper.openSession();
			reader.close();
			deptarr[0]=55;
			deptarr[1]=56;
			deptarr[2]=57;
			deptarr[3]=58;
			result = sqlSes.delete("deptDelete", deptarr);
			sqlSes.commit();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return result;
	}		*/
}