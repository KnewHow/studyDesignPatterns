package mediatorPattern;

/**
 * The abstract class of mediator
 * 
 * @author ygh Aug 4, 2017
 */
public abstract class AbsMediator {

	/**
	 * when employer's position up,we will do some operators
	 * 
	 * @param iPosition
	 *            The information of employer's position
	 */
	public abstract void up(IPosition iPosition);

	/**
	 * when employer's position down,we will do some operators
	 * 
	 * @param iPosition
	 *            The information of employer's position
	 */
	public abstract void down(IPosition iPosition);
}
