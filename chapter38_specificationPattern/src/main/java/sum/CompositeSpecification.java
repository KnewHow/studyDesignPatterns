package sum;

public abstract class CompositeSpecification implements ISpecification {

	@Override
	public ISpecification and(ISpecification spec) {
		return new ANDSpecification(this, spec);
	}

	@Override
	public ISpecification or(ISpecification spec) {
		return new ORSpecification(this, spec);
	}

	@Override
	public ISpecification not() {
		return new NOTSpecification(this);
	}

}
