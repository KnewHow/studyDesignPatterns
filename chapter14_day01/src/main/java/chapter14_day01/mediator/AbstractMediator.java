package chapter14_day01.mediator;

/**
 * A abstract class ot mediator
 * 
 * @author ygh Jul 21, 2017
 */
public abstract class AbstractMediator {

	protected Purchase purcase;

	protected Sale sale;

	protected Stock stock;

	public AbstractMediator() {
		super();
		this.purcase = new Purchase(this);
		this.sale = new Sale(this);
		this.stock = new Stock(this);
	}

	/**
	 * A method to deal with relation between colleague
	 * 
	 * @param str
	 *            The name of class and method,we use
	 *            xxx(className).yyy(methodName) to indicate which class and
	 *            which method we want to call
	 * @param objects
	 *            The parameters of method we want to call. objects[0] indicate
	 *            the first parameters of the method and so on...
	 */
	public abstract void execute(String str, Object... objects);
}
