package chapter24_day01.demo2;

public class Client {
	public static void main(String[] args) {
		Boy boy = new Boy();
		Memento memento = boy.createMemeoto();
		boy.changeState();
		boy.restoreMemento(memento);
	}
}
