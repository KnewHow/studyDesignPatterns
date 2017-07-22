package chapter15_day01.commandPattern;
/**
 * A class to communicate with client
 * @author ygh
 * Jul 22, 2017
 */

import chapter15_day01.commandPattern.command.Command;

public class Invoker {
	private Command command;

	public Command getCommand() {
		return command;
	}

	public void setCommand(Command command) {
		this.command = command;
	}

	public void action() {
		this.command.execute();
	}
}
