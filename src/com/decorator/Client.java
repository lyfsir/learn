package com.decorator;

public class Client {

	public static void main(String[] args) {
		
		Drink order = new Espresso();
		System.out.println(order.cost());
		order = new Mink(order);
		System.out.println(order.cost());
		System.out.println(order.getDes());
	}
}
