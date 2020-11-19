package com.singleton.type3;

//单例模式（线程不安全懒汉式）
public class SingletonTest03 {
	public static void main(String[] args) {
		//测试
		Singleton instance = Singleton.getInstance();
		Singleton instance2 = Singleton.getInstance();
		System.out.println("instance: "+instance.hashCode());
		System.out.println("instance2: "+instance2.hashCode());
		System.out.println(instance==instance2);
	}
}

class Singleton {
	private static Singleton instance;
	private Singleton() {
		
	}
	
	//提供一个静态的公共方法，当使用到该方法时，才会创建instance
	//即懒汉式
	public static Singleton getInstance() {
		if(instance==null) {
			instance=new Singleton();
		}
		return instance;
	}
}