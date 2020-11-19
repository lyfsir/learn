package com.prototype;

//传统方式克隆对象
public class Client {

	public static void main(String[] args) {
		Sheep sheep = new Sheep("羊",2,"白色");
		Sheep sheep2 = new Sheep(sheep.getName(),sheep.getAge(),sheep.getColor());
		Sheep sheep3 = new Sheep(sheep.getName(),sheep.getAge(),sheep.getColor());
		Sheep sheep4 = new Sheep(sheep.getName(),sheep.getAge(),sheep.getColor());
		System.out.println("sheep : " +sheep);
		System.out.println("sheep2 : " +sheep2);
		System.out.println("sheep3 : " +sheep3);
		System.out.println("sheep4 : " +sheep4);
		
		System.out.println(sheep==sheep2);
	}

}
