package com.lcp.type.number;

public class IntegerLearn {

	public static void main(String[] args) {
		//咱俩的
		printTangAndPingzi();

		
		//题目，你们家四个人的,年龄和、爸爸与你年龄差，爸爸整除弟弟，全家平均年龄
	}
	public static void printTangAndPingzi(){
		int tangAge = 33;
		int pingziAge = 26;
		
		//我们加在一起
		System.out.println("我跟瓶子一共："+(tangAge+pingziAge)+"岁");
		
		//我们差多少岁
		System.out.println("我比瓶子大："+(tangAge-pingziAge)+"岁");
		
		//我们平均多少岁
		System.out.println("我们平均："+(tangAge+pingziAge)/2+"岁");
		
		//我整除你
		System.out.println("我有你几倍："+(tangAge/pingziAge));
		System.out.println("还多出余数："+(tangAge%pingziAge));
		
		//两个瓶子多大
		System.out.println("两个瓶子："+pingziAge*2+"岁");
		
		//明年我的岁数
		System.out.println("明年我的岁数："+(++tangAge)+"岁");
		
		//去年你的岁数
		System.out.println("去年瓶子的岁数："+(--pingziAge)+"岁");
		
		//我们都活不过这个岁数
		System.out.println("我们都活不过这个岁数："+Integer.MAX_VALUE+"岁");
		
		//在这之前恐龙不存在
		System.out.println("在这之前恐龙不存在："+Integer.MIN_VALUE+"年");
	}
}
