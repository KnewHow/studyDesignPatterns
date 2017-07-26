package chapter20_day01.sum;

import java.util.Vector;

public class ConcreteIterator implements Iterator {

	private Vector<?> vector = null;

	private int currentIndex = 0;

	public ConcreteIterator(Vector<?> vector) {
		super();
		this.vector = vector;
	}

	@Override
	public Object next() {
		return this.vector.get(currentIndex++);
	}

	@Override
	public boolean hasNext() {
		return !(this.currentIndex == this.vector.size());
	}

	@Override
	public boolean remove() {
		return false;
	}

}
