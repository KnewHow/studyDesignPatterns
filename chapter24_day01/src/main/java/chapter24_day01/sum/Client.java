package chapter24_day01.sum;

public class Client {
	public static void main(String[] args) {
		Caretaker caretaker = new Caretaker();
		Originator boy = new Originator();

		caretaker.setMemento(boy.createMemeoto());
		boy.changeState();

		boy.restoreMemento(caretaker.getMemento());
	}
}
