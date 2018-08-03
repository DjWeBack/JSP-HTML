package com.naver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.StringTokenizer;

public class APIExamCaptchaNkey {
	
	public String autokey(){
		String akey ="";
        try {
        	
		String clientId = "Xa4vDbWyph0xrCbmFCPy";//애플리케이션 클라이언트 아이디값";
	    String clientSecret = "ssa3ZFHv20";//애플리케이션 클라이언트 시크릿값";
		
            String code = "0"; // 키 발급시 0,  캡차 이미지 비교시 1로 세팅
            String apiURL = "https://openapi.naver.com/v1/captcha/nkey?code=" + code;
            URL url = new URL(apiURL);
            HttpURLConnection con = (HttpURLConnection)url.openConnection();
            con.setRequestMethod("GET");
            con.setRequestProperty("X-Naver-Client-Id", clientId);
            con.setRequestProperty("X-Naver-Client-Secret", clientSecret);
            int responseCode = con.getResponseCode();
            BufferedReader br;
            if(responseCode==200) { // 정상 호출
                br = new BufferedReader(new InputStreamReader(con.getInputStream()));
            } else {  // 에러 발생
                br = new BufferedReader(new InputStreamReader(con.getErrorStream()));
            }
            String inputLine;
            StringBuffer response = new StringBuffer();
            while ((inputLine = br.readLine()) != null) {
                response.append(inputLine);
                String str = inputLine;
                StringTokenizer st = new StringTokenizer(str, "\"" );
                String [] array = new String[st.countTokens()];
                int i = 0;
                while(st.hasMoreElements()){
                 array[i++] = st.nextToken();
                }
              akey = array[3];
                
            }
            br.close();
            System.out.println(response.toString());
            
        } catch (Exception e) {
            System.out.println(e);
        }
       
        return akey;
	}
	  /* public static void main(String[] args) {
        new APIExamCaptchaNkey();
    }*/
}
