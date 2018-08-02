package com.ch13;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class DukeAnimation extends JFrame implements Runnable{
	//�����
	String 				imgPath 	= "src//com//ch13//duke//";
	Image[]				dukeimg		= new Image[10];
	JPanel				jp_duke		= new JPanel();
	Thread				animator	= null;
	int 				i			= 0;
//	Image memoryimage = createImage(0, 50);
//	Graphics mgc = memoryimage.getGraphics();
	


	//������
		public DukeAnimation(){
			for(int i=1;i<10;i++) {
				dukeimg[i-1] = Toolkit.getDefaultToolkit().getImage(imgPath+"FRAME"+i+".gif");//�̹�����ü
			
			}
		}
		public void showDuke() {
			animator = new Thread(this);//(�ν��Ͻ�ȭ�� �ϰԵǸ� �⺻�����ڰ� ���ǹݻ������� ȣ���.. )
			animator.start();
			
		}
		public void update(Graphics g) {
			g.clearRect(0, 50, 80, 70);
	
//			this.paint(g);
			paint(g);

		}
		//�̹����� ȭ�鿡 �׸��� ���� - callbak method  repaint()-updata()-paint()
		public void paint(Graphics g) {
			g.drawImage(dukeimg[i], 0, 50, this);
			
		}
		public void initDisplay() {

			this.setTitle("��ũ��©");
			this.setSize(500, 500);
			this.setVisible(true);
			showDuke();
			//�̹��� �迭�� ����.

		}
	
	
	//ȭ���

	//���θ޼ҵ�
	public static void main(String[] args) {
		DukeAnimation da = new DukeAnimation();
		da.initDisplay();
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
		this.update(this.getGraphics());
		i++;
		if(i>=9) {
			i=0;
		}
		try {
			Thread.sleep(50);
		} catch (InterruptedException ie) {
			// TODO: handle exception
			break;
		}
		}
	}

}
