package com.ch5;

/*
 * �迭�� ����� �ʱ�ȭ
 */
 // public -���������� >protected >friendly >private
public class ArrayTest2 {

	String names[]=null; //��������
	void namesInit() {
		names = new String[3];
		names[0] = "�̱���";
		names[1] = "����";
		names[2] = "�����";
	}
	void test22() {
		namesInit();
		System.out.println(names[0]);
		System.out.println(names[1]);
		System.out.println(names[2]);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayTest2 at2 = new ArrayTest2();
		//����
		//�̱���, ����, ����� ��ģ���� �̸��� ����ϴ� �޼ҵ带 ������ ������.
		at2.names = new String[3]; //��������.
		at2.namesInit();
		
		at2.test22();
		
		at2.names[0] = "������";
		at2.names[1] = "������";
		at2.names[2] = "������";
		at2.test22();
		

		int is[]=null; //��������
		is = new int[3]; 
		//non-static ���� names�� static�����ȿ��� ����Ҽ� �ִ�.
	}
}



