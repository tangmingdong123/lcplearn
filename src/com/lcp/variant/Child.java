package com.lcp.variant;

public class Child extends Father{
	   private static int mem;
	   public Child() {
	       System.out.println("子类版本构造函数");
	       System.out.println("子类的mem初始值"+mem);
	       this.mem=2;
	       System.out.println("子类的mem最终值"+mem);
	   }
	   public void Cg() {
	       this.mem=6;
	        System.out.println("子类的Cg方法"+mem);
	   }	 
	public  static void main(String []args){
	        Father f=new Child();
	        System.out.println("****************");
	        Child c=new Child();
	        f.Cg();
	}
}