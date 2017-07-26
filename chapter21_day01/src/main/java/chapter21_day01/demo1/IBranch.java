package chapter21_day01.demo1;

import java.util.List;

/**
 * A branch node,but not root node
 * 
 * @author ygh Jul 26, 2017
 */
public interface IBranch {
	/**
	 * Get information of root node,using a string descriptor
	 * 
	 * @return The string descriptor of root node
	 */
	public String getInfo();

	/**
	 * Add branch node
	 * 
	 * @param branch
	 *            The branch node need to add into this node
	 */
	public void add(IBranch branch);

	/**
	 * Add leaf node into root node
	 * 
	 * @param leaf
	 *            The leaf node need to add into this node
	 */
	public void add(ILeaf leaf);

	/**
	 * Get all subordinate node of this class,we use a <code>List</code> to
	 * encapsulate all subordinate nodes
	 * 
	 * @return All subordinate node encapsulated by a <code>List</code>
	 */
	public List<?> getSubordinateInfo();
}
