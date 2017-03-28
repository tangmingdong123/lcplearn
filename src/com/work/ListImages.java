package com.work;

import com.work.http.HttpUtils;
import com.work.json.JSONTool;

public class ListImages {
	public static void main(String[] args) throws Exception {
		//brief=true,return only names of images
		String json = HttpUtils.get("http://35.185.152.118:3001/images?brief=true");
		System.out.println(JSONTool.formatJson(json));
		//if false, return all fields of images doc
		String json1 = HttpUtils.get("http://35.185.152.118:3001/images");
		System.out.println(JSONTool.formatJson(json1));
	}
}
