package chapter13_day01.prototype.notexecuteConstructor;

public class Thing implements Cloneable {

	public Thing() {
		super();
		System.out.println("thing class constructor execute");
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}
