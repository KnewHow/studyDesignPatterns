package chapter25_day01.extenion_statistic;

public class Visitor implements IVisitor {

	private final static int MANAGER_COEFFICIENT = 5;

	private final static int COMMONEMPLYEE_COEFFICIENT = 2;

	private int commonTotalSalary = 0;

	private int managerTotalSalary = 0;

	@Override
	public void visit(CommonEmployee commonEmployee) {
		calCommonSalary(commonEmployee.getSalary());
		System.out.println(this.getCommonEmployeeInfo(commonEmployee));
	}

	@Override
	public void visit(Manager manager) {
		calManagerSalary(manager.getSalary());
		System.out.println(this.getManagerInfo(manager));
	}

	/**
	 * 
	 * @param employee
	 * @return
	 */
	private String getBasicInfo(Employee employee) {
		StringBuilder sb = new StringBuilder();
		sb.append("姓名：").append(employee.getName()).append("\t");
		sb.append("性别：").append((employee.getSex() == Employee.FEMALE ? "女" : "男")).append("\t");
		sb.append("薪水：").append(employee.getSalary()).append("\t");
		return sb.toString();
	}

	/**
	 * 
	 * @param manager
	 * @return
	 */
	private String getManagerInfo(Manager manager) {
		String basicInfo = this.getBasicInfo(manager);
		String otherInfo = "业绩:" + manager.getPerformance() + "\t";
		return basicInfo + otherInfo;
	}

	/**
	 * 
	 * @param employee
	 * @return
	 */
	private String getCommonEmployeeInfo(CommonEmployee employee) {
		String basicInfo = this.getBasicInfo(employee);
		String otherInfo = "工作:" + employee.getJob() + "\t";
		return basicInfo + otherInfo;
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

	@Override
	public int getToalSalary() {
		return this.commonTotalSalary + this.managerTotalSalary;
	}

}
