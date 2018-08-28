package com.ontest;



class test {
	 public int solution(int n) {
		    int m = Integer.parseInt(t[0]);
	        int n = Integer.parseInt(t[1]);

	        //true는 지워진것들 - 소수가 아닌것
	        //false는 남은것들 - 소수
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
