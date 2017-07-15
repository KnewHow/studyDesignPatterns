package chapter04_day01.demo2;

public class PerfectGirl implements GoodBodyGirl, GreatTemperamentGirl {

	@Override
	public void goodLooking() {
		System.out.println("the girl is goodlooking...");
	}

	@Override
	public void niceFigure() {
		System.out.println("the girl is nice figure...");
	}

	@Override
	public void greateTemperament() {
		System.out.println("the girl is greate temperation...");
	}

}
