package com.vo;

import java.util.ArrayList;
import java.util.List;

public class EmpController {
	final static String _INS = "insert";//int Ÿ��
	final static String _UPD = "update";//int Ÿ��
	final static String _DEL = "delete";//int Ÿ��
	final static String _SEL = "select";//ResultSet
	EmpVO pevo = new EmpVO();
	EmpDao eDao = new EmpDao();//JDBC���� Ŭ����
	public int CUDEmp() {
	int result = 0;
	if(_INS.equals(pevo.getCommand())) {}
	else if(_UPD.equals(pevo.getCommand())) {}
	else if(_DEL.equals(pevo.getCommand())) {}
	else if(_SEL.equals(pevo.getCommand())) {
		
	}
	return result;
	}
/**
 * ������ ��ȸ ����
 * @param evo - ����ڰ� ������ ����(���� �˻� �Ҷ�)
 * @return List<EmpVO>
 * @�ۼ����� : 2018-07-05
 * @�ۼ���   : ������ 
 */
	public List<EmpVO> getEmpList(EmpVO evo) {
		List<EmpVO> empList = new ArrayList<EmpVO>();
		return empList;
	}
}
