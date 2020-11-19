package com.singleton.type2;

//单例模式（静态代码块饿汉式）
public class SingletonTest02 {
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
	private  static Singleton instance;
	//使用静态代码块实例化本类对象
	static{
		instance=new Singleton();
	}
	//提供一个公有的静态方法，返回实例对象
	public static Singleton getInstance() {
		return instance;
	}
}