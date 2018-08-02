package com.ch5;
import java.util.*;
public class MyarrayTest1 {
	public void initArry(int nums[], int size) {
		Random rn = new Random();
		for(int i=0;i<size;i++) {
			nums[i] = rn.nextInt(10);
		}
	}
	public void print10PerLine(int nums[], int size) {

		for(int i=0;i<size;i++) {
			System.out.printf("%3d", nums[i]);
			if(i%10==9) System.out.println("");
		}
	}
	/*
	 * @param nums[]- ä���� ���� 100��(���), fres[]-100���� ���ڸ� ���� �󵵸� ���, ����� �� 
	 */
	public void numberCount( int nums[],int fres[], int size) {
		int i;//0����~99���� ���� ����
		int index; //100���� ������ �� ���ڰ� �������� 1���迭�� �ε����� �������� 1������Ų��.
		for(i=0;i<size;i++) {
			index = nums[i];//ä���� ����-nums�迭, fres�迭���� �� ���� ��´�.
			fres[index]++;//fres[index]=fres[index]+1


		}
	}
	/*public void numberCount
	 * �Ķ���Ϳ��� ������ Ÿ���̳� ������ Ÿ���� �ѱ� �� �ִ�.
	 * ������ Ÿ���� ��� �� ���� ���� �Ǵ� ���̰� - �������� ����� ����.
	 * ������ Ÿ���� ��� ������ �ּҹ����� �ѱ�� ���̴�.
	 * �Ķ���Ϳ��� �ѹ��� �������� ������Ÿ���� �� �׸��� �������� �ּҹ����� �ѱ� �� �ִ�.
	 * ��Ÿ���Ϳ� �Ѱܴϴ� ������ ȣ���� �� �Ѿ��.
	 */
	public void PrintResult(int fres[], int size) {
		System.out.print("���� :  ");
		for(int i=0;i<size;i++) {
			System.out.printf("%3d",i);
		}
		System.out.println();
		System.out.print("�󵵼� : ");
		for(int i=0;i<size;i++) {
			System.out.printf("%3d",fres[i]);
		}

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = new int[100];
		MyarrayTest1 mat = new MyarrayTest1();
		mat.initArry(nums, nums.length);
		mat.print10PerLine(nums, nums.length);
		int fres[] = new int[10];
		mat.numberCount(nums,fres,nums.length);
		mat.PrintResult(fres,fres.length);
	}
}


