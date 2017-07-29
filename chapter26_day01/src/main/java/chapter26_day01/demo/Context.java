package chapter26_day01.demo;

import chapter26_day01.demo.states.ClosingState;
import chapter26_day01.demo.states.LiftState;
import chapter26_day01.demo.states.OpenningState;
import chapter26_day01.demo.states.RunningState;
import chapter26_day01.demo.states.StoppingState;

public class Context {
	public final static OpenningState OPENNING_STATE = new OpenningState();

	public final static ClosingState CLOSING_STATE = new ClosingState();

	public final static RunningState RUNNING_STATE = new RunningState();

	public final static StoppingState STOPPING_STATE = new StoppingState();

	private LiftState liftState;

	public LiftState getLiftState() {
		return liftState;
	}

	public void setLiftState(LiftState liftState) {
		this.liftState = liftState;
		this.liftState.setContext(this);
	}

	public void open() {
		this.liftState.open();
	}

	public void close() {
		this.liftState.close();
	}

	public void run() {
		this.liftState.run();
	}

	public void stop() {
		this.liftState.stop();
	}

}
