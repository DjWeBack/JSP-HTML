package com.ontest;



class test {
	 public int solution(int n) {
		    int m = Integer.parseInt(t[0]);
	        int n = Integer.parseInt(t[1]);

	        //true�� �������͵� - �Ҽ��� �ƴѰ�
	        //false�� �����͵� - �Ҽ�
	        boolean checker[] = new boolean [n+1];
	        checker[1] = true;
	        for(int i = 2; i<=n; i++){
	            if(!checker[i]){
	                for(int j = i+i; j<=n; j+=i){
	                    checker[j] = true;
	                }
	            }
	        }
	        for(int i = m; i<=n; i++){
	            if(!checker[i]){
	                System.out.println(i);
	            }
	        }
	    }
	public static void main(String[] args) {

		test tt = new test();
		tt.solution(10);
		

	}
}
