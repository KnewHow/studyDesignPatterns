package chapter14_day01.mediator.sum;

public class ConcreteColleague1 extends Colleague {

	public ConcreteColleague1(Mediator mediator) {
		super(mediator);
	}

	/**
	 * Do some thing alone
	 */
	public void selfMethod() {

	}

	/**
	 * Depend method which a operator self don't finish alone, delegate it to
	 * mediator
	 */
	public void dependMethod() {
		super.mediator.dosomething1();
	}

}
