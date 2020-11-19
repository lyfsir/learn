package com.factory.simplefactory;

import com.factory.simplefactory.plant.Flower;
import com.factory.simplefactory.plant.Grass;
import com.factory.simplefactory.plant.IPlant;
import com.factory.simplefactory.plant.Tree;

public class PlantFactory {
	public static IPlant createPlant(String type) {
		IPlant iPlant=null;
		switch (type) {
			case "花":
				iPlant=new Flower();
				break;
			case "草":
				iPlant=new Grass();
				break;
			case "树":
				iPlant=new Tree();
				break;
			default:
				System.out.println("类型未定义");
		}
		return iPlant;
	}
}
