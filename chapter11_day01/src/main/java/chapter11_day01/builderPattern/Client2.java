package chapter11_day01.builderPattern;

public class Client2 {
	public static void main(String[] args) {
		Director director = new Director();
		BenzModel benzA = director.getBenzModelA();
		BenzModel benzB = director.getBenzModelB();

		BMWModel bmwA = director.getBMWModelA();
		BMWModel bmwB = director.getBMWModelB();

		benzA.run();
		benzB.run();
		bmwA.run();
		bmwB.run();
	}
}
