package chapter24_day01.demo3;

public class Client {
	public static void main(String[] args) {
		Caretaker caretaker = new Caretaker();
		Boy boy = new Boy();

		caretaker.setMemento(boy.createMemeoto());
		boy.changeState();

		boy.restoreMemento(caretaker.getMemento());
	}
}
