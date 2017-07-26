package chapter21_day01.sum.transparent;

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
	 * In this case,we find client depend on the abstract class
	 * <code>Component</code> it satisfy 依赖倒置原则
	 * 
	 * @param root
	 */
	public static void display(Component root) {
		for (Component c : root.getSubordinate()) {
			if (c instanceof Leaf) {
				c.doSomething();
			} else {
				display((Branch) c);
			}
		}
	}

}
