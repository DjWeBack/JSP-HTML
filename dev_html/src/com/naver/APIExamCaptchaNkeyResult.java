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
		String acc = "�����Ǿ����ϴ�.";
		String clientId = "Xa4vDbWyph0xrCbmFCPy";//���ø����̼� Ŭ���̾�Ʈ ���̵�";
        String clientSecret = "ssa3ZFHv20";//���ø����̼� Ŭ���̾�Ʈ ��ũ����";
//        key_url = APIExamCaptchaImage.start(); // ĸ�� Ű �߱޽� ���� Ű��
              String str = null;
        /*System.out.println("Ű�� �Է� �ϼ���");
        Scanner scn = new Scanner(System.in);
       user=scn.nextLine();*/
        try {
            String code = "1"; // Ű �߱޽� 0,  ĸ�� �̹��� �񱳽� 1�� ����
            
            String apiURL = "https://openapi.naver.com/v1/captcha/nkey?code=" + code +"&key="+ ckey + "&value="+ userinp;

            URL url = new URL(apiURL);
            HttpURLConnection con = (HttpURLConnection)url.openConnection();
            con.setRequestMethod("GET");
            con.setRequestProperty("X-Naver-Client-Id", clientId);
            con.setRequestProperty("X-Naver-Client-Secret", clientSecret);
            int responseCode = con.getResponseCode();
            BufferedReader br;
            if(responseCode==200) { // ���� ȣ��
                br = new BufferedReader(new InputStreamReader(con.getInputStream()));
            } else {  // ���� �߻�
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
        System.out.println("�߱޹��� Ű : "+ckey);
        
        
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