package chapter15_day01.commandPattern;

import chapter15_day01.commandPattern.command.AddRequirementCommand;
import chapter15_day01.commandPattern.command.Command;

/**
 * Just emulate a practical scene
 * 
 * @author ygh Jul 22, 2017
 */
public class Client1 {
	public static void main(String[] args) {
		Invoker invoker = new Invoker();

		Command command = new AddRequirementCommand();

		invoker.setCommand(command);
		invoker.action();
	}
}
