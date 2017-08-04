package mediatorPattern;

/**
 * The interface for employer position
 * 
 * @author ygh Aug 4, 2017
 */
public interface IPosition {
	/**
	 * when employer's position up,we will do some operators
	 */
	public void promete();

	/**
	 * when employer's position down,we will do some operators
	 */
	public void demote();
}
