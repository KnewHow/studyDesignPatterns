package chapter24_day01.demo5_more_state_more;

public class Client {
	public static void main(String[] args) {
		Originator originator = new Originator();
		Caretaker caretaker = new Caretaker();

		caretaker.setMemento("001", originator.createMemeote());

		/**
		 * .....
		 */

		caretaker.setMemento("002", originator.createMemeote());

		/**
		 * .....
		 */

		originator.restoreMemote(caretaker.getMemento("001"));
	}
}
