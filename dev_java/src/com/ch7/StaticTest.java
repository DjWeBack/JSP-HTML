package com.ch7;
// �޼ҵ�, �����տ� �ü� �ִ�. 
// Ŭ���� �տ��� �ü��� ����.
public class StaticTest {
	static int i = 10; //����, �Ѱ� (����), �켱���� ����.
	static {
		System.out.println("Static ��");
	}
	//main - main thread(�켱������ ���� - ����,�ð�����,����) - entry point
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main�޼ҵ�");
	}

}
