package chapter15_day01.commandPattern.groups;

/**
 * A abstract class for group,sub-class can extend it and implement concrete
 * method to do something.
 * 
 * @author ygh Jul 22, 2017
 */
public abstract class Group {
	/**
	 * Find a group
	 */
	public abstract void find();

	/**
	 * Add something
	 */
	public abstract void add();

	/**
	 * Delete something
	 */
	public abstract void delete();

	/**
	 * Change something
	 */
	public abstract void change();

	/**
	 * execute all plans which has been listed
	 */
	public abstract void plan();
	
	public abstract void rollBack();

}
