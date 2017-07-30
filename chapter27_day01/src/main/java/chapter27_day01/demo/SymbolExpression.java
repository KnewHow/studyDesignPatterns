package chapter27_day01.demo;

public abstract class SymbolExpression extends Expression{
	/**
	 * The left expression of the symbol
	 */
	protected Expression left;

	/**
	 * The right expression of symbol
	 */
	protected Expression right;

	public SymbolExpression(Expression left, Expression right) {
		super();
		this.left = left;
		this.right = right;
	}
	
	
}
