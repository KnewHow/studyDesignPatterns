package chapter15_day01.commandPatternPerfect.command;

import chapter15_day01.commandPatternPerfect.groups.Receiver;

/**
 * A abstract class for command
 * 
 * @author ygh Jul 22, 2017
 */
public abstract class Command {
	protected Receiver receiver;

	public Command(Receiver receiver) {
		super();
		this.receiver = receiver;
	}

	public abstract void execute();
}
