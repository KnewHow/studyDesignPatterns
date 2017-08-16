package demo3;

import pojo.User;

public class ANDSpecification extends CompositeSpecification {

	private IUserSpecification left;
	private IUserSpecification right;
	

	public ANDSpecification(IUserSpecification left, IUserSpecification right) {
		super();
		this.left = left;
		this.right = right;
	}



	@Override
	public boolean isSatisfied(User user) {
		return left.isSatisfied(user) && right.isSatisfied(user);
	}

}
