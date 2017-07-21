package chapter14_day01.mediator;

/**
 * A abstract colleague class for all concrete colleague
 * 
 * @author ygh Jul 21, 2017
 */
public abstract class AbstractColleague {
	protected AbstractMediator mediator;

	public AbstractColleague(AbstractMediator mediator) {
		super();
		this.mediator = mediator;
	}

}
