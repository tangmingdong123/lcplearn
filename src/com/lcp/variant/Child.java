package com.lcp.variant;

public class Child extends Father{
	   private static int mem;
	   public Child() {
	       System.out.println("����汾���캯��");
	       System.out.println("�����mem��ʼֵ"+mem);
	       this.mem=2;
	       System.out.println("�����mem����ֵ"+mem);
	   }
	   public void Cg() {
	       this.mem=6;
	        System.out.println("�����Cg����"+mem);
	   }	 
	public  static void main(String []args){
	        Father f=new Child();
	        System.out.println("****************");
	        Child c=new Child();
	        f.Cg();
	}
}