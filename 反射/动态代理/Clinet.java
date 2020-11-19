package 反射.动态代理;

public class Clinet {
	public static void main(String[] args) {
		
		MyInvocationHandler handler=new MyInvocationHandler();
		B b = (B) handler.bind(new A());
		b.say();
	}
}
