package chapter21_day01.demo2;

import java.util.List;

public interface IBranch extends ICorp {
	/**
	 * Add subordinate node into this node This node may is root node or branch
	 * node
	 * 
	 * @param corp
	 *            The subordinate node need to add into this node
	 */
	public void addSubordinate(ICorp corp);

	/**
	 * Get all subordinate node of this class,we use a <code>List</code> to
	 * encapsulate all subordinate nodes
	 * 
	 * @return All subordinate node encapsulated by a <code>List</code>
	 */
	public List<ICorp> getSubordinateInfo();

}
