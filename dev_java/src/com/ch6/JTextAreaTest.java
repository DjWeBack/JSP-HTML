package com.ch6;

import java.awt.ScrollPane;

import javax.swing.*;
public class JTextAreaTest {
//�����
	JFrame jf = new JFrame();
	JTextArea jta = new JTextArea("test",5,3);
	JScrollPane jsp = new JScrollPane(jta,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
	JTextAreaTest jta_test = null;//�ݵ�� null�� �����ؾ� �ϴ� ������ ���� ���غ���.
	//�Ʒ�ó�� �ν��Ͻ�ȭ�� �ϰԵǸ� �������� ����ϴ°��̱� ������, ������ �����Ҽ� ����.
//	JTextAreaTest jta_test2 = new JTextAreaTest();
//������
	public JTextAreaTest() {
		System.out.println("JTestAreaTest ����Ʈ ������ ȣ�� ����");
		initDisplay();
		
		
	}
//ȭ��ó���޼ҵ�
	public void initDisplay() {
		System.out.println("JTestAreaTest ȣ�� ����");
		jf.add(jsp);
		jf.setSize(500, 400);
		jf.setVisible(true);
		
	}
	public void methodA(JTextAreaTest jta_test) {
		System.out.println("�Ķ���ͷ� �ѱ� �ּҹ���"+jta_test);
		this.jta_test = jta_test;
		jta_test.jf.setSize(300, 500);
		jta_test.jf.setVisible(true);
		jta_test.initDisplay();
	}
	//���θ޼ҵ�
	public static void main(String[] args) {
		//�Ʒ� ��� �ν��Ͻ��� ���� �ּҹ����� ������ �����Ƿ� �Ķ���ͷ� �Ѱܼ�
		//�ٸ� �޼ҵ忡�� �� �ּҹ����� ���� �� �ִ�.
		//�̶� ���������� �����ϰ� �Ķ���ͷ� �ʱ�ȭ�� ���� �ֱ⸸ �ϸ� ����������
		//�� �ּҹ����� ���� �Ǿ� �Ķ���� ���� �ӿ��� �ұ��ϰ� �������� ��밡������.
		JTextAreaTest jta_test = new JTextAreaTest(); //��� Ŭ������ �ν��Ͻ�ȭ �ؼ� �����ڸ� ȣ��.
		//�Ʒ��� �ν��Ͻ� ������ �����Ƿ� �� ������ �ٸ� �޼ҵ峪 �����ڿ��� ����Ҽ� ����.
		new JTextAreaTest();//��� �����ڸ� ȣ��
		jta_test.initDisplay();
	}

}
