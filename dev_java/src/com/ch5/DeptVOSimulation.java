package com.ch5;

public class DeptVOSimulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
		DeptVO dvos[] = new DeptVO[4];
		
		int deptnos[] 	= new int[4];
		String dnames[] = new String[4];
		String loc[] 	= new String[4];
		//DeptVoŬ������ ���� �����غ�?
		//DeptVO���� �ѹ��� �Ѱ��ο츦 ���� �� ������? - ������ 3�� ����Ǿ� �����ϱ� �ѹ��� �� �� �ο츸 ���� �� �־��.
		DeptVO dvo = new DeptVO();
		//for(i=0;i<3;i++) {
		
		//}				
		dvo.deptno = 10;
		dvo.dname = "ACCOUNTING";
		dvo.loc = "NEW YORK";
		dvos[0] = dvo;
		dvo = new DeptVO();
		
		dvo.deptno = 20;
		dvo.dname = "RESEARCH";
		dvo.loc = "DALLAS";
		dvos[1] = dvo;
		
		dvo = new DeptVO();
		dvo.deptno = 30;
		dvo.dname = "SALES";
		dvo.loc = "CHICAGO";
		dvos[2] = dvo;
		
		dvo = new DeptVO();
		dvo.deptno = 40;
		dvo.dname = "OPERATIONS";
		dvo.loc = "BOSTON";
		dvos[3] = dvo;
		//dvo = new DeptVO();
		
		for(i=0;i<dvos.length;i++)
		{
			DeptVO dvo2 = dvos[i];
			System.out.println(dvo2.deptno+","+dvo2.dname+","+dvo2.loc);
		}
		
		
		/*for(i=0;i<3;i++) {
				
		}*/
		
	}

}
