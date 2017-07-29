package chapter25_day01.sum;

/**
 * A element abstract class
 * @author ygh
 * Jul 29, 2017
 */
public abstract class Element {
	public abstract void doSomething();
	
	public abstract void accept(IVisitor visitor);
}
