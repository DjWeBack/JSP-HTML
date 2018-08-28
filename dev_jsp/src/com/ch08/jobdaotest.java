package com.ch08;

import java.util.List;
import java.util.Map;

public class jobdaotest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JobDao jd = new JobDao();
		List<Map<String, Object>> jobtest = jd.getJobList("1");
		for(int i=0;i<jobtest.size();i++) {
		System.out.println(jobtest.get(i));
		}
	}

}
