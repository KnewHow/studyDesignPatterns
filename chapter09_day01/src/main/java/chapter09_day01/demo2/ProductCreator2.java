package chapter09_day01.demo2;

public class ProductCreator2 extends AbstractCreator {

	@Override
	public AbstractProductA createProductA() {
		return new ConcreteProductA2();
	}

	@Override
	public AbstractProductB createProductB() {
		return new ConcreteProductB2();
	}

}
