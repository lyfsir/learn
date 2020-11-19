package com.singleton.type7;

//单例模式（枚举），推荐使用
//不仅能避免多线程同步问题，而且还能防止反序列化重新创建新的对象
public class SingletonTest03 {
	public static void main(String[] args) {
		Singleton instance = Singleton.INSTANCE;
		Singleton instance2 = Singleton.INSTANCE;
		System.out.println("instance: "+instance.hashCode());
		System.out.println("instance2: "+instance2.hashCode());
		System.out.println(instance==instance2);
		
		//也可以使用里面的方法
		instance.sayok();
	}
}

enum Singleton{
	INSTANCE;//属性
	public void sayok() {
		System.out.println("枚举实现单例");
	}
}