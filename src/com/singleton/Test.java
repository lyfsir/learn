package com.singleton;

//JDK中的Runtime类就用到了单例模式的饿汉式
public class Test {
	public static void main(String[] args) {
		System.out.println(Runtime.getRuntime());
		
	}
}
