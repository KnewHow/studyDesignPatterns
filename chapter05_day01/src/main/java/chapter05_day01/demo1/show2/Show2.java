package chapter05_day01.demo1.show2;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author ygh Jul 15, 2017
 */
public class Show2 {
	public static void main(String[] args) {
		List<Girl> list = new ArrayList<Girl>();
		for (int i = 0; i < 20; i++) {
			list.add(new Girl());
		}
		GroupLeader groupLeader = new GroupLeader(list);
		Teacher teacher = new Teacher();
		teacher.command(groupLeader);
	}
}
