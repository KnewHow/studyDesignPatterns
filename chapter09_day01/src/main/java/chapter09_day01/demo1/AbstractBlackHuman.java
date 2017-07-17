package chapter09_day01.demo1;

public abstract class AbstractBlackHuman implements Human {

	@Override
	public void getColor() {
		System.out.println("the skin is black");
	}

	@Override
	public void talk() {
		System.out.println("black human talk...");
	}

}
