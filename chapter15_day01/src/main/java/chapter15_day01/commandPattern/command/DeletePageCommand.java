package chapter15_day01.commandPattern.command;

/**
 * A delete page command
 * 
 * @author ygh Jul 22, 2017
 */
public class DeletePageCommand extends Command {

	@Override
	public void execute() {
		super.pg.find();
		super.pg.delete();
		super.pg.plan();
	}

}
