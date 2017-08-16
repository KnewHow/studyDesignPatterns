package demo3;

import pojo.User;

public interface IUserSpecification {
	/**
	 * Whether the use is satisfied condition,the condition will be determined by
	 * sub class
	 * 
	 * @param user
	 *            The user will compare with condition
	 * @return True will be return if the user satisfies condition,otherwise false
	 *         will be returned
	 */
	public boolean isSatisfied(User user);

	/**
	 * Two specification <code>AND</code>
	 * 
	 * @param spec
	 *            The another specification
	 * @return A new specification which is the two specifications <code>AND</code>
	 */
	public IUserSpecification and(IUserSpecification spec);

	/**
	 * Two specification <code>OR</code>
	 * 
	 * @param spec
	 *            The another specification
	 * @return A new specification which is the two specifications <code>OR</code>
	 */
	public IUserSpecification or(IUserSpecification spec);

	/**
	 * The specification not result
	 * 
	 * @return
	 */
	public IUserSpecification not();
}
