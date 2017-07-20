package chapter13_day01.prototype.slightCopy;

import java.util.ArrayList;

public class Thing implements Cloneable {

	private ArrayList<String> list = new ArrayList<>();

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public void setValue(String value) {
		this.list.add(value);
	}

	public ArrayList<String> getValue() {
		return this.list;
	}

}
