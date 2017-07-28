package chapter24_day01.demo5_more_state;

public class Client {
	public static void main(String[] args) {
		Originator originator = new Originator();
		Caretaker caretaker = new Caretaker();

		caretaker.setMemento(originator.createMemeote());

		/**
		 * .....
		 */

		originator.restoreMemote(caretaker.getMemento());
	}
}
