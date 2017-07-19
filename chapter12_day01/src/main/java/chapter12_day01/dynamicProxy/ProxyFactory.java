package chapter12_day01.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class ProxyFactory {

	private ClassLoader classLoader;

	private Class<?>[] interfaces;

	private InvocationHandler h;
	
	

	public ProxyFactory(ClassLoader classLoader, Class<?>[] interfaces, InvocationHandler h) {
		super();
		this.classLoader = classLoader;
		this.interfaces = interfaces;
		this.h = h;
	}



	public Object getProxyObject() {
		return Proxy.newProxyInstance(this.classLoader, this.interfaces, this.h);
	}
}
