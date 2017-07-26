package chapter21_day01.sum.transparent;

import java.util.List;


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
	
	public abstract void add(Component component);
	
	public abstract void remove(Component component);

	public abstract List<Component> getSubordinate();

	public Component getParent() {
		return parent;
	}

	public void setParent(Component parent) {
		this.parent = parent;
	}
	
	
}
