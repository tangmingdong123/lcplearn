package com.lcp.variant;

import java.util.Date;

import com.lcp.variant.bean.VariantExample;
import com.lcp.variant.bean.VariantExampleSub;

/**
 * 学习内容
 * 
	变量定义
		定义1：访问符号+类型+名称；
		定义2：访问符号+类型+名称 = 初始值
	成员变量 vs 类变量
	参数变量 vs 方法内变量
	代码块变量
	final变量 vs 常量
	变量的作用域(你定义的变量在哪儿能看到)
	
 * @author Administrator
 *
 */
public class VariantTest {
	public static final String author = "Tang";//本类的作者，final，不可变更，类变量
	public final Date currentDate = new Date();//创建该对象的系统时间，final，不可变更

	public static void main(String[] args) {
		//访问类变量，用：类名 + . + 变量名
		//访问类的public 变量
		System.out.println("VariantExample的类名："+VariantExample.className);
		
		//访问类的private 变量, 是不允许的，编译报错
		//System.out.println("VariantExample的类名："+VariantExample.instanceCout);
		
		//访问类的private 变量,可以通过给类加一个public的get/set方法
		//类方法（类的static方法），用：类名 + . + 变量方法名 + (参数...)
		System.out.println("VariantExample的实例数："+VariantExample.getInstanceCount());
		
		//每次new VariantExampleSub时，InstanceCount数都会增加
		VariantExampleSub sub = new VariantExampleSub();
		System.out.println("VariantExample的实例数："+VariantExample.getInstanceCount());
		
		sub = new VariantExampleSub();
		System.out.println("VariantExample的实例数："+VariantExample.getInstanceCount());
		
		//演示成员变量的可见性
		sub.printPrivateAge();//子类不能访问private变量
		sub.printProtectedAge();//子类能访问protect变量
		sub.printPublicAge();//子类能访问public变量
		
		//System.out.println("sub.protectedAge="+sub.privateAge);//不是子类，不能访问private变量
		//System.out.println("sub.protectedAge="+sub.protectedAge);//不是子类，不能访问protected变量
		System.out.println("sub.publicAge="+sub.publicAge);//所有类都能访问public变量
		
		
		//访问类的成员变量，学习参数变量，以及参数变量与成员变量同名时的特殊处理
		sub.setPrivateAge(15);
		sub.setProtectedAge(33);
		
		//final变量，表示不可变的变量（可以理解为常量）
		final int tempFinalAge = 15;
		
		//下面一行不注释会报错,final变量初始化之后不得改变值
		//tempFinalAge = 16;
		
		final int tempFinalAge2;
		tempFinalAge2 = 18;//上一行定义，这一行赋值，可以！！
		
		//final可以修饰类变量、成员变量、临时变量、参数变量
		int age = 15;
		showFinalParam(age);
		
		//main方法是static方法，不得方位非static变量，不注释会报错
		//System.out.println("currentDate="+currentDate);
		
		//main方法是static方法，可以访问static变量
		System.out.println("currentDate="+VariantTest.author);
		
		//块变量，出了代码块{}就不能访问了
		{
			String name = "Lichunping";
			System.out.println("block variant name="+name);
		}
		//这儿name已经不存在，所以不能访问了
		//System.out.println("block variant outside, name="+name);
	}
	
	public static void showFinalParam(final int param){
		//final变量不可更改,不注释会报错，
		//param = 15;
	}

}
