package com.ch7;

public class Outter {
	int i =10;
	public void go() {
		System.out.println("Outter go�޼ҵ� ȣ�� ����");
	}
	class Inner {
		Inner(){
			System.out.println("Inner������ ȣ�� ����");
		}
		public void come() {
			System.out.println("InnerŬ���� come�޼ҵ� ȣ�� ����");
		}
	}
}
