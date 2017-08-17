package sum;

/**
 * A interface of specification
 * 
 * @author yuangh
 *
 *         Company:Erongdu
 *
 *         2017Äê8ÔÂ17ÈÕ
 *
 */
public interface ISpecification {

	/**
	 * Whether the candidate is satisfied condition
	 * 
	 * @param candidate
	 *            The candidate object
	 * @return true will be return if the candidate will be satisfied,otherwise will
	 *         return false
	 */
	public boolean isSatisfiedBy(Object candidate);

	/**
	 * Two specification <code>AND</code>
	 * 
	 * @param spec
	 *            Another specification,one is the self,you can use
	 *            <code>spec1.and(spec2)</code>
	 * 
	 * @return A new specification will be produce
	 */
	public ISpecification and(ISpecification spec);

	/**
	 * Two specification <code>OR</code>
	 * 
	 * @param spec
	 *            Another specification,one is the self,you can use
	 *            <code>spec1.or(spec2)</code>
	 * 
	 * @return A new specification will be produce
	 */
	public ISpecification or(ISpecification spec);

	/**
	 * Not a specification
	 * 
	 * @return A new specification witch the specification not
	 */
	public ISpecification not();

}
