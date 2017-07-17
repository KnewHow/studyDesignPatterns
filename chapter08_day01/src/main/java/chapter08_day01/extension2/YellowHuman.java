package chapter08_day01.extension2;

public class YellowHuman implements Human {

	@Override
	public void getColor() {
		System.out.println("the skin is yellow");
	}

	@Override
	public void talk() {
		System.out.println("yellow human talk...");
	}

}
