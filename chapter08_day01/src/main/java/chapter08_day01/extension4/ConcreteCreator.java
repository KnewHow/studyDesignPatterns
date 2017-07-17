package chapter08_day01.extension4;

import java.util.HashMap;
import java.util.Map;

/**
 * Produce a cache by a map,which can reserve those objects reusable
 * 
 * @author ygh Jul 17, 2017
 */
public class ConcreteCreator extends Creator {

	Map<String, Product> map = new HashMap<>();

	@SuppressWarnings("unchecked")
	@Override
	public <T extends Product> T createProduct(Class<T> c) {
		T product = null;
		if (map.containsKey(c.getName())) {
			product = (T) map.get(c.getName());
		} else {
			try {
				product = c.newInstance();
				map.put(c.getName(), product);
			} catch (InstantiationException | IllegalAccessException e) {
				System.out.println("create product error...");
				e.printStackTrace();
			}
		}
		return product;
	}

}
