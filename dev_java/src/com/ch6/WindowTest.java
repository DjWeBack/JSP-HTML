package com.ch6;
import javax.swing.*;
public class WindowTest {
	JFrame jf = new JFrame();
	JTextArea jt = new JTextArea();
	public void windowOpen(String IDcheck, int ho, int va){
		//ID�ߺ��˻�, ����ũ��, ����ũ��
		jf.setTitle(IDcheck);
		jf.setSize(ho, va);
		jf.setVisible(true);
		jf.add(jt);
		jt.append("�ߺ��˻�â�Դϴ�.");
	}
	public void windowOpen(int pnum, int ho, int va){
		//�����ȣ�˻�, ����ũ��,����ũ��
		String Pnumname = String.valueOf(pnum);
		Pnumname = "�����ȣ �˻�";
		jf.setTitle(Pnumname);
		jf.setSize(ho, va);
		jf.setVisible(true);
		jf.add(jt);
		jt.append("�����ȣ �˻�â �Դϴ�.");
	}
	public void windowOpen(String book, String ho, String va){
		//�����˻�, ����ũ��,����ũ��
		int pho=0;
		int pva=0;
		pho = Integer.parseInt(ho);
		pva = Integer.parseInt(va);
		jf.setTitle(book);
		jf.setSize(pho,pva);
		jf.setVisible(true);
		jf.add(jt);
		jt.append("�����˻� â�Դϴ�.");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WindowTest wt[] = {new WindowTest(),new WindowTest(),new WindowTest()};//�ν��Ͻ� ������ �迭�ȿ� ������ ����... ���ű�....
		
		wt[0].windowOpen("�ߺ��˻�â",300,500);
		wt[1].windowOpen(4451,800,500);
		wt[2].windowOpen("�����˻�","500","500");
		}


}
