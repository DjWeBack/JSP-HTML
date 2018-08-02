package com.vo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


import com.oracle.jdbc.DBConnection;

public class EmpDao {
	DBConnection dbcon = null;
	Connection	 con   = null;
	ResultSet	 rs	   = null;
	PreparedStatement pstmt = null;
	List<EmpVO> evo;
	StringBuilder sql = new StringBuilder();
	
	//�Է�ó��

	//����ó��

	//����ó��

	//��ȸó�� -�޼ҵ带 ���� getEmpList(?):?
	//DAO(Data Access Object):DB������ �����ϴ� Ŭ������ ������.
	//����? ���뼺�� ���̱� ���� Ŭ���� ������
	//������ �������̿��� ���谡 �ְ� �� ���迡 ���������� ���� ���·� Ŭ���� ���踦 �ؾ�
	//���� �ִ� ���� ���̿��� �޼ҵ带 ������ �� ����.
	// --> ���յ��� ���� �ڵ带 �����ϴ� ���� �߿���.
	//--> ���յ��� ���ƾ� �����׽�Ʈ�� �����ϰ� �����׽�Ʈ�� ������.
	//--> ������Ʈ �������
	//�м� ���� -> ����(�ڵ�) -> �׽�Ʈ -> �ý��� ���� -> ��
	public List<EmpVO> getEmpList(EmpVO pevo)
	{
		List<EmpVO> empList = new ArrayList<EmpVO>();
		sql.append("select empno,ename, ");
		sql.append("job,mgr,hiredate,   ");
		sql.append("sal,comm,deptno     ");
		sql.append("from emp            ");
		try {
			
			dbcon = new DBConnection();
			con = dbcon.getConnetion();
			pstmt = con.prepareStatement(sql.toString());
			rs = pstmt.executeQuery();
			EmpVO evo= null;
			while(rs.next()) {
			evo = new EmpVO();
				evo.setEMPNO(rs.getInt(1));
				evo.setENAME(rs.getString(2));
				evo.setJOB(rs.getString(3));
				evo.setMGR(rs.getInt(4));
				evo.setHIREDATE(rs.getString(5));
				evo.setSAL(rs.getDouble(6));
				evo.setCOMM(rs.getDouble(7));
				evo.setDEPTNO(rs.getInt(8));
				empList.add(evo);
				
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.toString());
			
		}
		

		return empList;
	}

	public List<DeptVO> getDeptList(DeptVO pevo)
	{
		List<DeptVO> deptList = new ArrayList<DeptVO>();
		StringBuilder sql = new StringBuilder();
		sql.append("select deptno,dname,loc ");
		sql.append("from dept            ");
		try {
			
			dbcon = new DBConnection();
			con = dbcon.getConnetion();
			pstmt = con.prepareStatement(sql.toString());
			rs = pstmt.executeQuery();
			
			DeptVO dvo = null;
			while(rs.next()) {
				dvo = new DeptVO();
				dvo.setDeptno(rs.getInt(1));
				dvo.setDname(rs.getString(2));
				dvo.setLoc(rs.getString(3));
				deptList.add(dvo);				
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.toString());
			
		}
		

		return deptList;
	}
}
