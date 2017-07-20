package chapter13_day01.prototype.weighCopy;

import java.util.ArrayList;

public class Thing implements Cloneable {

	private ArrayList<String> list = new ArrayList<>();

	@SuppressWarnings("unchecked")
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Thing thing = (Thing) super.clone();
		this.list = (ArrayList<String>) this.list.clone();
		return thing;
	}

	public void setValue(String value) {
		this.list.add(value);
	}

	public ArrayList<String> getValue() {
		return this.list;
	}

}
