package com.lcp.string.work;

public class StringNew {
	public static void main(String[] args){
		String source ="肃宁县地处海河冲积平原，主要种植小麦、玉米等农作物，是国家级商品粮基地，是河北省核心区产粮大县之一；工业以毛皮加工、针纺服装、食品加工、图书印刷发行为主导产业，2013年完成地区生产总值130.0978亿元京九铁路、朔黄铁路在肃宁境内交叉而过，肃宁北站是西煤东运的重要铁路枢纽 12345678ABC901234567890abc123456789";
        count(source);
	}
	
	public static void count(String str ){
		int c=0;
		for(int i=0;i<=str.length();i++){
			if((str.substring(i,i+1)).equals("北")) {
				c++;
				System.out.println("北字出现的位置为"+i);;
			}
		}
	}
}

