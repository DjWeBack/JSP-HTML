package com.vo;
/*
 * ��������� �����ϴ� ���̺��� �ִ�. emp
 * emp���տ��� 8���� �÷��� �ִ�.
 * 8���� ���� �������� ���� 8���� �����ؾ� �ȴ�.
 * �׷��� VO�� ����ϸ� �ּҹ��� �ϳ��� 8�� ���� ��� �ѱ� �� �Ǵ� ���� �� �ִ�.
 */
public class EmpVO {
	private int	   empno	    = 0;
	private String ename	    = null;
	private String job		    = null;
	private int    mgr		    = 0;
	private String hiredate     = null;
	private double sal		    = 0;
	private double comm	        = 0;
	private int    deptno	    = 0;
	private String Command		= null;
	
	public int getEMPNO() {
		return empno;
	}
	public void setEMPNO(int empno) {
		this.empno = empno;
	}
	public String getENAME() {
		return ename;
	}
	public void setENAME(String ename) {
		this.ename = ename;
	}
	public String getJOB() {
		return job;
	}
	public void setJOB(String job) {
		this.job = job;
	}
	public int getMGR() {
		return mgr;
	}
	public void setMGR(int mgr) {
		this.mgr = mgr;
	}
	public String getHIREDATE() {
		return hiredate;
	}
	public void setHIREDATE(String hiredate) {
		this.hiredate = hiredate;
	}
	public double getSAL() {
		return sal;
	}
	public void setSAL(double sal) {
		this.sal = sal;
	}
	public double getCOMM() {
		return comm;
	}
	public void setCOMM(double comm) {
		this.comm = comm;
	}
	public int getDEPTNO() {
		return deptno;
	}
	public void setDEPTNO(int deptno) {
		this.deptno = deptno;
	}
	public String getCommand() {
		return Command;
	}
	public void setCommand(String command) {
		this.Command = command;
	}
	
	
}
