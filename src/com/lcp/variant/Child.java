package com.lcp.variant;

public class Child extends Father{
	   private static int mem;
	   public Child() {
	       System.out.println("����汾���캯��");
	       System.out.println("�����mem��ʼֵ"+mem);
	       this.mem=2;
	   }
	   public void Out() {
	      System.out.println("������������������"+this.mem);
	  }
	
	 
	public  static void main(String []args){
	        Father f=new Child();
	        Child c=new Child();
	        f.Out();
	        c.Out();
	}
}
