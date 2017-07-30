package chapter27_day01.demo;

import java.util.HashMap;
import java.util.Stack;

public class Calculator {
	private Expression expression;

	public Calculator(String exptrStr) {
		Stack<Expression> stack = new Stack<>();
		char[] charArray = exptrStr.toCharArray();
		Expression left = null;
		Expression right = null;
		for (int i = 0; i < charArray.length; i++) {
			switch (charArray[i]) {
			case '+':
				left = stack.pop();
				right = new VarExpression(String.valueOf(charArray[++i]));
				stack.push(new AddExpression(left, right));
				break;

			case '-':
				left = stack.pop();
				right = new VarExpression(String.valueOf(charArray[++i]));
				stack.push(new SubExpression(left, right));
				break;
			default:
				stack.push(new VarExpression(String.valueOf(charArray[i])));
				break;
			}
		}
		this.expression = stack.pop();
	}

	public int run(HashMap<String, Integer> var) {
		return this.expression.interpreter(var);
	}

}
