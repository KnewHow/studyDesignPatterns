package chapter05_day01.demo1.show1;

import java.util.ArrayList;
import java.util.List;

public class Teacher {
	public void command(GroupLeader groupLeader) {
		List<Girl> list = new ArrayList<Girl>();
		for (int i = 0; i < 20; i++) {
			list.add(new Girl());
		}
		groupLeader.counterGirls(list);
	}
}
