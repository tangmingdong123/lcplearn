package com.work;

import java.text.MessageFormat;

import org.apache.commons.io.IOUtils;

import com.work.http.HttpUtils;

public class UpdateImageInfo {
	public static void main(String[] args) throws Exception {
		String username = "admin";
		String imagename = "alpine";
		String requestJSON = IOUtils.toString(UpdateImageInfo.class.getResourceAsStream("/com/work/updateImageInfoRequest.json"));
		System.out.println("request:\n"+requestJSON);
		
		String url  = "http://35.185.152.118:3001/images/{0}/{1}/info";
		url = MessageFormat.format(url, username,imagename);
		System.out.println("url:\n"+url);
		
		String json = HttpUtils.put(url
				,requestJSON);
		System.out.println("response:"+json);
	}
}
