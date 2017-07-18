package chapter11_day01.builderPattern;

import java.util.List;

/**
 * A abstract class for car model,users can set the sequence of car
 * 
 * @author ygh Jul 18, 2017
 */
public abstract class CarModel {

	private List<String> sequence;

	protected abstract void start();

	protected abstract void stop();

	protected abstract void alarm();

	protected abstract void enginBoom();

	public void run() {
		for (String str : sequence) {
			if (str.equalsIgnoreCase("start")) {
				this.start();
			} else if (str.equalsIgnoreCase("stop")) {
				this.stop();
			} else if (str.equalsIgnoreCase("alarm")) {
				this.alarm();
			} else if (str.equalsIgnoreCase("engine boom")) {
				this.enginBoom();
			}
		}
	}

	public void setSequence(List<String> sequence) {
		this.sequence = sequence;
	}

}
