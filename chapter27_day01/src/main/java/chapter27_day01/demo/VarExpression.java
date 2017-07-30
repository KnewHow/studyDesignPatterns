package chapter27_day01.demo;

import java.util.HashMap;

/**
 * A variable expression class, the method interpreter is to get variable value
 * 
 * @author ygh Jul 30, 2017
 */
public class VarExpression extends Expression {

	/**
	 * The name of the variable
	 */
	private String key;

	public VarExpression(String key) {
		super();
		this.key = key;
	}

	@Override
	public int interpreter(HashMap<String, Integer> var) {
		return var.get(this.key);
	}

}
