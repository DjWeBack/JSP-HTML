package com.ch4;
import java.util.*;
import javax.swing.*;
public class Test1 {

	public static void main(String[] args) {
		/* ��������
		 * 1���� 100������ ���ڸ� ä���ؼ� 5�� ����̸� 5�� ����Դϴ� ��� ����ϰ�.
		 * 7�� ���� �������� 0�̸� 7�� ��� �Դϴ�. ��� ����ϰ�.
		 * 5�� ���� �������� 0�̰� 7�� ���� �������� 0�̸� 5�� 7�� �������� ����ϴ�
		 * ���α׷��� �ۼ��Ͻÿ�.
		 */
		JFrame jf = new JFrame();
		Random ran = new Random();
		int r = ran.nextInt(10000);
		
		int Jumsu = 0;
		String Jum = "";
		Jum = JOptionPane.showInputDialog("���� �־����");
		Jumsu = Integer.parseInt(Jum);

		
		/* if (Jumsu%5==0 && Jumsu%7==0)
		{
			JOptionPane.showMessageDialog(jf, Jumsu+"�� 5��7�� ��� �Դϴ�.", "���Ȯ��", 1);	
		}
		else if (Jumsu%5 == 0)
		{
			JOptionPane.showMessageDialog(jf, Jumsu+"�� 5�� ��� �Դϴ�.", "���Ȯ��", 1);	
		}
		else if (Jumsu%7==0)
		{
			JOptionPane.showMessageDialog(jf, Jumsu+"�� 7�� ��� �Դϴ�.", "���Ȯ��", 1);
		}
		else if (r%7==0 && r%5==0)
		{
			JOptionPane.showMessageDialog(jf, r+"�� 5��7�� ��� �Դϴ�.", "���Ȯ��", 1);
		}
		else
		{
			{
				JOptionPane.showMessageDialog(jf, Jumsu+"�� 5��7�� ����� �ƴմϴ�..", "���Ȯ��", 1);
			} */
	if (r%5==0)
		{
			JOptionPane.showMessageDialog(jf, r+"�� 5�� ��� �Դϴ�.", "���Ȯ��", 1);
		}
		else if (r%7==0)
		{
			JOptionPane.showMessageDialog(jf, r+"�� 7�� ��� �Դϴ�.", "���Ȯ��", 1);
		}
		else if (r%5!=0 && r%7!=0)
		{
			JOptionPane.showMessageDialog(jf, r+"�� 5��7�� ����� �ƴմϴ�..", "���Ȯ��", 1);
		}
		
		else
		{
			
				JOptionPane.showMessageDialog(jf, r+"�� 5��7�� ����� �ƴմϴ�..", "���Ȯ��", 1);
			}
	System.exit(0);
		}
	
		}
	
	


