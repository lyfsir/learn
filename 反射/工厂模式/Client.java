package 反射.工厂模式;

//这种利用反射的机制用在工程模式中，当我们需要添加Fruit的子类的时候就不需要去修改工厂类
public class Client {
	public static void main(String[] args) {
		Fruit fruit = Factory.getInstance("反射.工厂模式.Apple");
		if(fruit!=null) {
			fruit.eat();
		}
	}
}
