package chapter21_day01.sum.safePattern;

/**
 * Abstract all tree node public method
 * 
 * @author ygh Jul 26, 2017
 */
public abstract class Component {

	protected Component parent;

	public void doSomething() {
		System.out.println("do something");
	}

	public Component getParent() {
		return parent;
	}

	public void setParent(Component parent) {
		this.parent = parent;
	}
	
	
}
