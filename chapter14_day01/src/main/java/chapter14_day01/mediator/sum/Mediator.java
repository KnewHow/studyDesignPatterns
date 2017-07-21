package chapter14_day01.mediator.sum;

/**
 * A abstract class of mediator
 * 
 * @author ygh Jul 21, 2017
 */
public abstract class Mediator {
	ConcreteColleague1 colleague1 = null;
	ConcreteColleague2 colleague2 = null;

	public ConcreteColleague1 getColleague1() {
		return colleague1;
	}

	public void setColleague1(ConcreteColleague1 colleague1) {
		this.colleague1 = colleague1;
	}

	public ConcreteColleague2 getColleague2() {
		return colleague2;
	}

	public void setColleague2(ConcreteColleague2 colleague2) {
		this.colleague2 = colleague2;
	}

	public abstract void dosomething1();

	public abstract void dosomething2();

}
