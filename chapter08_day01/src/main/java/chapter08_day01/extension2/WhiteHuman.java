package chapter08_day01.extension2;

public class WhiteHuman implements Human {

	@Override
	public void getColor() {
		System.out.println("the skin is white");
	}

	@Override
	public void talk() {
		System.out.println("white human talk...");
	}

}
