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
		public static  void geton(){
			String x="hi,i am get on the subway,time is 08:15am";
			System.out.println("when get on the subway,nanshen will send me a message:"+x);
		}
		public static void getoff(){
			System.out.println("hi,i am get off the subway,time is 08:55am");
		}
	}

}
