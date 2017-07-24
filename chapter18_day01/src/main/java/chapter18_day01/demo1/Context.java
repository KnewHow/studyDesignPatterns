package chapter18_day01.demo1;

/**
 * A class to encapsulate all algorithms
 * 
 * @author ygh Jul 24, 2017
 */
public class Context {
	private Strategy strategy = null;

	public Context(Strategy strategy) {
		super();
		this.strategy = strategy;
	}

	public Strategy getStrategy() {
		return strategy;
	}

	public void setStrategy(Strategy strategy) {
		this.strategy = strategy;
	}

	public void operate() {
		this.strategy.operate();
	}
}
