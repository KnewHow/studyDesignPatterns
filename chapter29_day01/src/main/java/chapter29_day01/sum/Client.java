package chapter29_day01.sum;

public class Client {
	public static void main(String[] args) {
		Implementor implementor1 = new ConcreteImplementor1();
		Implementor implementor2 = new ConcreteImplementor1();
		RefineAbstraction abstraction1 = new RefineAbstraction(implementor1);
		abstraction1.request();
		abstraction1.setImplementor(implementor2);
		abstraction1.request();

	}
}
