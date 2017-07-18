package chapter10_day01.sum;

/**
 * A abstract class
 * 
 * @author ygh Jul 18, 2017
 */
public abstract class AbstractClass {
	protected abstract void doSomething();

	protected abstract void doAnything();

	/**
	 * template method
	 */
	public void templateMethod() {
		this.doSomething();
		this.doAnything();
	}
}
