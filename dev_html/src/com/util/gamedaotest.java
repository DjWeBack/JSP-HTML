package com.util;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class gamedaotest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GameDAO gdao = new GameDAO();
		List<Map<String, Object>> list = gdao.getGameList(null);
		//		gdao.getGameList(pmap);
		System.out.println(list.get(0));		
	}

}
