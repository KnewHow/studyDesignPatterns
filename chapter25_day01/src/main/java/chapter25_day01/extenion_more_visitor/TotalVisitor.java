package chapter25_day01.extenion_more_visitor;

public class TotalVisitor implements ITotalVisitor {

	private final static int MANAGER_COEFFICIENT = 5;

	private final static int COMMONEMPLYEE_COEFFICIENT = 2;

	private int commonTotalSalary = 0;

	private int managerTotalSalary = 0;

	@Override
	public void visit(CommonEmployee commonEmployee) {
		calCommonSalary(commonEmployee.getSalary());
	}

	@Override
	public void visit(Manager manager) {
		calManagerSalary(manager.getSalary());
	}

	@Override
	public void totalSalary() {
		System.out.println("本公司月工资：" + (this.commonTotalSalary + this.managerTotalSalary));
	}

	/**
	 * 
	 * @param salary
	 */
	private void calManagerSalary(int salary) {
		this.managerTotalSalary = this.managerTotalSalary + salary * MANAGER_COEFFICIENT;
	}

	private void calCommonSalary(int salary) {
		this.commonTotalSalary = this.commonTotalSalary + salary * COMMONEMPLYEE_COEFFICIENT;
	}

}
