package chapter16_day01.responsibilityChain.handler;

import chapter16_day01.responsibilityChain.woman.WomenInterface;

public class Father extends Handler {

	public Father() {
		super(Handler.FATHER_LEVEL_REQUEST);
	}

	@Override
	public void response(WomenInterface women) {
		System.out.println("----女儿向父亲请示----");
		System.out.println(women.getRequest());
		System.out.println("父亲的回答是:同意");
	}

}
