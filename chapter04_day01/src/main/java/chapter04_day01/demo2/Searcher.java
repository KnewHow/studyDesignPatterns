package chapter04_day01.demo2;

public class Searcher extends AbstractSearcher {

	public Searcher(PerfectGirl pettyGirl) {
		super(pettyGirl);
	}

	@Override
	public void show() {
		System.out.println("petty girl information following");
		super.pettyGirl.goodLooking();
		super.pettyGirl.niceFigure();
		super.pettyGirl.greateTemperament();
	}

}
