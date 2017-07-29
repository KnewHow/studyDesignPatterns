package chapter26_day01.sum;

/**
 * A abstract class of state
 * 
 * @author ygh Jul 29, 2017
 */
public abstract class State {
	/**
	 * The environment context
	 */
	protected Context context;

	public void setContext(Context context) {
		this.context = context;
	}

	public abstract void handle1();

	public abstract void handle2();

}
