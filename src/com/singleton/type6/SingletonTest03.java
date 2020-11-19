package com.singleton.type6;

//单例模式（静态内部类）即解决了线程安全问题也解决了效率问题和懒加载，推荐使用
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
	
	private Singleton() {
		
	}
	//写一个静态内部类，该类中有一个静态属性Singleton
	private static class SingletonInstance{
		private static final Singleton INSTANCE=new Singleton();
	}
	
	//提供一个静态的公共方法，直接返回SingletonInstanc.INSTANCE
	
	public static Singleton getInstance() {
		return SingletonInstance.INSTANCE;
	}
	
}