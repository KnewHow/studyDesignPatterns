package chapter05_day01.demo1.show1;

/**
 * 
 * @author ygh
 * Jul 15, 2017
 */
public class Show1 {
	public static void main(String[] args) {
		GroupLeader groupLeader = new GroupLeader();
		Teacher teacher = new Teacher();
		teacher.command(groupLeader);
	}
}
