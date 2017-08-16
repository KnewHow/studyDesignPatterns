package demo2;

import pojo.User;

public class UserNameEqual implements IUserSpecification {

	private String name;

	public UserNameEqual(String name) {
		super();
		this.name = name;
	}

	@Override
	public boolean isSatisfied(User user) {
		return user.getName().equalsIgnoreCase(this.name);
	}

}
