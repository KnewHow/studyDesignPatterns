package chapter04_day01.demo2;

public abstract class AbstractSearcher {
	protected PerfectGirl pettyGirl;

	public AbstractSearcher(PerfectGirl pettyGirl) {
		super();
		this.pettyGirl = pettyGirl;
	}
	public abstract void show();
}
