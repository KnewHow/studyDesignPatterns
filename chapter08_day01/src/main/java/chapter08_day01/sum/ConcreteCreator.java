package chapter08_day01.sum;

public class ConcreteCreator extends Creator {

	@Override
	public <T extends Product> T createProduct(Class<T> c) {
		T product = null;
		try {
			product = c.newInstance();
		} catch (InstantiationException | IllegalAccessException e) {
			System.out.println("create product error...");
			e.printStackTrace();
		}
		return product;
	}

}
