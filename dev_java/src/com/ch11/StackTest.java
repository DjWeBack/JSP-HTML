package com.ch11;

import java.util.Stack;
import java.util.Vector;
/***********************
 * Stack�� ó���� ���� ������(���߿�) ���´�.
 * Stack�� ����ִ� ������ ������ ��� ������(���������� �ν��Ͻ��� ����) �ȴ�.
 * Stack�� Vector�� �ڽ� Ŭ���� ������ (��� �뵵��)�� �ٸ���.
 * Stack�� ������ ���� ���� ���� �� (����)�� �ٸ���.
 * Stack�� ��� ������ ���� �� Vector�� �޸� (�ε���) �� ����� �ʿ䰡 ����.
 ***********************/
public class StackTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		Vector vec = new Vector<>();
		Stack st = new Stack();
		st.push("���");
		st.push("�ٳ���");
		st.push("����");
		vec.set(0, "a");
		System.out.println(vec.get(0));
		vec.set(1, "b");
		System.out.println(vec.get(0));
		System.out.println("st.size() : " + st.size());
		for(int i=0;i<st.size();i++) {
			System.out.println(st.pop());
		}
		System.out.println(st.empty());
		System.out.println(st.pop());//��� ������ �������� ����.
		System.out.println(st.empty());
		
	}

}
