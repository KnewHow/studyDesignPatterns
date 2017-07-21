package chapter14_day01.mediator.sum;

public class ConcreteColleague2 extends Colleague {

	public ConcreteColleague2(Mediator mediator) {
		super(mediator);
	}

	public void selfMethod() {

	}

	public void dependMethod() {
		super.mediator.dosomething2();
	}

}
