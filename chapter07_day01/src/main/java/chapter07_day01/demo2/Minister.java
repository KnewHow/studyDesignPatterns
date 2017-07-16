package chapter07_day01.demo2;
/**
 * 
 * @author ygh
 * Jul 16, 2017
 */
public class Minister {
	public static void main(String[] args) {
		for (int day = 0; day < 5; day++) {
			Emperor emperor = Emperor.getInstance();
			emperor.say();
		}
	}
}
