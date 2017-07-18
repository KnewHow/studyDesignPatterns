package chapter10_day01.error.demo;

public class HummerH1Model extends HummerModel {

	@Override
	public void start() {

	}

	@Override
	public void stop() {

	}

	@Override
	public void alarm() {

	}

	@Override
	public void enginBoom() {

	}

	@Override
	public void run() {
		System.out.println("H1 run...");
		this.start();
		this.enginBoom();
		this.alarm();
		this.stop();
	}

}
