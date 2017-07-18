package chapter11_day01.builderPattern;

import java.util.ArrayList;
import java.util.List;

public class Client1 {
	public static void main(String[] args) {
		List<String> sequence = new ArrayList<>();
		sequence.add("engine boom");
		sequence.add("start");
		sequence.add("alarm");
		sequence.add("stop");
		
		BenzCarBuiler benzCarBuiler = new BenzCarBuiler();
		BMWCarBuiler bwmCarBuiler = new BMWCarBuiler();
		
		benzCarBuiler.setSequence(sequence);
		bwmCarBuiler.setSequence(sequence);
		
		benzCarBuiler.getCarModel().run();
		bwmCarBuiler.getCarModel().run();
	}
}
