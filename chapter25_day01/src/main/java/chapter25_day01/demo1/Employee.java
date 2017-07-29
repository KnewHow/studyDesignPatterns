package chapter25_day01.demo1;

/**
 * A abstract class for employee
 * 
 * @author ygh Jul 29, 2017
 */
public abstract class Employee {
	public final static int MALE = 0;
	public final static int FEMALE = 1;

	private String name;

	private int salary;

	private int sex;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getSex() {
		return sex;
	}

	public void setSex(int sex) {
		this.sex = sex;
	}

	/**
	 * Print the employee information
	 */
	public final void report() {
		StringBuilder sb = new StringBuilder();
		sb.append("姓名：").append(this.getName()).append("\t");
		sb.append("性别：").append((this.sex == FEMALE ? "女" : "男")).append("\t");
		sb.append("薪水：").append(this.getSalary()).append("\t");
		sb.append(getOtherInfo());
		System.out.println(sb.toString());
	}
	
	/**
	 * A abstract method subclass can implement it
	 * 
	 * @return A string descriptor to describe other information
	 */
	protected abstract String getOtherInfo();
}
