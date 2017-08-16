package demo3;

import pojo.User;

public class UserNameLike extends CompositeSpecification {

	private String like_str;

	public UserNameLike(String like_str) {
		super();
		this.like_str = like_str;
	}

	@Override
	public boolean isSatisfied(User user) {
		this.like_str = this.like_str.replace("%", "");
		return user.getName().contains(like_str);
	}

}
