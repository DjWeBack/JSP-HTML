package com.semi;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import com.ch4.ForTest;
import com.ch4.Test1;

import java.util.*;

public class BaseballGame implements ActionListener{
	//�����
	JFrame jf_ball = new JFrame(); //��������
	JPanel jp_east = new JPanel();
	JPanel jp_center = new JPanel();
	///////��ư////////////
	//	JButton jbtn_new = new JButton("������");
	//	JButton jbtn_dap = new JButton("����");
	//	JButton jbtn_clear = new JButton("�����");
	//	JButton jbtn_exit = new JButton("����"); 
	JButton jbtns[] = new JButton[4]; //��ü�迭
	//Color�� �迭�� ����
	Color colors[] = new Color[jbtns.length];
	String btnn[]= {"������","����","�����","����"};
	int nu=0;
	
	
	JTextArea jt_tarea = new JTextArea();
	JScrollPane jsp_display = new JScrollPane(jt_tarea,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
	JTextField jtf_input = new JTextField();
	Random ran = new Random();
	logictest2 logic = new logictest2();
	int user [] = new int[3];

	//�̺�Ʈó���� ���� �޼ҵ带 ������ ó���Ѵ�. - ��������
	//ȭ��ó����
	public void initDisplay() {

		
		
		for(int nu = 0; nu<jbtns.length; nu++)
		{
			jbtns[nu] = new JButton(btnn[nu]);
			jbtns[nu].addActionListener(this);
			
		}
		jf_ball.add("East",jp_east);
		jf_ball.add("Center",jp_center);
		jf_ball.setResizable(false);
		jf_ball.setTitle("�߱� ���� ���� ver1.0");
		jf_ball.setSize(400, 400);
		jf_ball.setVisible(true);
		jt_tarea.setBackground(Color.ORANGE);


		///////����ȭ��////////////
		jtf_input.addActionListener(this);
		//��ư ����
		
		jp_center.setLayout(new BorderLayout());
		jp_center.setBackground(Color.YELLOW);
		jp_east.setLayout(new GridLayout(4,1,2,2));
		Random rc = new Random();
		int cnu = 0;
		for(cnu=0;cnu<jbtns.length;cnu++) {
		colors[cnu] = new  Color(rc.nextInt(255), rc.nextInt(255), rc.nextInt(255));
		}
		jbtns[0].setBackground(new Color(rc.nextInt(255), rc.nextInt(255), rc.nextInt(255)));
		jbtns[0].setForeground(colors[0]);
		jbtns[1].setBackground(new Color(rc.nextInt(255), rc.nextInt(255), rc.nextInt(255)));
		jbtns[1].setForeground(colors[1]);
		jbtns[2].setBackground(new Color(rc.nextInt(255), rc.nextInt(255), rc.nextInt(255)));
		jbtns[2].setForeground(colors[2]);
		jbtns[3].setBackground(new Color(rc.nextInt(255), rc.nextInt(255), rc.nextInt(255)));
		jbtns[3].setForeground(colors[3]);
		//jbtns[0].setBackground(new Color(255, 0, 0));
		//jbtns[1].setBackground(new Color(0, 255, 0));
		//jbtns[2].setBackground(new Color(0, 0, 255));
		//jbtns[3].setBackground(new Color(50, 50, 50));
		for(int nu = 0;nu<jbtns.length;nu++)
		{
			jp_east.add(jbtns[nu]);
		}
		/*jp_east.add(jbtns[0]);
		jp_east.add(jbtns[1]);
		jp_east.add(jbtns[2]);
		jp_east.add(jbtns[3]); */
		jp_center.add(BorderLayout.SOUTH,jtf_input);
		jp_center.add("Center",jsp_display);
		//����ڷκ��� ���� �Է� ����.
		jf_ball.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jt_tarea.append("�߱� ���� ���� !\n");
		jt_tarea.append("�ߺ����� ���� �Ұ�� ���� ����x3\n");
		jt_tarea.append("���� ������ ���� �������� �����ּ���.\n");
	}

	//���� ����ó���ϴ� �޼ҵ�

	public String result(String userInput) {


		int sc = 0;
		int ball = 0;

		int temp=0;

		temp=Integer.parseInt(userInput);

		user[0] = temp/100;
		user[1] = (temp%100)/10;
		user[2] = temp%10;
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				if(user[i]==logic.nansu[j]) {
					if(i==j) {
						sc++;
					}
					else {
						ball++;
					}
				}
			}
		}

		return +sc+"��Ʈ����ũ"+""+ball+"��";

	}

	public static void main(String[] args) {
		//insert here - initDispalyȣ���ϱ�

		BaseballGame bbgame = new BaseballGame();
		bbgame.initDisplay();


	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		//String dap = String.valueOf(logic.nansu[0]+""+logic.nansu[1]+""+logic.nansu[2]);
		Object obj = e.getSource();//�̺�Ʈ�� �߻��� Ŭ������ �ּҹ���
		String label = e.getActionCommand();
		String userNum = jtf_input.getText();
		if(obj==jtf_input) {
			jt_tarea.append(jtf_input.getText()+"\n");
			jtf_input.setText("");
			jt_tarea.append(result(userNum));



		}
		else if("������".equals(label)) {
			//����ڰ� Ŭ���� ��ư�� ������ ������? �ּҹ���(jbtn_new)�� ���� ���ڿ� ��.
			logic.randoms();

		}
		else if("����".equals(label)) {
			jt_tarea.append(logic.nansu[0]+""+logic.nansu[1]+""+logic.nansu[2]+"\n");
		}
		else if("�����".equals(label))
		{
			jt_tarea.setText("�߱� ���� ���� !\n"+"�ߺ����� ���� �Ұ�� ���� ����x3\n");
			logic.randoms();
		}
		else if("����".equals(label)) {
			System.exit(0);
		}
		/*	
		switch (label) {
		case "������":
			jt_tarea.append(logic.nansu[0]+""+logic.nansu[1]+""+logic.nansu[2]+"\n");
			break;
		case "����":
			logic.randoms();
			break;
		case "�����":
			jt_tarea.setText("�߱� ���� ���� !\n"+"�ߺ����� ���� �Ұ�� ���� ����x3\n");
			logic.randoms();
			break;

		default:
			System.exit(0);
			break;
		}
		����ġ ���� ����Ҷ�*/
		//jt_tarea.append("�߱� ���� ���� !\n");
		//jt_tarea.append("�ߺ����� ���� �Ұ�� ���� ����x3\n");
		//jt_tarea.append("���� ������ ���� �������� �����ּ���.\n");
	}

}


