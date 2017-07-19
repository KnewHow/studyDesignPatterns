package chapter12_day01.forceProxy;

public class GamePlayer implements GamePlayerInterface {

	private String name;

	private GamePlayerProxy gpp = null;

	public GamePlayer(String name) {
		super();
		this.name = name;
	}

	public GamePlayerProxy getProxy() {
		this.gpp = new GamePlayerProxy(this);
		return this.gpp;
	}

	@Override
	public void login(String user, String password) {
		if (this.gpp == null) {
			System.out.println("proxy object don't exsit");
		} else {
			System.out.println(this.name + "is login");

		}
	}

	@Override
	public void killBoss() {
		if (this.gpp == null) {
			System.out.println("proxy object don't exsit");
		} else {
			System.out.println(this.name + "is killing boss");
		}
	}

	@Override
	public void upgrade() {
		if (this.gpp == null) {
			System.out.println("proxy object don't exsit");
		} else {
			System.out.println(this.name + "has been up one grade");
		}
	}

}
