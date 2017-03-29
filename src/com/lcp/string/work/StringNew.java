package com.lcp.string.work;

import java.io.UnsupportedEncodingException;

public class StringNew {
	public static void main(String[] args) {
		String source = "  肃宁县地处海河冲积平原，主要种植小麦、玉米等农作物，是国家级商品粮基地，是河北省核心区产粮大县之一；工业以毛皮加工、针纺服装、食品加工、图书印刷发行为主导产业，2013年完成地区生产总值130.0978亿元京九铁路、朔黄铁路在肃宁境内交叉而过，肃宁北站是西煤东运的重要铁路枢纽 12345678ABC901234567890abc123456789  ";
		//countfor(source);
		//countwhile(source);
		//GDP(source);
		//System.out.println("该句话共" + source.length() + "个字符");
		//System.out.println("该句话去除首尾空格共" + source.trim().length() + "个字符");
		//newline(source);
		//changeencode(source);
		largeststring(source);
	}

	public static void countfor(String str) {
		int c = 0;
		for (int i = 0; i < str.length(); i++) {
			if ((str.substring(i, i + 1)).equals("北")) {
				c++;
				System.out.println("北字出现的位置为：" + i);
			}
		}
		System.out.println("北字共出现" + c);
	}

	public static void countwhile(String str) {
		int c = 0;
		int pos = -2;
		while (pos != -1) {
			pos = str.indexOf("北", pos + 2);
			if (pos == -1)
				break;
			System.out.println("北字出现的位置为：" + pos);
			c++;
		}
		System.out.println("北字共出现" + c);
	}

	public static void GDP(String str) {
		int first = str.indexOf("生产总值", 0);
		int last = str.indexOf("亿元", 0);
		String value = str.substring(first + 4, last);
		System.out.println("生产总值:" + value);
	}

	public static void newline(String str) {
		String[] a = str.split("，"); 
		for(int i=0;i<a.length;i++){  
			String[] b = a[i].split("、");
			for(int m=0;m<b.length;m++){
				String[] c = b[m].split("；");
				for(int n=0;n<c.length;n++){
				System.out.println("处理结果: "+c[n]);
				}
			}
	    }
    }
    public static void changeencode(String str){
    	try{
			byte[] str1 = str.getBytes();
			
			str1 = str.getBytes( "UTF-8" );
			System.out.println("UTF-8返回值：" + str1 );
			
			str1 =str.getBytes( "ISO-8859-1" );
			System.out.println("ISO-8859-1返回值：" + str1 );
		} catch ( UnsupportedEncodingException e){
			System.out.println("不支持的字符集");
		}
    }
    public static void largeststring(String str){
    	String[] a = str.split("，"); 
    	String[] result=new String[12];
    	String temp = "";
    	int pos=0;
		for(int i=0;i<a.length;i++){  
			String[] b = a[i].split("、");
			for(int m=0;m<b.length;m++){
				String[] c = b[m].split("；");
				for(int n=0;n<c.length;n++){
				result[pos++]=c[n];
				//System.out.println("result"+n + result[n]);
				}
			}
	    }
		for(int i=1;i<result.length;i++){
			String t1=result[i-1];
			String t2=result[i];		
			if (t1.length()>=t2.length()){
				temp=t1;
			}
			else 
				temp=t2;
		}
		System.out.println("分割后最大字符串为：" + temp);
		
	}

}
