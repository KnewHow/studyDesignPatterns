package chapter26_day01.demo;

import chapter26_day01.demo.states.OpenningState;

public class Client {
	public static void main(String[] args) {
		Context context = new Context();

		context.setLiftState(new OpenningState());

		context.open();
		context.close();
		context.run();
		context.stop();
	}
}
