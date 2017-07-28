package chapter24_day01.demo1;

public class Client {
	
	public static void main(String[] args) {
		Boy backup = new Boy();
		Boy boy = new Boy();
		boy.setState("心情很好");
		backup.setState(boy.getState());
		boy.changeState();
		boy.setState(backup.getState());
	}
}
