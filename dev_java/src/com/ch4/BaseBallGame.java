package com.ch4;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class BaseBallGame {
	//����� - ����ο��� ����� �޼ҵ带 ȣ������ �ʴ´�.
	JFrame jf_ball = new JFrame();//��������
	JPanel jp_east = new JPanel();//���ʿ� ���� ����
	JPanel jp_center = new JPanel();//JFrame�� �߾ӿ� ��ġ�� �����̴�.
	//��ư 4�� �߰��غ��� - ��ư�� ���ؼ��� �̺�Ʈ ó���� �ؾߵǴϱ� ���������� ����
	//�̺�Ʈó���� ���� �޼ҵ带 ������ ó���Ѵ�.-��������
	JButton jbtn_new = new JButton("������");
	JButton jbtn_dap = new JButton("����");
	JButton jbtn_clear = new JButton("�����");
	JButton jbtn_exit = new JButton("����");
	//ȭ��ó����
	public void initDisplay() {
		//jp_center������ �߾ӿ� JTextArea, ���ʿ� JTextField�� ���� �Ŵϱ�
		//���̾ƿ��� BorderLayout���� ������.
		jp_center.setLayout(new BorderLayout());
		jp_center.setBackground(Color.YELLOW);
		//��ư 4���� jp_east������ ���̱� ���ؼ��� ���� ���̾ƿ�(��ġ)�����ؾ� ��.
		jp_east.setLayout(new GridLayout(4,1,2,2));
		//jp_east.setBackground(new Color(120,34,59));
		jp_east.setBackground(Color.pink);
		jp_east.add(jbtn_new);
		jp_east.add(jbtn_dap);
		jp_east.add(jbtn_clear);
		jp_east.add(jbtn_exit);
		//���� ȭ�鿡 ������ ������ �ʾƿ�-�޸𸮿��� �ε��Ǿ� ������ jf_ball�� ���� ������ ����.
		jf_ball.add("East",jp_east);
		//jp_center������ JFrame���̱�
		jf_ball.add("Center", jp_center);
		jf_ball.setResizable(false);
		jf_ball.setTitle("�߱����ڰ��� Ver1.0");
		jf_ball.setSize(300, 400);//â�� ���ο� ���� ���� ����
		jf_ball.setVisible(true);//â Ȱ��ȭ|��Ȱ��ȭ
	}
	
	//���� ����ó���ϴ� �޼ҵ�
	public String result(String userInput) {
		return "1�� 0��";
	}
	
	//���θ޼ҵ�
	public static void main(String[] args) {
		//insert here - initDisplay()ȣ���ϱ�
		//���ȿ� �ִ� �޼ҵ�� �ν��Ͻ�ȭ ���� ����� �� ����. �׷��� non-static�� static�������� ���Ұ��ϱ�
		//�ν��Ͻ�ȭ �ؾߴ�.
		BaseBallGame bbGame = new BaseBallGame();
		bbGame.initDisplay();
	}

}


