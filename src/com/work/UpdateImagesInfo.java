package com.work;

import com.work.http.HttpUtils;

public class UpdateImagesInfo {
	
	public static void main(String[] args) throws Exception {
		String jsoninfo = {"info": {"type": "1"}}
		String json = HttpUtils.put("http://35.185.152.118:3001/images/tom/mysql/info", jsoninfo);
		System.out.println(json);
	}


}
