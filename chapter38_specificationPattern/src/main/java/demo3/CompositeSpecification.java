package demo3;

public abstract class CompositeSpecification implements IUserSpecification {

	@Override
	public IUserSpecification and(IUserSpecification spec) {
		return new ANDSpecification(this, spec);
	}

	@Override
	public IUserSpecification or(IUserSpecification spec) {
		return new ORSpecification(this, spec);
	}

	@Override
	public IUserSpecification not() {
		return new NOTSpecification(this);
	}

}
