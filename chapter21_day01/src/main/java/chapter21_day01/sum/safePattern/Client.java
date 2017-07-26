package chapter21_day01.sum.safePattern;

/**
 * 
 * @author ygh Jul 26, 2017
 */
public class Client {
	public static void main(String[] args) {
		Branch root = new Branch();
		root.doSomething();
		Branch branch = new Branch();
		Leaf leaf = new Leaf();
		root.add(branch);
		root.add(leaf);

	}

	/**
	 * In this case,we find client depend on the concrete class but not
	 * abstract,it break the 依赖倒置原则。But it very safe,it caller safe pattern
	 * 
	 * @param root
	 */
	public static void display(Branch root) {
		for (Component c : root.getSubordinate()) {
			if (c instanceof Leaf) {
				c.doSomething();
			} else {
				display((Branch) c);
			}
		}
	}

}
