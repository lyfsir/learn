package com.prototype.improve;

//原型模式
//需实现Cloneable，此类才具有克隆能力
public class Sheep implements Cloneable{
	private String name;
	private int age;
	private String color;
	public Sheep(String name,int age,String color) {
		super();
		this.name=name;
		this.age=age;
		this.color=color;
	}
	
	
	//不改的clone方法可以克隆基本数据类型和String
	//重写clone方法
	@Override
	protected Object clone()  {
		// TODO Auto-generated method stub
		Sheep sheep=null;
		try {
			sheep=(Sheep) super.clone();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	
		return sheep;
	}
	
	@Override
	public String toString() {
		return "Sheep [name=" + name + ", age=" + age + ", color=" + color + "]";
	}
	
}
