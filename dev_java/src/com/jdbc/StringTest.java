package com.jdbc;

public class StringTest {
	public void test() {
		String s = "Have";
		System.out.println(s);
		s+=" a";
		System.out.println(s);
		s+=" good";
		System.out.println(s);
		s+=" time!!!!";
		System.out.println(s);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Hello";
		s = s.replace('e', 'o');
		System.out.println(s);
		//�ݵ�� ���Կ����ڷ� ���ο� ���� ��ƾ���.
		StringTest st = new StringTest();
		st.test();
	}

}
