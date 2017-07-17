package chapter08_day01.sum;

/**
 * A abstract class for creator
 * 
 * @author ygh Jul 17, 2017
 */
public abstract class Creator {
	/**
	 * A abstract method for create product,sub classes can implement to create
	 * products.
	 * 
	 * @param c
	 *            A class type for product
	 * @return A new instance for class
	 */
	public abstract <T extends Product> T createProduct(Class<T> c);
}
