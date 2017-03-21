package com.lcp.helloworld;

public class HelloWord {

	public static void main(String[] args) {
	    call.tiaoxi();
	    subway.geton();
	    subway.getoff();
	}
	
	public static class call{
		public static void tiaoxi(){
			System.out.println("hi,i am xiaotang");
			System.out.println("hi xiaotang,i am xiao pingzi");
		}
	}
	
	public static class subway{
		public static void geton(){
			System.out.println("hi,i am get on the subway,time is 08:15am");
		}
		public static void getoff(){
			System.out.println("hi,i am get off the subway,time is 08:55am");
		}
	}

}
