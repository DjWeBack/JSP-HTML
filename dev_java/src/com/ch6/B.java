package com.ch6;

public class B {
	/*
	 * Ŭ�����ȿ��� ����� �ν��Ͻ� ������ ���� �ν��Ͻ� ���������� ���ó� ����ƽ �ȿ����� ����� �Ұ�����.
	 * 
	 */
	A a = new A();//��������


	void MethodB() {
		System.out.println("MethodB�� ����");
		a.MethodA();//����ƽ�� �ƴϹǷ� ����ο��� ������ �������� ȣ�Ⱑ��
			}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B Ma = new B();
	
		int a = 0;
		Ma.MethodB();
		

	}

}
