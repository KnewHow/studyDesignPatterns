package commandPattern;

/**
 * An interface of command receiver
 * 
 * @author ygh Jul 31, 2017
 */
public interface IReceiver {
	/**
	 * Compress file algorithm
	 * 
	 * @param source
	 *            The source file
	 * @param to
	 *            The target file
	 * @return
	 */
	public boolean compress(String source, String to);

	/**
	 * Uncompress file algorithm
	 * 
	 * @param source
	 *            The source file
	 * @param to
	 *            The target file
	 * @return
	 */
	public boolean uncompress(String source, String to);
}
