package chapter10_day01.extension;

public class HummerH2Model extends HummerModel {

	private boolean isAlarm = false;

	@Override
	protected void start() {

	}

	@Override
	protected void stop() {

	}

	@Override
	protected void alarm() {
		System.out.println("H2 alarm...");
	}

	@Override
	protected void enginBoom() {

	}

	@Override
	protected boolean isAlarm() {
		return this.isAlarm;
	}

	@Override
	public void setAlarm(boolean isAlarm) {
		this.isAlarm = isAlarm;
	}

}
