package chapter20_day01.sum;

import java.util.Vector;

public class ConcreteAggregate implements Aggregate {

	@SuppressWarnings("rawtypes")
	private Vector vector = new Vector<>();

	@SuppressWarnings("unchecked")
	@Override
	public void add(Object object) {
		this.vector.addElement(object);
	}

	@Override
	public Object remove() {
		return null;
	}

	@Override
	public Iterator iterator() {
		return new ConcreteIterator(vector);
	}

}
