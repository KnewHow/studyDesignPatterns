package chapter09_day01.demo1;

public abstract class AbstractWhiteHuman implements Human {

	@Override
	public void getColor() {
		System.out.println("the skin is white");
	}

	@Override
	public void talk() {
		System.out.println("white human talk...");
	}

}
