package chapter16_day01.responsibilityChain.handler;

import chapter16_day01.responsibilityChain.woman.WomenInterface;

public class Husband extends Handler {

	public Husband() {
		super(Handler.HUSBAND_LEVEL_REQUEST);
	}

	@Override
	public void response(WomenInterface women) {
		System.out.println("----女儿向丈夫请示----");
		System.out.println(women.getRequest());
		System.out.println("丈夫的回答是:同意");
	}

}
