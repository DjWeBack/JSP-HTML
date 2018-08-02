package com.oracle.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class EmpManager {
	Scanner sc = new Scanner(System.in);
	EmpVO evo;
	EmpManager(){
		empInsert(evo);
		
	}
	public int empInsert(EmpVO evo) {
		this.evo = evo;
		int result = 0;
		int empno = 0;
		String ename = null;
		String job = null;
		String hiredate = null;
		double sal = 0;
		double comm = 0;
		int deptno = 0;
		int mgr = 0;
		System.out.println("�����ȣ�� �Է��ϼ���.");
		try {
			empno = sc.nextInt();
		}
		catch (NullPointerException ne) {
			// TODO: handle exception
			System.out.println("��ȸ�Ͻ� ȸ����ȣ�� �Է��� �ּ���.");
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("���ڸ� �Է��� �ּ���.");
		}
				result = empAdd(evo);
//		result = empin.empAdd(empno, ename, job, hiredate, sal, comm, deptno, mgr)
				return result;
	}
	
	public static void main(String[] args) {
		EmpManager em = new EmpManager();
		em.empInsert(em.evo);

		
		
	}
	public void jusuck() {
	// TODO Auto-generated method stub
			/*final String _URL = "jdbc:oracle:thin:@192.168.0.218:1521:orcl11";
			final String _USER = "scott";
			final String _PW = "tiger";
			Connection 	con 		= 	null;
			Statement	stmt	 	= 	null;
			ResultSet 	rs	 		=	null;
			String sql = "select ename, sal, to_CHAR(hiredate,'YYYY-MM-DD') from emp";
			try {
				// 1�ܰ� : DB���� ��ǰ�� ����̹� Ŭ������ �޸𸮿� �ε��Ѵ�. - decode�����Ǵ�?
				Class.forName("oracle.jdbc.driver.OracleDriver");//������, ���

				// 2�ܰ� : ���������� ������ �ִ� DB������ �����ϱ�.(Ŀ���� �α�)
				con = DriverManager.getConnection(_URL, _USER, _PW);

				// 3�ܰ� : ����Ŭ ������ ���� �ۼ��� select���� ������ ó���� �ٷ�? ��Ź��. - ��ü�ε� - �ν��Ͻ�ȭ.
				stmt = con.createStatement();

				// ��û : �ڹٰ� ����Ŭ���� SQL�� ����ִ� select��
				rs = stmt.executeQuery(sql);
				while(rs.next()) {
					System.out.println(rs.getDouble(""));
					System.out.println(rs.getString("ename"));
					System.out.println(rs.getString("sal"));
					System.out.println(rs.getString("to_CHAR(hiredate,'YYYY-MM-DD')"));
				}
			} catch (Exception e) {
				//			System.out.println((rs.getString("ename"));
				// TODO: handle exception
			}
			System.out.println("����~~~~~~~~~~~~~~~~~~~");*/
	//��忡�� �Ѱ��� �Է� �Ǿ����� ���ϰ��� 1�̾���.
	/*	public int empAdd(int empno,String ename, String job, String hiredate, double sal, double comm, int deptno, int mgr) {
			DBConnection dbcon = new DBConnection();
			Connection con = null;
			Statement stmt = null;
			int result = 0;
			StringBuilder sql = new StringBuilder();
			sql.append("INSERT INTO EMP(empno, ename, job		");
			sql.append("					,mgr,hiredate,sal		");
			sql.append("					,comm,deptno)			");
			sql.append("					VALUES("+evo.getEmpno()+",'"+evo.getEname()+"','"+evo.getJob()+	"',"+evo.getMgr());
			sql.append(",'"+evo.getHiredate()+"',"+evo.getSal()+","+evo.getComm()+","+evo.getDeptno()+")");              
			try {
				con = dbcon.getConnetion();
				stmt = con.createStatement();
				result =  stmt.executeUpdate(sql.toString());
				if(result==1) {
					System.out.println("������ �Է¿� �����߽��ϴ�.");
				}
				else {
					System.out.println("������ �Է¿� �����߽��ϴ�.");
				}
			} catch (Exception e) {
				System.out.println(e.toString());
			}
			return result;

		}*/
	}

	public int empAdd(EmpVO evo) {
		DBConnection dbcon = new DBConnection();
		Connection con = null;
		Statement stmt = null;

		int result = 0;
		StringBuilder sql = new StringBuilder();                     
		sql.append("INSERT INTO EMP(empno, ename, job		");
		sql.append("					,mgr,hiredate,sal		");
		sql.append("					,comm,deptno)			");
		sql.append("					VALUES("+evo.getEmpno()+",'"+evo.getEname()+"','"+evo.getJob()+	"',"+evo.getMgr());
		sql.append(",'"+evo.getHiredate()+"',"+evo.getSal()+","+evo.getComm()+","+evo.getDeptno()+")");

		try {
			con = dbcon.getConnetion();
			stmt = con.createStatement();
			result =  stmt.executeUpdate(sql.toString());
			if(result==1) {
				System.out.println("������ �Է¿� �����߽��ϴ�.");
			}
			else {
				System.out.println("������ �Է¿� �����߽��ϴ�.");
			}
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		return result;


	}
}
