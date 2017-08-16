package demo3;

import java.util.ArrayList;
import java.util.List;

import pojo.User;

public class UserProvider implements IUserProvider {

	/**
	 * A list to store all users
	 */
	private List<User> userList = null;

	public UserProvider(List<User> userList) {
		super();
		this.userList = userList;
	}

	@Override
	public List<User> findUser(IUserSpecification iUserSpecification) {
		List<User> result = new ArrayList<>();
		for (User user : userList) {
			if (iUserSpecification.isSatisfied(user)) {
				result.add(user);
			}
		}
		return result;
	}

}
