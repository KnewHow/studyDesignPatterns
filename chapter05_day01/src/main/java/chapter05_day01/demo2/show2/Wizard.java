package chapter05_day01.demo2.show2;

import java.util.Random;

public class Wizard {
	private Random random = new Random(System.currentTimeMillis());

	/**
	 * Some method which don't provide others should set private
	 * 
	 * @return
	 */
	private int first() {
		System.out.println("execute first method");
		return random.nextInt(100);
	}

	private int second() {
		System.out.println("execute second method");
		return random.nextInt(100);
	}

	private int third() {
		System.out.println("execute third method");
		return random.nextInt(100);
	}

	/**
	 * A soft ware install should put install method into its inner,don
	 * 
	 * @return
	 */
	public boolean installWizard() {
		if (this.first() > 50) {
			if (this.second() > 50) {
				if (this.third() > 50) {
					return true;
				}
			}
		}
		return false;
	}

}
