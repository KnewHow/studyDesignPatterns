package strategyPattern;

/**
 * A content class for strategy pattern
 * 
 * @author ygh Aug 1, 2017
 */
public class Context {
	private WorkAlgorithm algorithm;

	public WorkAlgorithm getAlgorithm() {
		return algorithm;
	}

	public void setAlgorithm(WorkAlgorithm algorithm) {
		this.algorithm = algorithm;
	}

	public void work() {
		this.algorithm.work();
	}
}
