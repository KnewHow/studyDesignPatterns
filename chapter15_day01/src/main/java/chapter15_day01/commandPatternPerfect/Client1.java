package chapter15_day01.commandPatternPerfect;

import chapter15_day01.commandPatternPerfect.command.AddRequirementCommand;
import chapter15_day01.commandPatternPerfect.command.Command;
import chapter15_day01.commandPatternPerfect.groups.Receiver;

/**
 * Just emulate a practical scene
 * 
 * @author ygh Jul 22, 2017
 */
public class Client1 {
	public static void main(String[] args) {
		Receiver receiver = new Receiver();
		Invoker invoker = new Invoker();

		Command command = new AddRequirementCommand(receiver);

		invoker.setCommand(command);
		invoker.action();
	}
}
