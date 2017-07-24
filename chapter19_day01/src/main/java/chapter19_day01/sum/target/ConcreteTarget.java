package chapter19_day01.sum.target;

public class ConcreteTarget implements Target{

	@Override
	public void request() {
		System.out.println("inner design");
	}

}
