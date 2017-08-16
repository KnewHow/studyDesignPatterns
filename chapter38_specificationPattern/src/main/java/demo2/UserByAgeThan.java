package demo2;

import pojo.User;

public class UserByAgeThan implements IUserSpecification {

	private int age;

	public UserByAgeThan(int age) {
		super();
		this.age = age;
	}

	@Override
	public boolean isSatisfied(User user) {
		return user.getAge() > this.age;
	}

}
