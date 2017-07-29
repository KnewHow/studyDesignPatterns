package chapter25_day01.extenion_double_dispatch.demo1;

public class Client {
	public static void main(String[] args) {
		AbstractActor actor = new OldActor();
		Role role = new KungfuRole();
		actor.act(role);
	}
}
