package mediatorPattern;

public class Salary extends AbsColleague implements ISalary{

	public Salary(AbsMediator absMediator) {
		super(absMediator);
	}

	@Override
	public void increaseSalary() {
		
	}

	@Override
	public void decreaseSalary() {
		
	}

}
