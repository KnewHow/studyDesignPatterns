package statePattern;

/**
 * The context of state pattern
 * 
 * @author ygh Aug 1, 2017
 */
public class Human {

	public static final ChildState CHILD_STATE = new ChildState();
	public static final AdultState ADULT_STATE = new AdultState();
	public static final OldState OLD_STATE = new OldState();

	private HumanState state;

	public HumanState getState() {
		return state;
	}

	public void setState(HumanState state) {
		this.state = state;
		this.state.setHuman(this);
	}

	public void work() {
		this.state.work();
	}

}
