package com.test;

import java.util.Scanner;

public class tt1 {
	public static void main(String[] args) {
		int uno=0;
			Scanner scn = new Scanner(System.in);
			uno=scn.nextInt();
			int yaksu;
			for(int i=1;i<=uno;i++){
				if(uno%i==0){
					System.out.print(i+" ");
				}
			}

	  }
	}

