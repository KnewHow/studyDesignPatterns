package chapter15_day01.commandPatternPerfect.groups;

/**
 * A page group who is responsible for web page
 * 
 * @author ygh Jul 22, 2017
 */
public class PageGroup extends Group {

	@Override
	public void find() {
		System.out.println("find page group");
	}

	@Override
	public void add() {
		System.out.println("add some pages");
	}

	@Override
	public void delete() {
		System.out.println("delete some pages");
	}

	@Override
	public void change() {
		System.out.println("change some pages");
	}

	@Override
	public void plan() {
		System.out.println("execute listing pages");
	}
	
	@Override
	public void rollBack() {
		System.out.println("rollback some pages");
	}

}
