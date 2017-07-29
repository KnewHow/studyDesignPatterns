package chapter26_day01.sum;

public class ConcreteState1 extends State{

	@Override
	public void handle1() {
		System.out.println("handle1.....");
	}

	@Override
	public void handle2() {
		super.context.setCurrentState(Context.STATE2);
		super.context.handle2();
	}
	
}
