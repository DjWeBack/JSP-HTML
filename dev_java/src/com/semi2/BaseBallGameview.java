package com.semi2;

import java.awt.*;
import java.util.*;
import javax.swing.*;
//import java.awt.BorderLayout;
//import java.awt.Color;
//import java.awt.GridLayout;
//import java.util.Random;
//
//import javax.swing.JButton;
//import javax.swing.JFrame;
//import javax.swing.JPanel;
//import javax.swing.JScrollPane;
//import javax.swing.JTextArea;
//import javax.swing.JTextField;



public class BaseBallGameview {
	JFrame jf_ball = new JFrame(); //��������
	JPanel jp_east = new JPanel();
	JPanel jp_center = new JPanel();
	JButton jbtns[] = new JButton[4]; //��ü�迭
	String btnn[]= {"������","����","�����","����"};
	int nu=0;
	BaseBallGameEvent bbe = new BaseBallGameEvent();
	BaseBallGameLogic bbl = new BaseBallGameLogic();

	JTextArea jt_tarea = new JTextArea();
	JScrollPane jsp_display = new JScrollPane(jt_tarea,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
	JTextField jtf_input = new JTextField();
//	BaseBallGameEvent gameE = new BaseBallGameEvent();
	/*
	 * ����Ʈ �����ڴ� ������ �� �ִ�. �Ķ���Ͱ� ����. ��� ���ټ� ����.
	 * �Ķ���͸� ���� �����ڰ� �ϳ��� ������ ����Ʈ�����ڴ� ���� �ȵȴ�.
	 */
	BaseBallGameEvent bbge = new BaseBallGameEvent();
	int user [] = new int[3];

	//�̺�Ʈó���� ���� �޼ҵ带 ������ ó���Ѵ�. - ��������
	//ȭ��ó����
	public void initDisplay() {



		for(int nu = 0; nu<jbtns.length; nu++)
		{
			jbtns[nu] = new JButton(btnn[nu]);
			jbtns[nu].addActionListener(bbge);
			//addActionListener(this);

		}
		jf_ball.add("East",jp_east);
		jf_ball.add("Center",jp_center);
		jf_ball.setResizable(false);
		jf_ball.setTitle("�߱� ���� ���� ver1.0");
		jf_ball.setSize(400, 400);
		jf_ball.setVisible(true);
		jt_tarea.setBackground(Color.ORANGE);


		///////����ȭ��////////////
//		jtf_input.addActionListener(this);
		//��ư ����

		jp_center.setLayout(new BorderLayout());
		jp_center.setBackground(Color.YELLOW);
		jp_east.setLayout(new GridLayout(4,1,2,2));
		Random rc = new Random();
		
		
		jbtns[0].setBackground(new Color(rc.nextInt(255), rc.nextInt(255), rc.nextInt(255)));
		jbtns[1].setBackground(new Color(rc.nextInt(255), rc.nextInt(255), rc.nextInt(255)));
		jbtns[2].setBackground(new Color(rc.nextInt(255), rc.nextInt(255), rc.nextInt(255)));
		jbtns[3].setBackground(new Color(rc.nextInt(255), rc.nextInt(255), rc.nextInt(255)));
	
		for(int nu = 0;nu<jbtns.length;nu++)
		{
			jp_east.add(jbtns[nu]);
		}
		jp_center.add(BorderLayout.SOUTH,jtf_input);
		jp_center.add("Center",jsp_display);
		//����ڷκ��� ���� �Է� ����.
		jf_ball.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jt_tarea.append("�߱� ���� ���� !\n");
		jt_tarea.append("�ߺ����� ���� �Ұ�� ���� ����x3\n");
		jt_tarea.append("���� ������ ���� �������� �����ּ���.\n");
	bbe.Gevent();
	bbl.randoms();
	
}
	public static void main(String[] args) {
		BaseBallGameview gv = new BaseBallGameview();
		gv.initDisplay();
	}
}

