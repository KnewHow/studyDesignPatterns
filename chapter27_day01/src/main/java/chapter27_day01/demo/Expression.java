package chapter27_day01.demo;

import java.util.HashMap;

/**
 * A abstract class for expression,subclass can extends to implement concrete
 * method
 * 
 * @author ygh Jul 30, 2017
 */
public abstract class Expression {
	
	/**
	 * A interpreter method that interpret expression,such add or sub or
	 * variable
	 * 
	 * @param var
	 *            A map to store variable name and value, name is key,for
	 *            example a+b-c,a,b,c are key, we will use this map to store
	 *            a,b,c value.
	 * @return a integer type calculate result
	 */
	public abstract int interpreter(HashMap<String, Integer> var);
}
