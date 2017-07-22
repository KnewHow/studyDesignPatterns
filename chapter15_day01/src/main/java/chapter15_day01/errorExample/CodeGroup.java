package chapter15_day01.errorExample;

public class CodeGroup extends Group {

	@Override
	public void find() {
		System.out.println("find code group");
	}

	@Override
	public void add() {
		System.out.println("add some codes");
	}

	@Override
	public void delete() {
		System.out.println("delete some codes");
	}

	@Override
	public void change() {
		System.out.println("change some codes");
	}

	@Override
	public void plan() {
		System.out.println("exeute listing codes");
	}

}
