package com.ch4;

public class ArrayTest {
/*	��ȣ	�̸�	JAVA	ORACLE	����	���	����
	1	�Ӵ���	85	80	165	82.5	2
	2	����	70	75	145	72.5	3
	3	�����	90	95	185	92.5	1*/

	public static void main(String[] args) {
		String names[] = {"�Ӵ���","����","�����"};
		int jumsus[][] = {
							{85,80}
						   ,{70,75}
						   ,{90,95}
					     };
		for(int i=0;i<3;i++) {
			System.out.println("names["+i+"]="+names[i]);
		}
		for(int x=0;x<jumsus.length;x++) {//row�� ��(3)��ŭ �ݺ��ϰ�
			for(int y=0;y<jumsus[x].length;y++) {//column�� ��(2)��ŭ �ݺ���.
				System.out.println("jumsus["+x+"]["+y+"]="+jumsus[x][y]);
			}
		}
		int ranks[] = {1,1,1};
	}

}




