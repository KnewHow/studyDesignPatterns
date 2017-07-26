package chapter22_day01.demo1;

public class HanFeiZi implements IHanFeiZi {
	/**
	 * you must add volatile key
	 */
	private volatile boolean isHavingBreakfast = false;
	private volatile boolean isHavingFun = false;

	@Override
	public void havaBreakFast() {
		System.out.println("Han Feizi is having breakfase");
		this.isHavingBreakfast = true;
	}

	@Override
	public void havaFun() {
		System.out.println("Han Feizi is having fun");
		this.isHavingFun = true;
	}

	public boolean isHavingBreakfast() {
		return isHavingBreakfast;
	}

	public void setHavingBreakfast(boolean isHavingBreakfast) {
		this.isHavingBreakfast = isHavingBreakfast;
	}

	public boolean isHavingFun() {
		return isHavingFun;
	}

	public void setHavingFun(boolean isHavingFun) {
		this.isHavingFun = isHavingFun;
	}

}
