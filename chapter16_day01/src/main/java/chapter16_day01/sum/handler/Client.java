package chapter16_day01.sum.handler;

import chapter16_day01.sum.Request;

/**
 * Just emulate a practical scene
 * 
 * @author ygh Jul 22, 2017
 */
public class Client {
	public static void main(String[] args) {
		Request request = new Request();
		Handler handler1 = new ConcreteHandler1();
		Handler handler2 = new ConcreteHandler2();
		Handler handler3 = new ConcreteHandler3();
		handler1.setNextHandler(handler2);
		handler2.setNextHandler(handler3);
		handler1.handleMessage(request);
	}
}
