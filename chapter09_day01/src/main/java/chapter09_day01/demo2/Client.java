package chapter09_day01.demo2;

/**
 * In abstract factory we find if we add productA3 or productB3,we just need to
 * construct productA3 or productB3 class. But if we want to add productC,we
 * need to modify creator and concrete creator.So when use abstract factory
 * pattern,we need to consider which most enable add or change in the future.
 * 
 * @author ygh Jul 17, 2017
 */
public class Client {

	public static void main(String[] args) {
		ProductCreator1 c1 = new ProductCreator1();

		ProductCreator2 c2 = new ProductCreator2();

		AbstractProductA a1 = c1.createProductA();
		AbstractProductB b1 = c1.createProductB();

		AbstractProductA a2 = c2.createProductA();
		AbstractProductB b2 = c2.createProductB();
		a1.doSomething();
		b1.doSomething();
		a2.doSomething();
		b2.doSomething();

	}
}
