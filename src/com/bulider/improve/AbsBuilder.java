package com.bulider.improve;

/*如果产品(属性)之间的差异性很大，则不适合使用建造者模式，比如：建房子，每个类别的房子都需要打地基，砌墙，盖顶；
发送邮件的不同内容和标题都需要发件人和收件人以及时间的属性都是一样的，只是发送的内容和标题不一样，这时候就适合使用此种模式*/


//建造者抽象类
public abstract class AbsBuilder<T> {
	
	//建造者建造后要返回的对象
	abstract T build();
	
	//相关操作
	abstract T planningDoor(String door);
	abstract T planningKitchan(String kitchen);
	abstract T planningToilet(String toilet);
	abstract T planningBathroom(String bathroom);
	abstract T planningStudy(String study);
	
}
