package com.bulider.improve;

//客户端
public class Client {
	public static void main(String[] args) {
	//	@SuppressWarnings("unused")
		MyHome myHome=HomeProvider.commandBuilder("高级");
		System.out.println(myHome);
	}
}
