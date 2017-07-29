package chapter26_day01.demo.states;

import chapter26_day01.demo.Context;

public class OpenningState extends LiftState {

	@Override
	public void open() {
		System.out.println("lift door open...");
	}

	@Override
	public void close() {
		super.context.setLiftState(Context.CLOSING_STATE);
		super.context.close();
	}

	@Override
	public void run() {

	}

	@Override
	public void stop() {
		
	}

}
