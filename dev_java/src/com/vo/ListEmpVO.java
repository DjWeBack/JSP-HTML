package com.vo;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ListEmpVO {
	List<EmpVO> empList = new ArrayList<EmpVO>();
	List<Map<String, Object>> empList2 = new ArrayList<Map<String, Object>>();
	public void setList() {
		//VO���Ͽ��� �ѹ��� �Ѱ� �ο찪�� ���� �� �ִ�.
		//�ι��� ��� �Ǹ� �������� ��� ���� �����.
		EmpVO evo = new EmpVO();
		evo.setENAME("�̼���");
		evo.setENAME("�̼���");
		empList.add(evo);
		
	}
	public void setlist2() {
		if(empList.get(0) instanceof EmpVO) {}
		if(empList.get(0) instanceof Map) {}
	}
	public int empInsert(int empno, String ename, String job, String hiredate, double sal, double comm,int mgr, int deptno) {
		int result = 0;
		return result;
	}
	public int empInsert(EmpVO pevo) {
		
		int result = 0;
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListEmpVO lev = new ListEmpVO();
		System.out.println(lev.empList.size());
		lev.setList();
		//�����ȣ�� �ʱⰪ�� ����� ����
		System.out.println(lev.empList.get(0).getEMPNO());
		System.out.println(lev.empList.get(0).getENAME());
		System.out.println(lev.empList.get(1).getENAME());
	}

}
