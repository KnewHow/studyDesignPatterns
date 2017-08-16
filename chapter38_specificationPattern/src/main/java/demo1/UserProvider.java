package demo1;

import java.util.ArrayList;
import java.util.List;

import pojo.User;

public class UserProvider implements IUserProvider {

	private List<User> userList = null;

	public UserProvider(List<User> userList) {
		super();
		this.userList = userList;
	}

	@Override
	public List<User> findUserByNameEqual(String name) {
		List<User> result = new ArrayList<>();
		for (User user : this.userList) {
			if (user.getName().equalsIgnoreCase(name)) {
				result.add(user);
			}
		}
		return result;
	}

	@Override
	public List<User> findUserByAgeThan(int age) {
		List<User> result = new ArrayList<>();
		for (User user : this.userList) {
			if (user.getAge() > age) {
				result.add(user);
			}
		}
		return result;
	}

}
