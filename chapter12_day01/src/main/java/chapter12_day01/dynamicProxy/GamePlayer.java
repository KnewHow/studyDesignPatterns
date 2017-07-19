package chapter12_day01.dynamicProxy;

public class GamePlayer implements GamePlayerInterface {

	private String name;

	public GamePlayer(String name) {
		super();
		this.name = name;
	}

	@Override
	public void login(String user, String password) {
		System.out.println(this.name + "is login");
	}

	@Override
	public void killBoss() {
		System.out.println(this.name + "is killing boss");
	}

	@Override
	public void upgrade() {
		System.out.println(this.name + "has been up one grade");
	}

}
