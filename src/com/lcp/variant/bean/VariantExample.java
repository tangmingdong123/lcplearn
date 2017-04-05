package com.lcp.variant.bean;
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
public class VariantExample {
	/*
	 * 在类下直接定义的变量叫成员变量或者类变量
	 * 类变量前面有一个static关键字
	 * 可见性有三个：
	 * 		private：只有当前类里能访问到
	 * 		protected：只有当前类和子类能访问到
	 * 		public：所以的类都能访问到
	 */
	private int privateAge = 18;		//真实年龄，自己知道；		private 是私有，只有VariantExample类内能看到
	protected int protectedAge = 18;	//虚岁，自己和自己的亲人知道；	protected 是私有，只有VariantExample类和子类能看到
	public int publicAge = 18;		//周岁，对外公开的，大家都知道；protected 是私有，只有VariantExample类和子类能看到
	
	private static int instanceCount = 0;//类的实例个数，属于类变量VariantExample只存这一份
	public static String className = "VariantExample";
	
	public VariantExample(){
		instanceCount ++;
	}

	public static int getInstanceCount() {
		return instanceCount;
	}
	
	public void printPrivateAge(){
		//自己可以访问自己的private变量，但是其他类不能
		System.out.println("private Age:"+privateAge);
	}
	
	//学习参数变量
	public void setPrivateAge(int privateAge/*这里的privateAge是setRealAge函数的一个参数，叫做参数变量*/){
		this.privateAge = privateAge;//this表示当前实例，this.privateAge是当前实例的成员变量,而没有this.的privateAge是参数变量
	}
	//学习参数变量2
	public void setProtectedAge(int va/*这里的va是setVirtaulAge函数的一个参数，叫做参数变量*/){
		protectedAge = va;//与setRealAge不同，当参数里没有与成员变量同名的变量时，可以不用this.；来指定virtualAge，而省略成virtualAge。
	}
}
