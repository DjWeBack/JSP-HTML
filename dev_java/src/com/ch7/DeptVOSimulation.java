package com.ch7;

public class DeptVOSimulation {
	public void methodA(DeptVO dvo) {//dvo - ���� ����(�Ķ���ͷ� �Ѿ���Ƿ� ���ñ� ����.)
		System.out.println("�μ���ȣ : "+dvo.getDeptno()+", �μ��� : "+dvo.getDname());
//		dvo = null;
//		dvo = new DeptVO();
		dvo.deptno = 20;//������ �ٲ��.
		//insert here - ������ �ٲ��� �ʵ��� �ڵ带 ������ ������.
		dvo.setDname("�ѹ���");
		dvo = null;
		dvo = new DeptVO();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DeptVOSimulation dsim = new DeptVOSimulation();
		DeptVO dvo = new DeptVO();
		dvo.deptno = 10;//public
//		dvo.dname = "������"; //private���� ���������Ƿ� ���� ���� �Ұ�.
		dvo.setDname("������");
		dsim.methodA(dvo);
		System.out.println("main - �μ���ȣ : "+dvo.getDeptno()+", �μ��� : "+dvo.getDname());
	}

}
