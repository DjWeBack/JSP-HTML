package com.secure;

import java.util.Base64;
import java.util.Base64.Encoder;

public class Base64Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String mem_id = "weback";
		String mem_pw = "qawsed";
		byte[] idBytes = mem_id.getBytes();
		Encoder idEncoder = Base64.getEncoder();
		byte[] encodeBytes = idEncoder.encode(idBytes);
		String base64ID = new String(encodeBytes);
		System.out.println("mem_id : "+mem_id+", base64ID : "+base64ID);
		
		
		byte[] pwBytes = mem_pw.getBytes();
		Encoder pwEncoder = Base64.getEncoder();
		byte[] pwencodeBytes = pwEncoder.encode(pwBytes);
		String pwbase64ID = new String(pwencodeBytes);
		System.out.println("mem_pw : "+mem_pw+", base64ID : "+pwbase64ID
				);
	}

}
