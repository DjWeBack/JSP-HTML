package com.ch7;
/*
 * �ϰ���
 * �θ�Ŭ������ �ڽ�Ŭ���� ����(���)�϶�
 * �θ�Ŭ������ �θ�Ŭ���� ���� ����� ������ �޼ҵ常 ������ �ִ�.
 * Parent p = new Child();<<�̷��� �ν��Ͻ�ȭ�� �ϰԵǸ� �Ƶ鲯�� ������ ����.
 * �� �� ���� p�� ������ �� �ִ� �ڳ�Ŭ������ methodB�̴�.
 * �� �� �θ�Ŭ������ methodB�� ������ �޼ҵ��� �Ѵ�.
 * Parent p = new Parent();
 * �θ�Ŭ�������� �ڳ�Ŭ������ ������ �� ����.
 * ��ӹ������� ���� Ŭ�������� ���� Ŭ������ �޴� ���� �� ������ ���� <<import�����ϸ� �ɵ�..? �� ��������
 */
public class ParentChildSimulation {

	public static void main(String[] args) {
//		//�ƺ� �޸𸮿� �ε��ϱ�
//		Parent p = new Parent();
//		System.out.println(p.i);
//
//		
//		Child c = new Child();
//		
//		System.out.println(c.i);
//		c.i=100;
//		//�θ��� i�� ���Ѵ�? �Ⱥ��Ѵ�.
//		System.out.println(p.i);
//		System.out.println(c.i);
//		p.i=c.i;
//		p=c;
//		c = (Child)p;
//		System.out.println(p.i);
		
		Parent p1 = new Child();
		//j ��c���ִ� ����
		//i ��p���ִ� ���� 
		p1.i=10;
		p1.MethodA();//�ڱ��ڽ� �ȿ� �ִ� �޼ҵ� Aȣ��
		p1.MethodB();//Child�ȿ� �޼ҵ� B�� ȣ��
		Parent p2 = new Parent();
		p2.MethodB();//�׳� ������ �ƺ���
		Child c2 = new Child();
		c2.j=20;
		c2.MethodA();//<<��Ӱ��迡 �ִ� parent�ȿ� �޼ҵ� A�� ȣ��
		c2.MethodB();//�ڱ��ڽſ� �ִ� �޼ҵ�bȣ��//�������̵�
		
		
	}

}
