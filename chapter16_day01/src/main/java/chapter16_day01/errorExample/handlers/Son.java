package chapter16_day01.errorExample.handlers;

import chapter16_day01.errorExample.woman.WomenInterface;

public class Son implements Handler {

	@Override
	public void handleMessage(WomenInterface women) {
		System.out.println("母亲的请求是:" + women.getRequest());
		System.out.println("儿子的答复是：同意");
	}

}
