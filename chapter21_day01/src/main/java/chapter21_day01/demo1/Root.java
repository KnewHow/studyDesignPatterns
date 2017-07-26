package chapter21_day01.demo1;

import java.util.ArrayList;
import java.util.List;

public class Root implements IRoot {

	private ArrayList<Object> subordinateList = new ArrayList<>();

	private String name = "";

	private String position = "";

	private int salary = 0;

	public Root(String name, String position, int salary) {
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
	public void add(IBranch branch) {
		this.subordinateList.add(branch);
	}

	@Override
	public void add(ILeaf leaf) {
		this.subordinateList.add(leaf);
	}

	@Override
	public List<?> getSubordinateInfo() {
		return this.subordinateList;
	}

}
