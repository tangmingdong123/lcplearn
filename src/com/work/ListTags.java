package com.work;

import com.work.http.HttpUtils;
import com.work.json.JSONTool;

public class ListTags {
	
	public static void main(String[] args) throws Exception {
		String json = HttpUtils.get("http://35.185.152.118:3001/images/tom/mysql/tags");
		System.out.println(JSONTool.formatJson(json));
	}

}
