package com.semi;
import java.util.*;
public class logictest {

	public static void main(String[] args) {
		Random ran = new Random();
		Scanner scn = new Scanner(System.in);
		int nansu[] = {0,0,0};
		int user[] = {0,0,0};
		int i=0;
		int sc=0;
		int ball=0;
		System.out.print("ù��°�� �Է� : ");
		user[i] = scn.nextInt();//i=0
		i++;
		System.out.print("�ι�°�� �Է� : ");
		user[i] = scn.nextInt();//i=1
		i++;
		System.out.print("����°�� �Է� : ");
		user[i] = scn.nextInt();//i=2

		for(i=0;i<3;i++) { //������ 3���� ä��
			nansu[i]=ran.nextInt(3);
			System.out.print(nansu[i]);
		}
		for(i=0;i<3;i++) {
			if(nansu[i]==user[i])
			{
				sc=0;
				sc++;
				if(nansu[1]==user[1])
				{
					sc++;
					if(nansu[2]==user[2]) {
						sc++;
					}
				}
			}
			else
			{
				ball=0;
				ball++;
				if(nansu[1]!=user[1]){
					ball++;
					if(nansu[2]!=user[2]) {
						ball++;
					}
				}
			}


		}

		System.out.println("\n"+sc+"��Ʈ����ũ"+" "+ball+"��");
		if(ball>=3) {
			System.out.println("GameOver");
		}
	}

}
