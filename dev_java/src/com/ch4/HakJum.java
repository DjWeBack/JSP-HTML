package com.ch4;
import java.util.*;
import javax.swing.*;
public class HakJum {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		JFrame jf =new JFrame();
		String juc = "";
		juc = JOptionPane.showInputDialog("������ �Է��ϼ��� ");
		int jucs = 0;
		jucs = Integer.parseInt(juc);
		String i= "";
		if ((jucs>=90)&&(jucs<=100)) {
			System.out.println("����� ���� : " +jucs);
			System.out.println("A�����Դϴ�.");
			JOptionPane.showMessageDialog(jf, "����� ���� : " +jucs+"\n A���� �Դϴ�.", "����", 1);
			i = "A";
			
			
		}
		else if (jucs>=80&&(jucs<=89))
		{
			System.out.println("����� ���� : " +jucs);
			System.out.println("B�����Դϴ�.");
			JOptionPane.showMessageDialog(jf, "����� ���� : " +jucs+"\n B���� �Դϴ�.", "����", 1);
			System.exit(0);
			i = "B";
		}
		else if (jucs>=70&&(jucs<=79))
		{
			System.out.println("����� ���� : " +jucs);
			System.out.println("B�����Դϴ�.");
			JOptionPane.showMessageDialog(jf, "����� ���� : " +jucs+"\n C���� �Դϴ�.", "����", 1);
			System.exit(0);
			i = "C";
		}
		else if (jucs>=60&&(jucs<=69))
		{
			System.out.println("����� ���� : " +jucs);
			System.out.println("B�����Դϴ�.");
			JOptionPane.showMessageDialog(jf, "����� ���� : " +jucs+"\n D���� �Դϴ�.", "����", 2);
			System.exit(0);
			i = "D";
		}
		else
		{
			System.out.println("����� ���� : " +jucs);
			System.out.println("B�����Դϴ�.");
			JOptionPane.showMessageDialog(jf, "����� ���� : " +jucs+"\n F���� �Դϴ�.", "����", 0);
			System.exit(0);
			i = "F";
		}
		
/*		int j=0;
		j = jucs;
		String  k ="" ;
		switch (j/10) {
		case 10:
		case 9:
			k="A";
			break;
		case 8:
			k="B";
			break;
		case 7:
			k="C";
			break;
		case 6:
			k="D";
			break;
		default : 
			k="F";
			break;
		
		}
		System.out.println("����� ������ : " +k+"�Դϴ�.\n" + "����� ������ : " +jucs+"�Դϴ�.");
		System.exit(0);*/
		
	}
	
	}
	
	