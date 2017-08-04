package com.recruit.util;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.PublicKey;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by jmx
 * 2017/7/13.
 */
@Slf4j
@Configuration
public class HttpURLConnectionUtils {

    private static final String APP_ID = "wx1d4def9e6f2fc0b5";

    private static final String AUTORIZATION_CODE = "authorization_code";

    private static final String SECRET = "3e5b94009bb5c187edb551d181194f57";

    private static final String GET_TOKEN = "https://api.weixin.qq.com/cgi-bin/token?grant_type=client_credential&appid=%s&secret=%s";

    private final String USER_AGENT = "Mozilla/5.0";

    private static final String GET_TOKEN_URL = "https://api.weixin.qq.com/sns/oauth2/access_token?appid=%s&secret=%s&code=%s&grant_type=authorization_code";

    private static final String GET_USERINFO_URL = "https://api.weixin.qq.com/cgi-bin/user/info?access_token=%s&openid=%s&lang=zh_CN";

    // HTTP GET请求
    public Map<String, Object> getGetTokenUrl(String code) throws Exception {
        String url;
        url = String.format(GET_TOKEN_URL, APP_ID, SECRET, code);
        log.info("url:{}", url);
        URL obj = new URL(url);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();
        //默认值我GET
        con.setRequestMethod("GET");

        //添加请求头
        con.setRequestProperty("User-Agent", USER_AGENT);

        int responseCode = con.getResponseCode();
        System.out.println("\nSending 'GET' request to URL : " + url);
        System.out.println("Response Code : " + responseCode);

        BufferedReader in = new BufferedReader(
                new InputStreamReader(con.getInputStream(),"UTF-8"));
        String inputLine;
        StringBuffer response = new StringBuffer();

        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        JSONObject object = JSON.parseObject(response.toString());
        String accessToken = object.get("access_token").toString();
        String openId = object.get("openid").toString();
        Map<String, Object> map = new HashMap<>();
        map.put("accessToken", accessToken);
        map.put("openId", openId);

//        JSONObject array = (JSONObject) object.getJSONArray("districts").get(0);
//        System.out.println(array.get("center").toString().split(",")[0]);
//        System.out.println(array.get("center").toString().split(",")[1]);
        in.close();
        //打印结果
        System.out.println(map);
        return map;
    }

    public String getToken() throws Exception {
        String url;
        url = String.format(GET_TOKEN, APP_ID, SECRET);
        log.info("url:{}", url);
        URL obj = new URL(url);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();
        //默认值我GET
        con.setRequestMethod("GET");

        //添加请求头
        con.setRequestProperty("User-Agent", USER_AGENT);

        int responseCode = con.getResponseCode();
        System.out.println("\nSending 'GET' request to URL : " + url);
        System.out.println("Response Code : " + responseCode);

        BufferedReader in = new BufferedReader(
                new InputStreamReader(con.getInputStream(),"UTF-8"));
        String inputLine;
        StringBuffer response = new StringBuffer();

        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        JSONObject object = JSON.parseObject(response.toString());
        String accessToken = object.get("access_token").toString();
//        String openId = object.get("openid").toString();
//        Map<String, Object> map = new HashMap<>();
//        map.put("accessToken", accessToken);
//        map.put("openId", openId);

//        JSONObject array = (JSONObject) object.getJSONArray("districts").get(0);
//        System.out.println(array.get("center").toString().split(",")[0]);
//        System.out.println(array.get("center").toString().split(",")[1]);
        in.close();
        //打印结果
        System.out.println(accessToken);
        return accessToken;
    }

    public JSONObject getUserInfo(Map map) throws Exception {
        String url;
        url = String.format(GET_USERINFO_URL, map.get("accessToken"), map.get("openId"));
        URL obj = new URL(url);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();
        //默认值我GET
        con.setRequestMethod("GET");

        //添加请求头
        con.setRequestProperty("User-Agent", USER_AGENT);

        int responseCode = con.getResponseCode();
        System.out.println("\nSending 'GET' request to URL : " + url);
        System.out.println("Response Code : " + responseCode);

        BufferedReader in = new BufferedReader(
                new InputStreamReader(con.getInputStream(),"UTF-8"));
        String inputLine;
        StringBuffer response = new StringBuffer();

        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        JSONObject object = JSON.parseObject(response.toString());
        in.close();
        return object;
    }
}