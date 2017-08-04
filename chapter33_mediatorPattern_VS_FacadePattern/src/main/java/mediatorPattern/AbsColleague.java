package mediatorPattern;

/**
 * All employer abstract class,in this class, we define a mediator for all
 * employer
 * 
 * @author ygh Aug 4, 2017
 */
public abstract class AbsColleague {
	protected AbsMediator absMediator;

	public AbsColleague(AbsMediator absMediator) {
		super();
		this.absMediator = absMediator;
	}

}
