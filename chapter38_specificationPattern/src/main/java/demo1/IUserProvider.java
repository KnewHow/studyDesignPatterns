package demo1;

import java.util.List;

import pojo.User;

/**
 * A interface of client manual
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
	 * Get user whose name is equal with this name
	 * 
	 * @param name
	 *            Find the user whose name is equal with this parameter
	 * @return A <code>List</code> of user whose name is equal this name
	 */
	public List<User> findUserByNameEqual(String name);

	/**
	 * Get user whose age is greater than this age
	 * 
	 * @param age
	 *            Find the user whose age is greater than this age
	 * @return A <code>List</code> of user whose age is greater than this age
	 */
	public List<User> findUserByAgeThan(int age);
}
