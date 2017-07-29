package chapter26_day01.demo.states;

import chapter26_day01.demo.Context;

public class ClosingState extends LiftState {

	@Override
	public void open() {
		super.context.setLiftState(Context.OPENNING_STATE);
		super.context.open();
	}

	@Override
	public void close() {
		System.out.println("lift door close...");
	}

	@Override
	public void run() {
		super.context.setLiftState(Context.RUNNING_STATE);
		super.context.run();
	}

	@Override
	public void stop() {
		super.context.setLiftState(Context.STOPPING_STATE);
		super.context.stop();
	}

}
