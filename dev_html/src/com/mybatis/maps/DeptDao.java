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
	//아래 문서에 오라클서버의 드라이버 클래스를 등록함.
	//계정이름 및 비번을 등록함.
	//물리적으로 떨어져 있는 서버의 ip주소와 port번호 SID이름을 등록해 둠.
	String resource = "com/mybatis/MapperConfig.xml";
	//MapperConfig.xml문서를 읽어서 오라클서버에 커넥션 맺는데 필요한 정보를 스캔하고 객체를 생성함.
	//이 객체가 메모리에 로딩되어 있어야 오라클 서버에 세션객체를 생성할 수 있음.
	//세션객체를 활용하여 commit과 rollback처리가 가능함.(입력|수정|삭제시 꼭 필요함.)
	SqlSessionFactory sqlMapper = null;
	SqlSession        sqlSes    = null;
	//조회
	/********************************************************************************
	 * 도서 검색 서비스 구현
	 * @param pMap - 도서명, 저자, 출판사
	 * @return bookList - select결과 - 유지 - index_book.jsp
	 * 작성자 : 박의
	 *******************************************************************************/
	//프로시저 호출하기
	public String proc_emp_sal_update(Map<String, Object> pMap)
	{
		logger.info("getDeptList 호출 성공");
		//insert here
		String msg = null;
		try {
			Reader reader = null;//2byte단위로(한글-2byte단위처리)
			reader = Resources.getResourceAsReader(resource);
			sqlMapper =
					 new SqlSessionFactoryBuilder().build(reader);
			sqlSes =  sqlMapper.openSession();
			reader.close();
			pMap.put("empno",7566);
			sqlSes.selectOne("proc_emp_sal_update", pMap);
			msg = pMap.get("msg").toString();
			logger.info("조회 결과 : "+msg);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return msg;
	}
	/*
	public List<Map<String,Object>> getDeptList(int deptno)
	{
		logger.info("getDeptList 호출 성공");
		//insert here
		List<Map<String,Object>> deptList = null;
		try {
			Reader reader = null;//2byte단위로(한글-2byte단위처리)
			reader = Resources.getResourceAsReader(resource);
			sqlMapper =
					 new SqlSessionFactoryBuilder().build(reader);
			sqlSes =  sqlMapper.openSession();
			reader.close();
			deptList = sqlSes.selectList("getDeptList", deptno);
			logger.info("조회 결과 : "+deptList.size());
		} catch (Exception e) {
			// TODO: handle exception
		}
		return deptList;
	}
	
	//입력
	*//******************************************************************************
	 * 도서정보 입력하기 구현
	 * @param pMap 도서명, 저자, 가격, 출판일, 출판사........
	 * @return int 0:등록실패 1:등록성공
	 *****************************************************************************//*
	public int bookInsert(Map<String,Object> pMap)
	{
		logger.info("bookInsert 호출 성공");
		//insert here
		int result = 0;
		try {
			Reader reader = null;
			sqlMapper = new SqlSessionFactoryBuilder().build(reader);
			sqlSes = sqlMapper.openSession();
			reader.close();
			result = sqlSes.insert("deptIns", pMap);
			sqlSes.commit();
			//자바는 commit 오토커밋 모드가 default 인데
			//마이바티스는 오토커밋 모드가 false이다.
			logger.info("result : "+result);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return result;
	}	
	//수정
	*//******************************************************************************
	 * 도서정보 수정하기 구현
	 * @param pMap 도서명, 저자, 가격, 출판일, 출판사........
	 * @return int 0:수정실패 1:수정성공
	 *****************************************************************************//*
	public int deptUpdate(Map<String,Object> pMap)
	{
		logger.info("bookUpdate 호출 성공");
		//insert here
		int result = 0;
		try {
			Reader reader = null;
			sqlMapper = new SqlSessionFactoryBuilder().build(reader);
			sqlSes = sqlMapper.openSession();
			reader.close();
			result = sqlSes.update("deptUp", pMap);
			sqlSes.commit();
			//자바는 commit 오토커밋 모드가 default 인데
			//마이바티스는 오토커밋 모드가 false이다.
		} catch (Exception e) {
			// TODO: handle exception
		}
		return result;
	}		
	//삭제
	*//******************************************************************************
	 * 도서정보 삭제하기 구현
	 * @param pMap 도서명, 저자, 가격, 출판일, 출판사........
	 * @return int 0:삭제실패 1:삭제성공
	 *****************************************************************************//*
	public int deptDelete()
	{
		logger.info("deptDelete 호출 성공");
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
		logger.info("deptDeleteArray 호출 성공");
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