package 反射.动态代理;

import java.util.Collections;

//被代理类（要在实现接口的前提下）
public class A implements B{

	@Override
	public void say() {
		System.out.println("实现动态代理");
		
	}

}
