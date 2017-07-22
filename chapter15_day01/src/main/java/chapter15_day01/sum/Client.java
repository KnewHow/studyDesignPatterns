package chapter15_day01.sum;

import chapter15_day01.sum.command.Command;
import chapter15_day01.sum.command.ConcreteCommand1;

/**
 * Just emulate a practical scene
 * 
 * @author ygh Jul 22, 2017
 */
public class Client {
	public static void main(String[] args) {
		Command command = new ConcreteCommand1();

		Invoker invoker = new Invoker();
		invoker.setCommand(command);
		invoker.action();
	}
}
