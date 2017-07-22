package chapter15_day01.commandPattern.groups;

/**
 * A concrete requirement group
 * 
 * @author ygh Jul 22, 2017
 */
public class RequirementGroup extends Group {

	@Override
	public void find() {
		System.out.println("find requirment group");
	}

	@Override
	public void add() {
		System.out.println("add some requirements");
	}

	@Override
	public void delete() {
		System.out.println("delete some requirements");
	}

	@Override
	public void change() {
		System.out.println("change some requirements");
	}

	@Override
	public void plan() {
		System.out.println("plan listing requirements");
	}
	
	@Override
	public void rollBack() {
		System.out.println("rollback some requirements");
	}

}
