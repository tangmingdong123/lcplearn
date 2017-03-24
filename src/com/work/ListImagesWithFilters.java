package com.work;

import com.work.http.HttpUtils;

public class ListImagesWithFilters {
	
	public static void main(String[] args) throws Exception {
		String json = HttpUtils.get("http://35.185.152.118:3001/images?username=tom&limit=1&offset=0");
		System.out.println(json);
	}

}
