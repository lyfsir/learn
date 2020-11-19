package com.singleton.type1;
//饿汉式是单线程使用
//单例模式（静态常量饿汉式）线程安全，但会造成内存的浪费
public class SingletonTest01 {
	public static void main(String[] args) {
		//测试
		Singleton instance = Singleton.getInstance();
		Singleton instance2 = Singleton.getInstance();
		System.out.println("instance: "+instance.hashCode());
		System.out.println("instance2: "+instance2.hashCode());
		System.out.println(instance==instance2);
	}
}

class Singleton{
	
	//构造器私有化
	private Singleton(){
		
	}
	//本类内部创建对象实例
	private final static Singleton instance=new Singleton();
	//提供一个公有的静态方法，返回实例对象
	public static Singleton getInstance() {
		return instance;
	}
}