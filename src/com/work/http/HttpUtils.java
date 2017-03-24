package com.work.http;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.ParseException;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.protocol.HTTP;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class HttpUtils {  
	private static Logger logger = LoggerFactory.getLogger(HttpUtils.class);
	
    public static String post(String url, Map<String, String> params) throws IOException{  
        HttpPost post = postForm(url, params);  
        return sendRequest(post);  
    }  
    
    public static String get(String url)throws Exception {  
        HttpGet get = new HttpGet(url);  
        return sendRequest(get);  
    }  
          
    private static String sendRequest(HttpUriRequest httpost)throws IOException {  
        HttpResponse response = null;  
        
        CloseableHttpClient client = HttpClients.createDefault();
        try {  
            response = client.execute(httpost);  
            HttpEntity entity = response.getEntity();  
            
            //String charset = EntityUtils.getContentCharSet(entity); 
            String body = EntityUtils.toString(entity, "UTF-8");
            
            return body;
        } catch (IOException e) {  
           throw e; 
        }  finally{
        	if(client!=null){
        		try {
					client.close();
				} catch (IOException e) {
				}
        	}
        }
    }  
  
    private static HttpPost postForm(String url, Map<String, String> params){  
        HttpPost httpost = new HttpPost(url);  
        List<NameValuePair> nvps = new ArrayList <NameValuePair>();  
          
        Set<String> keySet = params.keySet();  
        for(String key : keySet) {  
            nvps.add(new BasicNameValuePair(key, params.get(key)));  
        }  
          
        try {  
            httpost.setEntity(new UrlEncodedFormEntity(nvps, HTTP.UTF_8));  
        } catch (UnsupportedEncodingException e) {  
            e.printStackTrace();  
        }  
          
        return httpost;  
    }  
    
    public static void main(String[] args)throws Exception  {
        Map<String,String> params = new HashMap<>();
        params.put("clientId", "CE-OL-QA");
        params.put("queryterms", "{\"sid\":\"RenminInsurance_b433822468cbf1ca7f767257319ab31b\"}");
        
        String result = HttpUtils.post("http://10.141.5.115:8080/fetchBaodan/baodan/getFetchStatus", params);
        System.out.println(result);
    }
}  
