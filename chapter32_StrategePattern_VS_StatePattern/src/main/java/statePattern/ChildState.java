package statePattern;

public class ChildState extends HumanState{

	@Override
	public void work() {
		System.out.println("Child should play");
		super.human.setState(Human.ADULT_STATE);
	}

}
