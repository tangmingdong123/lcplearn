package com.work;

import com.work.http.HttpUtils;

public class ListPublicImages {
	
	public static void main(String[] args) throws Exception {
		String json = HttpUtils.get("http://35.185.152.118:3001/images?username=public&brief=true");
		System.out.println(json);
	}

}
