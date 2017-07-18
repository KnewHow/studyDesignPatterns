package chapter11_day01.preparation;

import java.util.ArrayList;
import java.util.List;

public class Client {
	public static void main(String[] args) {
		List<String> sequence = new ArrayList<>();
		sequence.add("engine boom");
		sequence.add("start");
		sequence.add("alarm");
		sequence.add("stop");

		CarModel benz = new BenzModel();
		benz.setSequence(sequence);
		benz.run();

		CarModel bmw = new BMWModel();
		bmw.setSequence(sequence);
		bmw.run();
	}
}
