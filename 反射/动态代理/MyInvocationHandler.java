package 反射.动态代理;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

//代理类（需实现InvocationHandler接口，来实现具体的代理操作）
public class MyInvocationHandler implements InvocationHandler{
	
	private Object obj;
	
	//此方法是需要新建用来接收对象的方法，在这个方法中，接收这个对象，实现这个对象实现的接口。
	//接收传来的对象，对象实现什么接口，返回的代理就实现什么接口
	public Object bind(Object obj) {
		this.obj=obj;
		return Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(), this);
	}
	
	//是实现这个invocationhandler接口需要实现的invoke方法，在这个方法中实现你需要在你的程序调用前后进行的事情
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("i love you");//在这里你可以写一些自己想做的事情
		Object invoke = method.invoke(this.obj, args);//这句是用来调用原本的程序、原本的方法
		System.out.println("i love too");//同样，在这里你可以写一些代码，它会在你的原本的方法实现后实现
		return invoke;
	}

}
