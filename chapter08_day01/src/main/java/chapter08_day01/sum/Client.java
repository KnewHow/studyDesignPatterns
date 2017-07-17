package chapter08_day01.sum;

/**
 * Just a client
 * 
 * @author ygh Jul 17, 2017
 */
public class Client {
	public static void main(String[] args) {
		ConcreteCreator creator = new ConcreteCreator();

		Product product1 = creator.createProduct(ConcreteProduct1.class);

		product1.method2();
	}
}
