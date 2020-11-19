package com.factory.simplefactory.client;

import com.factory.simplefactory.PlantFactory;

public class Client {
	public static void main(String[] args) {
		PlantFactory.createPlant("花");
		PlantFactory.createPlant("树");
		PlantFactory.createPlant("草");
		PlantFactory.createPlant("狗");
	}
}
