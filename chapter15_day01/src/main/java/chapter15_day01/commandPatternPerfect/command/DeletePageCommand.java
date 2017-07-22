package chapter15_day01.commandPatternPerfect.command;

import chapter15_day01.commandPatternPerfect.groups.Receiver;

/**
 * A delete page command
 * 
 * @author ygh Jul 22, 2017
 */
public class DeletePageCommand extends Command {

	public DeletePageCommand(Receiver receiver) {
		super(receiver);
	}

	@Override
	public void execute() {
		super.receiver.getPg().find();
		super.receiver.getPg().delete();
		super.receiver.getPg().plan();
	}

}
