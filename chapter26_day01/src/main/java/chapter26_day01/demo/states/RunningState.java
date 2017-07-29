package chapter26_day01.demo.states;

import chapter26_day01.demo.Context;

public class RunningState extends LiftState {

	@Override
	public void open() {
	}

	@Override
	public void close() {

	}

	@Override
	public void run() {
		System.out.println("lift is running");
	}

	@Override
	public void stop() {
		super.context.setLiftState(Context.STOPPING_STATE);
		super.context.stop();
	}

}
