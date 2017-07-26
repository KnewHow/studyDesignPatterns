package chapter21_day01.demo3;

public abstract class Corp {
	private String name = "";

	private String position = "";

	private int salary = 0;

	public Corp(String name, String position, int salary) {
		super();
		this.name = name;
		this.position = position;
		this.salary = salary;
	}

	public String getInfo() {
		StringBuilder sb = new StringBuilder();
		sb.append("名称：").append(this.name);
		sb.append("\t职位：").append(this.position);
		sb.append("\t薪水：").append(this.salary);
		return sb.toString();
	}
	
}
