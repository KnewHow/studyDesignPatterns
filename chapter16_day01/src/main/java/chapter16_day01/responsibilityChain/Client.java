package chapter16_day01.responsibilityChain;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import chapter16_day01.responsibilityChain.handler.Father;
import chapter16_day01.responsibilityChain.handler.Handler;
import chapter16_day01.responsibilityChain.handler.Husband;
import chapter16_day01.responsibilityChain.handler.Son;
import chapter16_day01.responsibilityChain.woman.Woman;
import chapter16_day01.responsibilityChain.woman.WomenInterface;

/**
 * Just emulate a practical scene
 * 
 * @author ygh Jul 22, 2017
 */
public class Client {
	public static void main(String[] args) {
		List<WomenInterface> womenList = new ArrayList<>();
		Random random = new Random();
		for (int i = 0; i < 5; i++) {
			womenList.add(new Woman(random.nextInt(4), "我要去逛街"));
		}

		Handler faHandler = new Father();
		Handler hsHandler = new Husband();
		Handler soHandler = new Son();

		/**
		 * Build relation
		 */
		faHandler.setNextHandler(hsHandler);
		hsHandler.setNextHandler(soHandler);

		for (WomenInterface women : womenList) {
			faHandler.handleMessage(women);
		}

	}
}
