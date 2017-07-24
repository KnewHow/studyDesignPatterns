package chapter17_day01.demo;

/**
 * Just emulate practical scene
 * 
 * @author ygh Jul 24, 2017
 */
public class Client {
	public static void main(String[] args) {
		Component component = new ConcreteComponent();
		component = new ConcreteDecorator1(component);
		component = new ConcreteDecorator2(component);
		component.operate();
	}
}
