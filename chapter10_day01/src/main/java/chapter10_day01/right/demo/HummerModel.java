package chapter10_day01.right.demo;

/**
 * A abstract method for hummer,but we let run method implement in abstract
 * class
 * 
 * @author ygh Jul 18, 2017
 */
public abstract class HummerModel {

	public abstract void start();

	public abstract void stop();

	public abstract void alarm();

	public abstract void enginBoom();

	public void run() {
		this.start();
		this.enginBoom();
		this.alarm();
		this.stop();
	}
}
