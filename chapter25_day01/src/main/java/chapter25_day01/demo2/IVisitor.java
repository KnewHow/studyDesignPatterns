package chapter25_day01.demo2;

public interface IVisitor {
	/**
	 * A method to access common employee
	 * 
	 * @param commonEmployee
	 *            The object of common employee
	 */
	public abstract void visit(CommonEmployee commonEmployee);

	/**
	 * A method to access manage object
	 * 
	 * @param manager
	 *            The object of manager
	 */
	public abstract void visit(Manager manager);

}
