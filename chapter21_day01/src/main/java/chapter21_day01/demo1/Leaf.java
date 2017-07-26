package chapter21_day01.demo1;

public class Leaf implements ILeaf {

	private String name = "";

	private String position = "";

	private int salary = 0;

	public Leaf(String name, String position, int salary) {
		super();
		this.name = name;
		this.position = position;
		this.salary = salary;
	}

	@Override
	public String getInfo() {
		StringBuilder sb = new StringBuilder();
		sb.append("名称：").append(this.name);
		sb.append("\t职位：").append(this.position);
		sb.append("\t薪水：").append(this.salary);
		return sb.toString();
	}

}
