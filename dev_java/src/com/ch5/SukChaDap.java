package com.ch5;

//�� �׸񺰷� Ŭ������ ������.
//�� �׺����� �迭�� ���� ��´�.
		
public class SukChaDap {
	public String[][] initData() {//�Ķ���Ϳ� ����� ������ ���������̰�, �迭�̹Ƿ� ������ �ּҹ����� ���´�.
		//�迭�� ���ϰ����� �����Ѵ�.
		System.out.println("initData ȣ�� ����");
		String[][] datas = {
							 {"1","�̼���","70","80","90"}
							,{"2","������","55","72","89"}
							,{"3","����","66","88","99"}
							};
		return datas;
	}
	public int[] Hap(String[][] datas) {
		System.out.println("Hap ȣ�� ����");
		int[] haps = new int[3];
			for(int i=0;i<datas.length;i++) {//datas[i].length - �÷���
				haps[i] = Integer.parseInt(datas[i][2]) + Integer.parseInt(datas[i][3]) +Integer.parseInt(datas[i][4]);
			}
		return haps;
	}
	public double[] Avg(int[] haps) {
		System.out.println("Avg ȣ�� ����");
		double[] Avg = new double[3];
		for(int i=0;i<haps.length;i++) {
			Avg[i] = haps[i]/3.0;
		}
		return Avg;
	}
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
	public void sugJuckAccount(String[][] datas) {
		System.out.println("sugJuckAccount ȣ�� ����");
		for(int i=0;i<datas.length;i++) {
			//for(int j=0;j<datas[i].length;j++) {
				System.out.printf("%3s %8s %5s %5s %5s %n", datas[i][0],datas[i][1],datas[i][2],datas[i][3],datas[i][4]);
			//}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SukChaDap sjApp = new SukChaDap();
		String[][] datas = new String[3][5]; //datas�� �ּҹ����̴�. - new - �ּҹ��� - �θ��� - �ּҹ���
		datas = sjApp.initData();//������ �ʱ�ȭ-�����ͼ���-������ ���� �ִ�.
		int[] haps = sjApp.Hap(datas);//ȣ���Ҷ� �����̸���,�޼ҵ� ������ �� Ÿ�Ե� ���� /���ϰ� ȣ��
		for(int i=0;i<haps.length;i++) {
			System.out.println(haps[i]);
			}
		double[] Avg = sjApp.Avg(haps);
		for(int i=0;i<Avg.length;i++) {
			System.out.println(Avg[i]);
			}
		int[] ranks = sjApp.ranking(Avg,haps);
		for(int i=0;i<Avg.length;i++) {
			for(int j=0;j<haps.length;j++) {
			}
			System.out.println(ranks[i]);
			}
		sjApp.sugJuckAccount(datas);
	}
}
