package chapter29_day01.sum;

public class RefineAbstraction extends Abstraction {

	public RefineAbstraction(Implementor implementor) {
		super(implementor);
	}

	@Override
	public void request() {
		super.request();
		super.getImplementor().doAnything();
	}

}
