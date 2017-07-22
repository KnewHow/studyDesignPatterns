package chapter15_day01.sum;

import chapter15_day01.sum.command.Command;

/**
 * A invoker class to communicate with client
 * 
 * @author ygh Jul 22, 2017
 */
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
