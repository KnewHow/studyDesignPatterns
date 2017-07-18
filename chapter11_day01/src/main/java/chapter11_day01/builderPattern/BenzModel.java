package chapter11_day01.builderPattern;

public class BenzModel extends CarModel {

	@Override
	protected void start() {
		System.out.println("benz start...");

	}

	@Override
	protected void stop() {
		System.out.println("benz stop...");

	}

	@Override
	protected void alarm() {
		System.out.println("benz alarm...");

	}

	@Override
	protected void enginBoom() {
		System.out.println("benz engine boom");
	}

}
