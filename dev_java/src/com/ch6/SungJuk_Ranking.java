package com.ch6;

public class SungJuk_Ranking {
	public int[] ranking(double[] Avg, int[] haps) {
		System.out.println("ranking ȣ�� ����");
		int[] ranks = new int[3];
		for(int i=0;i<Avg.length;i++) {
			for(int j=0;j<Avg.length;j++) {
				if(haps[i] < haps[j]) {
					ranks[i]++;
				}
			}
		}
		return ranks;
	}
}
