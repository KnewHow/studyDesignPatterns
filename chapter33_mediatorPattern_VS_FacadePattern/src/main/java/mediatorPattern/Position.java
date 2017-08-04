package mediatorPattern;

public class Position extends AbsColleague implements IPosition {

	public Position(AbsMediator absMediator) {
		super(absMediator);
	}

	@Override
	public void promete() {
		super.absMediator.up(this);
	}

	@Override
	public void demote() {
		super.absMediator.down(this);
	}

}
