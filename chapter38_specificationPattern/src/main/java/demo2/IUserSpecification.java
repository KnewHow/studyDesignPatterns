package demo2;

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
}
