package chapter22_day01.demo1;

public class Spy extends Thread {

	/**
	 * The observer
	 */
	private LiSi liSi;

	/**
	 * The observable
	 */
	private HanFeiZi hangFeiZi;

	/**
	 * The type need to be observed
	 */
	private String type;

	public Spy(LiSi liSi, HanFeiZi hangFeiZi, String type) {
		super();
		this.liSi = liSi;
		this.hangFeiZi = hangFeiZi;
		this.type = type;
	}

	@Override
	public void run() {
		while (true) {
			if (this.type.equals("breakfast")) {
				if (this.hangFeiZi.isHavingBreakfast()) {
					this.liSi.update("breakfast");
					this.hangFeiZi.setHavingBreakfast(false);
				}
			} else {
				if (this.hangFeiZi.isHavingFun()) {
					this.liSi.update("have fun");
					this.hangFeiZi.setHavingFun(false);
				}
			}
		}
	}

}
