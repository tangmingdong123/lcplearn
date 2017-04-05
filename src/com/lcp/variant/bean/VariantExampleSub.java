package com.lcp.variant.bean;

//定义一个子类，尝试访问父类的成员变量
public class VariantExampleSub extends VariantExample{
	public void printPrivateAge(){
		//放开下面一行的注释，会变异报错（红色叉叉）
		//System.out.println("Real Age:"+realAge);
		System.out.println("不能访问private变量");
	}
	public void printProtectedAge(){
		//子类可以访问protected变量
		System.out.println("protected Virtual Age:"+protectedAge);	
	}
	public void printPublicAge(){
		//子类可以访问public变量
		System.out.println("public Full Age:"+publicAge);	
	}
}
