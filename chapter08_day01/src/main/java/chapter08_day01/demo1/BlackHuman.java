package chapter08_day01.demo1;

public class BlackHuman implements Human {

	@Override
	public void getColor() {
		System.out.println("the skin is black");
	}

	@Override
	public void talk() {
		System.out.println("black human talk...");
	}

}
