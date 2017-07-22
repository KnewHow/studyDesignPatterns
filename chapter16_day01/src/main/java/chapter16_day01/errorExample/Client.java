package chapter16_day01.errorExample;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import chapter16_day01.errorExample.handlers.Father;
import chapter16_day01.errorExample.handlers.Husband;
import chapter16_day01.errorExample.handlers.Son;
import chapter16_day01.errorExample.woman.Woman;
import chapter16_day01.errorExample.woman.WomenInterface;

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

		Father father = new Father();
		Husband husband = new Husband();
		Son son = new Son();

		for (WomenInterface women : womenList) {
			if (women.getStatus() == 1) {
				father.handleMessage(women);
			} else if (women.getStatus() == 2) {
				husband.handleMessage(women);
			} else if (women.getStatus() == 3) {
				son.handleMessage(women);
			} else {
			}
		}
	}
}
