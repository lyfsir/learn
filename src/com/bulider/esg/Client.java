package com.bulider.esg;

public class Client {
	public static void main(String[] args) {
		Builder builder=new WelcomeBuilder();
		Director director=new Director(builder);
		director.construct("123@abc.com", "456@dfg.com");
		
		System.out.println("---------------------------------");
		
		Builder builder2=new GoodbyeBuilder();
		Director director2=new Director(builder2);
		director2.construct("222", "546");
	}
}
