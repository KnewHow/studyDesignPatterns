package chapter20_day01.sum;

/**
 * A aggregate
 * 
 * @author ygh Jul 26, 2017
 */
public interface Aggregate {
	/**
	 * Add method
	 * @param object
	 */
	public void add(Object object);
	
	public Object remove();
	
	public Iterator iterator();
	
}
