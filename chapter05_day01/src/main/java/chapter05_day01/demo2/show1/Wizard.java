package chapter05_day01.demo2.show1;

import java.util.Random;

public class Wizard {
	private Random random = new Random(System.currentTimeMillis());

	public int first() {
		System.out.println("execute first method");
		return random.nextInt(100);
	}

	public int second() {
		System.out.println("execute second method");
		return random.nextInt(100);
	}

	public int third() {
		System.out.println("execute third method");
		return random.nextInt(100);
	}

}
