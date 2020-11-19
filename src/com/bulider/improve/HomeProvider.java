package com.bulider.improve;


//售楼处类
public class HomeProvider {
	
	//售楼处将用户需求交给建造者，由建造者区创建房屋对象
	public static MyHome commandBuilder(String level) {
		HomeBuilder homeBuilder=new HomeBuilder();
		return homeBuilder
				.planningBathroom(level+"浴室")
				.planningDoor(level+"门")
				.planningKitchan(level+"厨房")
				//.planningStudy(level+"书房")
				.planningToilet(level+"厕所")
				.build();
	}
}
