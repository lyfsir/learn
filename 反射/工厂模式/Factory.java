package 反射.工厂模式;

public class Factory {
	public static Fruit getInstance(String className) {
		Fruit fruit=null;
		try {
			fruit = (Fruit) Class.forName(className).newInstance();//使用反射生成类实例并返回此类实现的接口
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return fruit;
	}
}
