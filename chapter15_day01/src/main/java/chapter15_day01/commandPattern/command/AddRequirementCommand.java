package chapter15_day01.commandPattern.command;

/**
 * A client command to add requirement
 * 
 * @author ygh Jul 22, 2017
 */
public class AddRequirementCommand extends Command {

	@Override
	public void execute() {
		super.rg.find();
		super.rg.add();
		super.rg.plan();
	}

}
