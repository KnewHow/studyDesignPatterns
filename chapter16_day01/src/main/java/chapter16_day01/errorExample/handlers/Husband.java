package chapter16_day01.errorExample.handlers;

import chapter16_day01.errorExample.woman.WomenInterface;

public class Husband implements Handler {

	@Override
	public void handleMessage(WomenInterface women) {
		System.out.println("妻子的请求是:" + women.getRequest());
		System.out.println("丈夫的答复是：同意");
	}

}
