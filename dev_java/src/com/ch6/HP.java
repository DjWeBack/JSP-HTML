package com.ch6;
//annotation
public class HP extends Object{
	//���� �̸��� �޼ҵ带 3�� ������ ������
	//why?
	/*
	 * ������ �Ķ������ Ÿ���̳� ������ �޶����.
	 * ���������ڰ� �ְ� ����� ������ ����.
	 * ����Ÿ���� �ְ� ���� ������ ����.
	 * ���ܸ� ������ �ȴ����� ���� ����.
	 */

	public void call() {
		
	}
	public void call(int a) {
		
	}
	public void call(String phonenumber) {
		
	}
	public int call(String phonenumber, double b) {//�����߻� �����޼ҵ�� �ν�
		return 0;
		
	}
	public void call(String phonenumber, String name) {
		
	}
	public void call(String phonenumber, String name, int a) 
	throws Exception
	{
		
	}
	@Override
	public String toString() {
		return "�ȳ�";
		
	}
			
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HP hp = new HP();//���� hp�� ��������
//		System.out.println(hp.toString());
	}

}
