package com.ch5;
import java.util.*;

public class MyArray {
	int tot = 0;
	int hsum[]=new int[5];
	int scna[] = new int[hsum.length];
	public int hap(String user[]) {
		Scanner scn =  new Scanner(System.in);

		for(int sc=0;sc<hsum.length;sc++) {
			System.out.println("���� �Է� �ϼ��� : ");
			scna[sc]=scn.nextInt();
		}
		for(int j=0;j<hsum.length;j++) {
			tot += scna[j];
		}

		return tot;


	}
	public double MyAvg(int tot,int inwon) {

		double avg = 0.0;
		inwon=scna.length;
		avg = tot/inwon;
		return avg;

	}
	//���� ���� ����ȴ�.
	public static void main(String[] args) {
		MyArray ma = new MyArray();//������
		int tot = 0;
		double avg = 0.0;
		tot = ma.hap(args);
		//avg = ma.MyAvg(tot, args); 
		//ma.MyAvg(tot, args.length);
		if(args.length<5) {
			System.out.println("0���� 100������ ���� 5���� �Է��ϼ���");
		}
		System.out.println(tot);
		System.out.println();
	}
}

