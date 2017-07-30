package chapter29_day01.sum;

public abstract class Abstraction {
	private Implementor implementor;

	public Abstraction(Implementor implementor) {
		super();
		this.implementor = implementor;
	}
	
	public void request(){
		this.implementor.doSomething();
	}

	public Implementor getImplementor() {
		return implementor;
	}

	public void setImplementor(Implementor implementor) {
		this.implementor = implementor;
	}
	
	
}
