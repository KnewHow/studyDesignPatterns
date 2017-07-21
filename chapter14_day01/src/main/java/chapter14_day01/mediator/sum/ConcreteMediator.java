package chapter14_day01.mediator.sum;

public class ConcreteMediator extends Mediator {

	@Override
	public void dosomething1() {
		super.colleague1.selfMethod();
		super.colleague1.selfMethod();
	}

	@Override
	public void dosomething2() {
		super.colleague1.selfMethod();
		super.colleague1.selfMethod();
	}

}
