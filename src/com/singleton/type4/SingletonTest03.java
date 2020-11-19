package com.singleton.type4;

//单例模式（线程安全懒汉式，同步方法）但效率太低，不推荐使用
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
	
	//提供一个静态的公共方法，加入同步处理的代码，解决线程安全问题
	//即懒汉式
	public static synchronized Singleton getInstance() {
		if(instance==null) {
			instance=new Singleton();
		}
		return instance;
	}
	/*
	 * public static Singleton getInstances() {
	 * 		 if(instance==null) {
	 * 			synchronized (Singleton.class) { 
	 * 				instance=new Singleton();
	 *  		}
	 * 		}
	 * 		 return instance;
	 *  }
	 * 
	 * 这种同步代码块的方式连线程安全的问题都不能解决
	 */
}