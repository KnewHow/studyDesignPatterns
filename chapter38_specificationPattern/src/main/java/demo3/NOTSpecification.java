package demo3;

import pojo.User;

public class NOTSpecification extends CompositeSpecification {

	private IUserSpecification iUserSpecification;

	public NOTSpecification(IUserSpecification iUserSpecification) {
		super();
		this.iUserSpecification = iUserSpecification;
	}

	@Override
	public boolean isSatisfied(User user) {
		return !this.iUserSpecification.isSatisfied(user);
	}

}
