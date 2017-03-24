package com.work;

import com.work.http.HttpUtils;

public class GetAnImage {
	
	public static void main(String[] args) throws Exception {
		String json = HttpUtils.get("http://35.185.152.118:3001/images/tom/mysql");
		System.out.println(json);
	}

}
