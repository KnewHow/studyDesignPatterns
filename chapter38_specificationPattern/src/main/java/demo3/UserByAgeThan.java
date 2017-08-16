package demo3;

import pojo.User;

public class UserByAgeThan extends CompositeSpecification {

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
