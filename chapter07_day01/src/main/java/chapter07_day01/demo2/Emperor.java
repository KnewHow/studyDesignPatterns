package chapter07_day01.demo2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
/**
 * A multiton patterns
 * @author ygh
 * Jul 16, 2017
 */
public class Emperor {

	private static final List<Emperor> emperorList = new ArrayList<>();
	private static int maxNum = 2;
	private static final List<String> nameList = new ArrayList<>();
	private static int counter = 0;

	static {
		for (int i = 0; i < maxNum; i++) {
			emperorList.add(new Emperor("皇" + (i + 1) + "帝"));
		}
	}

	private Emperor(String name) {
		nameList.add(name);
	}

	public static Emperor getInstance() {
		Random random = new Random();
		counter = random.nextInt(maxNum);
		return emperorList.get(counter);
	}

	public void say() {
		System.out.println(nameList.get(counter));
	}

}
