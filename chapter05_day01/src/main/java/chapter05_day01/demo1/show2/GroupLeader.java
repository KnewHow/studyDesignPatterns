package chapter05_day01.demo1.show2;

import java.util.List;

public class GroupLeader {
	private List<Girl> list;

	public GroupLeader(List<Girl> list) {
		super();
		this.list = list;
	}

	public void counterGirls() {
		System.out.println("the quanity of girl is" + this.list.size());
	}
}
