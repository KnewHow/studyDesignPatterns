package chapter08_day01.extension3;

import java.lang.reflect.Constructor;

/**
 * A single factory to provide a singlet object
 * 
 * @author ygh Jul 17, 2017
 */
public class SingletonFactory {

	private static Singleton singleton = null;

	static {
		try {
			Class<? extends Object> clazz = Class.forName(Singleton.class.getName());
			Constructor<? extends Object> constructor = clazz.getConstructor();
			boolean isAccessable = constructor.isAccessible();
			constructor.setAccessible(true);
			singleton = (Singleton) constructor.newInstance();
			constructor.setAccessible(isAccessable);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static Singleton getInstance() {
		return singleton;
	}
}
