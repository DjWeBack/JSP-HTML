package com.ch4;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�Ǻ���ġ ������ ��Ģ�� �˻��ؼ� �˾Ƴ��� a1�׿��� a20��° �ױ��� ��Ģ�� �����ϴ� ���α׷��� �ۼ��ؼ� ���� ����� ������.
		/*
		1+1 = 2
		1+2 = 3
		3+2 = 5
		5+3 = 8
		8+5 = 13
		*/
		//   1+2= sum=j+fibo
		// 1 1 2 3 5 8 13 21 <<fibo 
		// 1+1=2+1 <<j
		//
		
		/*int j = 1;
		int sum = 1;
		int fibo = 0;
		int i=0;
		for(i=1;i<=18;i++) {
			fibo=j+sum;
			j=sum;
			sum=fibo;
			
			System.out.println(sum);
			
		}*/
		int a1=1;
		int a2=1;
		int a3=0;
		System.out.print(a1+" "+a2+" ");
		for(int i=0;i<19;i++) {
			a3= a2+a1;
			System.out.print(a3+" ");
			a1=a2;
			a2=a3;
		}
				
		}
		
	}


