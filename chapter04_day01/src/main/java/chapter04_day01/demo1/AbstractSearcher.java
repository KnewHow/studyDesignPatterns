package chapter04_day01.demo1;

public abstract class AbstractSearcher {
	protected PettyGirl pettyGirl;

	public AbstractSearcher(PettyGirl pettyGirl) {
		super();
		this.pettyGirl = pettyGirl;
	}
	public abstract void show();
}
