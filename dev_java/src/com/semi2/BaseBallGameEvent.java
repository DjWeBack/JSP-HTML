package com.semi2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class BaseBallGameEvent implements ActionListener{
	BaseBallGameview viewG = new BaseBallGameview();
	BaseBallGameLogic logicG = new BaseBallGameLogic();
public void Gevent(){
	for(int nu = 0; nu<viewG.jbtns.length; nu++)
	{
		viewG.jbtns[nu] = new JButton(viewG.btnn[nu]);
		viewG.jbtns[nu].addActionListener(this);
		//addActionListener(this);

	}
	///////����ȭ��////////////
	viewG.jtf_input.addActionListener(this);
	//��ư ����
}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		Object obj = e.getSource();//�̺�Ʈ�� �߻��� Ŭ������ �ּҹ���
		String label = e.getActionCommand();
		String userNum = viewG.jtf_input.getText();
		if(obj==viewG.jtf_input) {
			viewG.jt_tarea.append(viewG.jtf_input.getText()+"\n");
			viewG.jtf_input.setText("");
			viewG.jt_tarea.append(logicG.result(userNum));



		}
		else if("������".equals(label)) {
			//����ڰ� Ŭ���� ��ư�� ������ ������? �ּҹ���(jbtn_new)�� ���� ���ڿ� ��.
			logicG.randoms();

		}
		else if("����".equals(label)) {
			viewG.jt_tarea.append(logicG.nansu[0]+""+logicG.nansu[1]+""+logicG.nansu[2]+"\n");
		}
		else if("�����".equals(label))
		{
			viewG.jt_tarea.setText("�߱� ���� ���� !\n"+"�ߺ����� ���� �Ұ�� ���� ����x3\n");
			logicG.randoms();
		}
		else if("����".equals(label)) {
			System.exit(0);
		}
	}
}

