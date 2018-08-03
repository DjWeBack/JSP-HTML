package com.naver;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class APIExamCaptchaImage {
	Map<String,Object> keynurl = new HashMap<String, Object>();
	public Map<String,Object> start() {
		APIExamCaptchaNkey apikey = new APIExamCaptchaNkey();
		String rekey= apikey.autokey();
		
		Map<String,Object> keynurl = new HashMap<String, Object>();
		keynurl.put("key", rekey);
		
        String clientId = "Xa4vDbWyph0xrCbmFCPy";//애플리케이션 클라이언트 아이디값";
        String clientSecret = "ssa3ZFHv20";//애플리케이션 클라이언트 시크릿값";
        try {
            String apiURL = "https://openapi.naver.com/v1/captcha/ncaptcha.bin?key=" + rekey;
            URL url = new URL(apiURL);
            keynurl.put("url", apiURL);
            HttpURLConnection con = (HttpURLConnection)url.openConnection();
            con.setRequestMethod("GET");
            con.setRequestProperty("X-Naver-Client-Id", clientId);
            con.setRequestProperty("X-Naver-Client-Secret", clientSecret);
            int responseCode = con.getResponseCode();
            BufferedReader br;
            if(responseCode==200) { // 정상 호출
                InputStream is = con.getInputStream();
                int read = 0;
                byte[] bytes = new byte[1024];
                // 랜덤한 이름으로 파일 생성
                
                File f = new File("E:\\dev_kosmo201804\\dev_html\\WebContent\\captcha","tempname"+ ".jpg");
                
//                f.createNewFile();
                OutputStream outputStream = new FileOutputStream(f);
                while ((read =is.read(bytes)) != -1) {
                    outputStream.write(bytes, 0, read);
                }
                is.close();
                outputStream.close();
            } else {  // 에러 발생
                br = new BufferedReader(new InputStreamReader(con.getErrorStream()));
                String inputLine;
                StringBuffer response = new StringBuffer();
                while ((inputLine = br.readLine()) != null) {
                    response.append(inputLine);
                }
                br.close();
                System.out.println(response.toString());
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        
        return keynurl;
	}
	/*public static void main(String args[]) {
	  APIExamCaptchaImage test = new APIExamCaptchaImage();
	  Map<String, Object> testmap = new HashMap<String, Object>();
	  testmap = test.start();
	  System.out.println(testmap.get("url"));
	    }*/
}
