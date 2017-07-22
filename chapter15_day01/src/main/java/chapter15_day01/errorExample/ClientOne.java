package chapter15_day01.errorExample;

/**
 * Just emulate a practical scene
 * 
 * @author ygh Jul 22, 2017
 */
public class ClientOne {
	public static void main(String[] args) {
		System.out.println("-------client add a requirement------");
		Group rg = new RequirementGroup();
		rg.find();
		rg.add();
		rg.plan();
	}
}
