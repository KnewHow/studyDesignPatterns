package chapter25_day01.extenion_statistic;

public interface IVisitor {
	/**
	 * A method to access common employee
	 * 
	 * @param commonEmployee
	 *            The object of common employee
	 */
	public void visit(CommonEmployee commonEmployee);

	/**
	 * A method to access manage object
	 * 
	 * @param manager
	 *            The object of manager
	 */
	public void visit(Manager manager);

	/**
	 * A method to statistic all employ salary
	 * @return
	 */
	public int getToalSalary();

}
