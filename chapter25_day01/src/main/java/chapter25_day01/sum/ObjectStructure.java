package chapter25_day01.sum;

import java.util.Random;

public class ObjectStructure {
	public static Element createElement() {
		Random random = new Random();
		if (random.nextInt(100) > 50) {
			return new ConcreteElement1();
		} else {
			return new ConcreteElement2();
		}
	}
}
