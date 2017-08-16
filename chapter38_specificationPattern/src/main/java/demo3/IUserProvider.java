package demo3;

import java.util.List;

import pojo.User;

/**
 * A class of user operation
 * 
 * @author yuangh
 *
 *         Company:Erongdu
 *
 *         2017Äê8ÔÂ16ÈÕ
 *
 */
public interface IUserProvider {
	/**
	 * Find user by specification
	 * 
	 * @param iUserSpecification
	 *            The specification which we will find user by
	 * @return A <code>List</code> of user will be return which satisfy
	 *         specification
	 */
	public List<User> findUser(IUserSpecification iUserSpecification);
}
