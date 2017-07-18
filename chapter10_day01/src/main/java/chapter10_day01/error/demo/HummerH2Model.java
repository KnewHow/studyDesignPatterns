package chapter10_day01.error.demo;

public class HummerH2Model extends HummerModel {

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
		System.out.println("H2 run...");
		this.start();
		this.enginBoom();
		this.alarm();
		this.stop();
	}

}
