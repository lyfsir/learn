package com.bulider.improve;


//具体实现的建造者，核心类
public class HomeBuilder extends AbsBuilder{
	
	private MyHome myHome=new MyHome();

	@Override
	MyHome build() {
		// TODO Auto-generated method stub
		return myHome;
	}

	@Override
	HomeBuilder planningDoor(String door) {
		// TODO Auto-generated method stub
		myHome.setmDoor(door);
		return this;
	}

	@Override
	HomeBuilder planningKitchan(String kitchen) {
		// TODO Auto-generated method stub
		myHome.setmKitchen(kitchen);
		return this;
	}

	@Override
	HomeBuilder planningToilet(String toilet) {
		// TODO Auto-generated method stub
		myHome.setmToilet(toilet);
		return this;
	}

	@Override
	HomeBuilder planningBathroom(String bathroom) {
		// TODO Auto-generated method stub
		myHome.setmBathroom(bathroom);
		return this;
	}

	@Override
	HomeBuilder planningStudy(String study) {
		// TODO Auto-generated method stub
		myHome.setmStudy(study);
		return this;
	}


}
