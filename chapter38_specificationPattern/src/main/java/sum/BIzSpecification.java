package sum;

public class BIzSpecification extends CompositeSpecification{

	@SuppressWarnings("unused")
	private Object obj;
	
	
	public BIzSpecification(Object obj) {
		super();
		this.obj = obj;
	}


	@Override
	public boolean isSatisfiedBy(Object candidate) {
		return false;
	}

}
