package chapter08_day01.demo1;

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
