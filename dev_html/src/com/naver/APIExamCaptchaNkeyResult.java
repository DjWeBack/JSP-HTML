package com.naver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

public class APIExamCaptchaNkeyResult {
	
	public String accin(String userinp, String ckey) {
//		Map<String, Object> key_url = new HashMap<String, Object>();
		String acc = "인증되었습니다.";
		String clientId = "Xa4vDbWyph0xrCbmFCPy";//애플리케이션 클라이언트 아이디값";
        String clientSecret = "ssa3ZFHv20";//애플리케이션 클라이언트 시크릿값";
//        key_url = APIExamCaptchaImage.start(); // 캡차 키 발급시 받은 키값
              String str = null;
        /*System.out.println("키를 입력 하세요");
        Scanner scn = new Scanner(System.in);
       user=scn.nextLine();*/
        try {
            String code = "1"; // 키 발급시 0,  캡차 이미지 비교시 1로 세팅
            
            String apiURL = "https://openapi.naver.com/v1/captcha/nkey?code=" + code +"&key="+ ckey + "&value="+ userinp;

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
                str=inputLine;
            }
            br.close();
            System.out.println(response.toString());
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("발급받은 키 : "+ckey);
        
        
        StringTokenizer st = new StringTokenizer(str, ":"+"," );
        String [] array = new String[st.countTokens()];
        int i = 0;
        while(st.hasMoreElements()){
         array[i++] = st.nextToken();
        }
        return array[1];

      
	}
	/* public static void main(String[] args) {
		 APIExamCaptchaNkeyResult test = new APIExamCaptchaNkeyResult();
		 test.accin();
		 
	    }*/
	}