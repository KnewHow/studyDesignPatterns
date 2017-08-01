package statePattern;

public class AdultState extends HumanState {

	@Override
	public void work() {
		System.out.println("Adult should work");
		super.human.setState(Human.OLD_STATE);
	}

}
