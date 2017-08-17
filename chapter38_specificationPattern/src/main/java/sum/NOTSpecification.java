package sum;

/**
 * The <code>NOT</code> specification
 * 
 * @author yuangh
 *
 *         Company:Erongdu
 *
 *         2017Äê8ÔÂ17ÈÕ
 *
 */
public class NOTSpecification extends CompositeSpecification {

	private ISpecification spec;

	public NOTSpecification(ISpecification spec) {
		super();
		this.spec = spec;
	}

	@Override
	public boolean isSatisfiedBy(Object candidate) {
		return !this.spec.isSatisfiedBy(candidate);
	}

}
