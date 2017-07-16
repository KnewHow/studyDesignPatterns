package chapter07_day01.demo1;

public class Emperor {

	private static final Emperor emperor = new Emperor();

	private Emperor() {
	}

	public static Emperor getInstance() {
		return emperor;
	}

	public void say() {
		System.out.println("I am a emperor");
	}

}
