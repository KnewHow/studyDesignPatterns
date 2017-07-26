package chapter20_day01.demo2;

/**
 * The interface of a project aggregate
 * 
 * @author ygh Jul 26, 2017
 */
public interface IProject {
	/**
	 * Add a element into aggregate
	 * 
	 * @param name
	 *            The name of project
	 * @param num
	 *            The member of project
	 * @param cost
	 *            The cost of the project
	 */
	public void add(String name, int num, int cost);

	/**
	 * Get project information by a string
	 * 
	 * @return A project string describer
	 */
	public String getProjectInfo();

	/**
	 * Get a iterator of this aggregate
	 * 
	 * @return A iterator of this project
	 */
	public IProjectIterator iterator();
}
