package com.lcp.variant;

public class Child extends Father{
	   public Child() {
	       System.out.println("子类版本构造函数");
	   }
	   public  String c="child";
	   
	   public  static void main(String []args){
	        Father f=new Child();
	        Child c=new Child();
	        Child fc=(Child) f;
	        System.out.println(f.F);
	        System.out.println(fc.c);
	        System.out.println(c.F);
	        System.out.println(c.c);
	}
	}
