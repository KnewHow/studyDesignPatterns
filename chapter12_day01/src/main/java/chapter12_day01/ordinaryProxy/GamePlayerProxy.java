package chapter12_day01.ordinaryProxy;

public class GamePlayerProxy implements GamePlayerInterface {
	private GamePlayerInterface gp = null;

	public GamePlayerProxy(String name, String pass) {
		this.gp = new GamePlayer(name);
	}

	@Override
	public void login(String user, String password) {
		this.gp.login(user, password);
	}

	@Override
	public void killBoss() {
		this.gp.killBoss();
	}

	@Override
	public void upgrade() {
		this.gp.upgrade();
	}

}
