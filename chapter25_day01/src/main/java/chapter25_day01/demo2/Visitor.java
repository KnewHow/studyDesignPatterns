package chapter25_day01.demo2;

public class Visitor implements IVisitor {

	@Override
	public void visit(CommonEmployee commonEmployee) {
		System.out.println(this.getCommonEmployeeInfo(commonEmployee));
	}

	@Override
	public void visit(Manager manager) {
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

}
