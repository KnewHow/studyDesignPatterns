package chapter10_day01.extension;

/**
 * A abstract class for Hummer,but alarm method is controlled by sub-class,how
 * to implement it.
 * 
 * @author ygh Jul 18, 2017
 */
public abstract class HummerModel {
	protected abstract void start();

	protected abstract void stop();

	protected abstract void alarm();

	protected abstract void enginBoom();

	public abstract void setAlarm(boolean isAlarm);

	protected boolean isAlarm() {
		return true;
	}


	public void run() {
		this.start();
		this.enginBoom();
		if (isAlarm()) {
			this.alarm();
		}
		this.stop();
	}

}
