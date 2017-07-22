package chapter16_day01.errorExample.handlers;

import chapter16_day01.errorExample.woman.WomenInterface;

public class Father implements Handler {

	@Override
	public void handleMessage(WomenInterface women) {
		System.out.println("女儿的请求是:" + women.getRequest());
		System.out.println("父亲的答复是：同意");
	}

}
