package chapter15_day01.errorExample;

/**
 * Just emulate a practical scene
 * 
 * @author ygh Jul 22, 2017
 */
public class ClientTwo {
	public static void main(String[] args) {
		System.out.println("-------client add a page------");
		Group pg = new PageGroup();
		pg.find();
		pg.add();
		pg.plan();
	}
}
