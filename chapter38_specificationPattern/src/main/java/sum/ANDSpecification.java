package sum;

/**
 * The <code>AND</code> specification
 * 
 * @author yuangh
 *
 *         Company:Erongdu
 *
 *         2017��8��17��
 *
 */
public class ANDSpecification extends CompositeSpecification {

	private ISpecification left;

	private ISpecification right;

	public ANDSpecification(ISpecification left, ISpecification right) {
		super();
		this.left = left;
		this.right = right;
	}

	@Override
	public boolean isSatisfiedBy(Object candidate) {
		return left.isSatisfiedBy(candidate) && right.isSatisfiedBy(candidate);
	}

}
