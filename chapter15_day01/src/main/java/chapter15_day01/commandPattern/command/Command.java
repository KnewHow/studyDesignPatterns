package chapter15_day01.commandPattern.command;

import chapter15_day01.commandPattern.groups.CodeGroup;
import chapter15_day01.commandPattern.groups.PageGroup;
import chapter15_day01.commandPattern.groups.RequirementGroup;

/**
 * A abstract class for command
 * 
 * @author ygh Jul 22, 2017
 */
public abstract class Command {
	/**
	 * Requirement group
	 */
	protected RequirementGroup rg = new RequirementGroup();
	/**
	 * code group
	 */
	protected CodeGroup cg = new CodeGroup();
	/**
	 * page group
	 */
	protected PageGroup pg = new PageGroup();

	/**
	 * A abstract method sub-class to implement to do some concrete thing
	 */
	public abstract void execute();
}
