package com.singleton.type5;

//单例模式（双重检查）即解决了线程安全问题也解决了效率问题，推荐使用
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
	//加入volatile防止指令重排，使值可以共享
	private  static volatile Singleton instance;
	private Singleton() {
		
	}
	
	//提供一个静态的公共方法，加入双重检查代码，解决线程安全问题，同时解决懒加载问题
	
	public static Singleton getInstance() {
		if(instance==null) {
			synchronized (Singleton.class) {
				if(instance==null) {
					instance=new Singleton();
				}
			}
		}
		return instance;
	}
	
}