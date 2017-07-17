package chapter09_day01.demo2;

public class ProductCreator1 extends AbstractCreator {

	@Override
	public AbstractProductA createProductA() {
		return new ConcreteProductA1();
	}

	@Override
	public AbstractProductB createProductB() {
		return new ConcreteProductB1();
	}

}
