package chapter11_day01.builderPattern;

public class BMWModel extends CarModel {

	@Override
	protected void start() {
		System.out.println("BMW start...");

	}

	@Override
	protected void stop() {
		System.out.println("BMW stop...");

	}

	@Override
	protected void alarm() {
		System.out.println("BMW alarm...");

	}

	@Override
	protected void enginBoom() {
		System.out.println("BMW engine boom");
	}

}
