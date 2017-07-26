package chapter22_day01.demo2;

public class HanFeiZi implements IHanFeiZi {

	private LiSi liSi = new LiSi();

	@Override
	public void havaBreakFast() {
		System.out.println("Han Feizi is having breakfase");
		liSi.update("breakfast");
	}

	@Override
	public void havaFun() {
		System.out.println("Han Feizi is having fun");
		liSi.update("fun");
	}

}
