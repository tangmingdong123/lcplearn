package com.lcp.variant;

public class Child extends Father{
	   private static int mem;
	   public Child() {
	       System.out.println("子类版本构造函数");
	       System.out.println("子类的mem初始值"+mem);
	       this.mem=2;
	   }
	   public void Out() {
	      System.out.println("这里是子类的输出方法"+this.mem);
	  }
	
	 
	public  static void main(String []args){
	        Father f=new Child();
	        Child c=new Child();
	        f.Out();
	        c.Out();
	}
}
