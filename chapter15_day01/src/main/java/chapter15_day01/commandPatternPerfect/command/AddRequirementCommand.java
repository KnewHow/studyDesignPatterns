package chapter15_day01.commandPatternPerfect.command;

import chapter15_day01.commandPatternPerfect.groups.Receiver;

/**
 * A client command to add requirement
 * 
 * @author ygh Jul 22, 2017
 */
public class AddRequirementCommand extends Command {

	public AddRequirementCommand(Receiver receiver) {
		super(receiver);
	}

	@Override
	public void execute() {
		super.receiver.getRg().find();
		super.receiver.getRg().add();
		super.receiver.getRg().plan();
	}

}
