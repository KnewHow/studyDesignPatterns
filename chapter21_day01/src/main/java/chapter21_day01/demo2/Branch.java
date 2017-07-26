package chapter21_day01.demo2;

import java.util.ArrayList;
import java.util.List;

public class Branch implements IBranch {

	private ArrayList<ICorp> subordinateList = new ArrayList<>();

	private String name = "";

	private String position = "";

	private int salary = 0;

	public Branch(String name, String position, int salary) {
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

	@Override
	public void addSubordinate(ICorp corp) {
		this.subordinateList.add(corp);
	}

	@Override
	public List<ICorp> getSubordinateInfo() {
		return this.subordinateList;
	}

}
