package chapter16_day01.responsibilityChain.woman;

/**
 * A interface of woman
 * 
 * @author ygh Jul 22, 2017
 */
public interface WomenInterface {
	/**
	 * Get the status of the woman
	 * <p>
	 * 1 indicating don't marry
	 * 
	 * 2 indicating has married
	 * 
	 * 3 indicate her husband is dead
	 * </p>
	 * 
	 * @return the status of the woman
	 */
	public int getStatus();

	/**
	 * Get a request of the woman
	 * 
	 * @return A request of the woman
	 */
	public String getRequest();
}
