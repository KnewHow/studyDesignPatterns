package chapter17_day01.demo;

/**
 * A concrete class for decorator
 * 
 * @author ygh Jul 24, 2017
 */
public class ConcreteDecorator2 extends Decorator {

	public ConcreteDecorator2(Component component) {
		super(component);
	}

	/**
	 * Decoration method
	 */
	public void method1() {
		System.out.println("decoration method2");
	}

	@Override
	public void operate() {
		method1();
		super.operate();
	}

}
