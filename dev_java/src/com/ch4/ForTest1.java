package com.ch4;
import java.util.*;
public class ForTest1 {

	public static void main(String[] args) {


		String[] Name = {"Moon","Lee","Kim","Jang"};
		int Rank []= {1,1,1,1};
		int Sum[] = new int[4];
		int Jac[] = new int[4];
		int Orac[] = new int[4];
		int s=0;
		double Avg=0;
		int i =0;
		Random ran = new Random();
		int r=0;
		int r2=0;
		
		for(i=0;i<4;i++){
			
			r=ran.nextInt(100);
			r2=ran.nextInt(100);
			Jac[i] = r;
			Orac[i] = r2;
			Sum[i]=Jac[i]+Orac[i];
		}
		
		System.out.println("===================================================");
		System.out.println("��ȣ\t�̸�\tJAVA\tORACLE\t����\t���\t����");
		for(s=0;s<4;s++)
		{
			Avg = Sum[s]/2;
			for(i=0;i<4;i++)
			{
				if(Sum[s]<Sum[i])
					Rank[s]++;
			}
			
			System.out.println("��ȣ\t"+Name[s]+"\t"+Jac[s]+"\t"+Orac[s]+"\t"+Sum[s]+"\t"+Avg+"\t"+Rank[s]);
			i++;
			
			 /*System.out.println("=========================================");
			System.out.println(Name[s]);
			System.out.println("JAVA���� : "+Jac[s]);
			System.out.println("ORACLE���� : "+Orac[s]);
			System.out.println("���� : "+Sum[s]);
			System.out.println("��� : "+(Avg));*/
			

			
			//System.out.println("���� : " + Rank[s]);
				
			/*if(Sum[s]<Sum[0]) 
			{
				Rank[s]++;
			}
			if(Sum[s]<Sum[1])
			{
				Rank[s]++;
			}
			if(Sum[s]<Sum[2])
			{
				Rank[s]++; 
			}
			if(Sum[s]<Sum[3]) 
			{
				Rank[s]++; 
			}
			System.out.println("���� : " + Rank[s]);*/
		}


	}
}




