package chapter15_day01.commandPattern;

import chapter15_day01.commandPattern.command.Command;
import chapter15_day01.commandPattern.command.DeletePageCommand;

/**
 * Just emulate a practical scene
 * 
 * @author ygh Jul 22, 2017
 */
public class Client2 {
	public static void main(String[] args) {
		Invoker invoker = new Invoker();

		Command command = new DeletePageCommand();

		invoker.setCommand(command);
		invoker.action();
	}
}
