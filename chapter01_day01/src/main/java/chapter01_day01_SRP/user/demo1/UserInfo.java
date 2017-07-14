package chapter01_day01_SRP.user.demo1;

/**
 * @author ygh Jul 14, 2017
 * 
 *         The interface is to describe user information,but this interface is
 *         not SPR(Single Responsibility Principle).
 *         
 *         In this interface,we involve BO(Business Object) and
 *         Biz(Business Logic),we must separate them
 *         
 */
interface UserInfo {
	public void setUserId(String uid);

	public String getUserId();

	public void setPassword(String password);

	public String getPassword();

	public void setUserName(String userName);

	public String getUserName();

	boolean changePassword(String oldPass);

	boolean deleteUser();

	boolean addOrg(int orgID);

	boolean addRole(int roleID);
}
