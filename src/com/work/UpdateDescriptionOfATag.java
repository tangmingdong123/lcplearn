package com.work;

import java.text.MessageFormat;

import org.apache.commons.io.IOUtils;

import com.work.http.HttpUtils;
import com.work.json.JSONTool;

public class UpdateDescriptionOfATag {

	public static void main(String[] args) throws Exception {
		String username = "tom";
		String imagename = "mysql";
		String tag = "latest";
		String requestJSON = IOUtils
				.toString(UpdateImageInfo.class.getResourceAsStream("/com/work/UpdateDescriptionOfATag.json"));
		System.out.println("request:\n" + requestJSON);

		String url = "http://35.185.152.118:3001/images/{0}/{1}/tags/{2}/desc";
		url = MessageFormat.format(url, username, imagename, tag);
		System.out.println("url:\n" + url);

		String json = HttpUtils.put(url, requestJSON);
		System.out.println("response:" + JSONTool.formatJson(json));
	}

}
