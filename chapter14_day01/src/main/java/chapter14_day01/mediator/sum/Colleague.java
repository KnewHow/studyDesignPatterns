package chapter14_day01.mediator.sum;

/**
 * A abstract class of colleague
 * 
 * @author ygh Jul 21, 2017
 */
public abstract class Colleague {
	protected Mediator mediator;

	public Colleague(Mediator mediator) {
		super();
		this.mediator = mediator;
	}

}
