package chapter16_day01.responsibilityChain.handler;

import chapter16_day01.responsibilityChain.woman.WomenInterface;

public class Son extends Handler {

	public Son() {
		super(Handler.SON_LEVEL_REQUEST);
	}

	@Override
	public void response(WomenInterface women) {
		System.out.println("----女儿向儿子请示----");
		System.out.println(women.getRequest());
		System.out.println("儿子的回答是:同意");
	}

}
