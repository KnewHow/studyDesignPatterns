package strategyPattern;

/**
 * A class to switch algorithm
 * 
 * @author ygh Jul 31, 2017
 */
public class Context {
	private Algorithm algorithm;

	public Context(Algorithm algorithm) {
		super();
		this.algorithm = algorithm;
	}

	/**
	 * Compress file algorithm
	 * 
	 * @param source
	 *            The source file
	 * @param to
	 *            The target file
	 * @return
	 */
	public boolean compress(String source, String to) {
		return this.algorithm.compress(source, to);
	}

	/**
	 * Uncompress file algorithm
	 * 
	 * @param source
	 *            The source file
	 * @param to
	 *            The target file
	 * @return
	 */
	public boolean uncompress(String source, String to) {
		return this.algorithm.uncompress(source, to);
	}

}
