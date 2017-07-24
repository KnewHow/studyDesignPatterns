package chapter19_day01.sum;

import chapter19_day01.sum.source.Source;
import chapter19_day01.sum.target.Target;

public class Adapter extends Source implements Target {

	@Override
	public void request() {
		super.doSomething();
	}

}
