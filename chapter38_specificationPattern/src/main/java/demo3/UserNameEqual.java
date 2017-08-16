package demo3;

import pojo.User;

public class UserNameEqual extends CompositeSpecification {

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
