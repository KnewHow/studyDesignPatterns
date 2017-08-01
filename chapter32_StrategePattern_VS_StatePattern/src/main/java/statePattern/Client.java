package statePattern;

public class Client {
	public static void main(String[] args) {
		Human human = new Human();
		human.setState(Human.CHILD_STATE);
		human.work();
		human.work();
		human.work();
	}
}
