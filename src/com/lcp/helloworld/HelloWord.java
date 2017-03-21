package com.lcp.helloworld;

public class HelloWord {

	public static void main(String[] args) {
	    touch.tiaoxi();
	    message.geton();
	    message.getoff();
	}
	
	public static class touch{
		public static void tiaoxi(){
			System.out.println("hi,i am xiaotang");
			System.out.println("hi xiaotang,i am xiao pingzi");
		}
	}
	
	public static class message extends touch{
		public static  void geton(){
			String x="hi,i am get on the subway,time is 08:15am";
			System.out.println("when get on the subway,nanshen will send me a message:"+x);
		}
		public static void getoff(){
			System.out.println("hi,i am get off the subway,time is 08:55am");
		}
	}

	//这行是我加的
	
	@Override
	public String toString(){
		return super.toString()+"@override";
	}

	//我
	//说
	//你
	//好
	//聪
	//明
}
	
	
	
	
	