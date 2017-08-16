package utils;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

/**
 * A class tools to get a class all sub class
 * 
 * @author yuangh
 *
 *         Company:Erongdu
 *
 *         2017Äê8ÔÂ15ÈÕ
 *
 */
public class ClassUtils {
	/**
	 * Get all sub class of father class
	 * 
	 * @param fatherClass
	 *            The class which want to find sub classes
	 * @return
	 */
	public static List<Class<?>> getSonClass(Class<?> fatherClass) {
		List<Class<?>> returnClassList = new ArrayList<>();
		String packgeName = fatherClass.getPackage().getName();
		List<Class<?>> packClasses = getClasses(packgeName);
		for (Class<?> c : packClasses) {
			if (fatherClass.isAssignableFrom(c) && !fatherClass.equals(c)) {
				returnClassList.add(c);
			}
		}

		return returnClassList;
	}

	/**
	 * Get all classes that in same package
	 * 
	 * @param packgeName
	 *            The name of package which we will find all class in it.
	 * @return
	 */
	private static List<Class<?>> getClasses(String packgeName) {
		ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
		String path = packgeName.replace(".", "/");
		Enumeration<URL> resoureces = null;
		try {
			resoureces = classLoader.getResources(path);
		} catch (IOException e) {

		}
		List<File> dirs = new ArrayList<>();
		while (resoureces.hasMoreElements()) {
			URL resource = resoureces.nextElement();
			dirs.add(new File(resource.getFile()));
		}

		List<Class<?>> classes = new ArrayList<>();
		for (File directory : dirs) {
			classes.addAll(findClasses(directory, packgeName));
		}

		return classes;
	}

	private static List<? extends Class<?>> findClasses(File directory, String packgeName) {
		List<Class<?>> classes = new ArrayList<>();
		if (!directory.exists()) {
			return classes;
		}
		File[] files = directory.listFiles();
		for (File file : files) {
			if (file.isDirectory()) {
				assert file.getName().contains(".");
				classes.addAll(findClasses(file, packgeName + "." + file.getName()));
			} else if (file.getName().endsWith(".class")) {
				try {
					classes.add(
							Class.forName(packgeName + "." + file.getName().substring(0, file.getName().length() - 6)));
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				}
			}
		}
		return classes;
	}
}
