package chapter26_day01.demo.states;

import chapter26_day01.demo.Context;

/**
 * A abstract class of lift
 * 
 * @author ygh Jul 29, 2017
 */
public abstract class LiftState {
	/**
	 * Environment transform variable
	 */
	protected Context context;


	public void setContext(Context context) {
		this.context = context;
	}

	/**
	 * Lift open method
	 */
	public abstract void open();

	/**
	 * lift close method
	 */
	public abstract void close();

	/**
	 * lift run method
	 */
	public abstract void run();

	/**
	 * lift stop method
	 */
	public abstract void stop();
}
