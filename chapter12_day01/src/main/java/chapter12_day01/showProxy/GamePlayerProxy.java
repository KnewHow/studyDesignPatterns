package chapter12_day01.showProxy;

public class GamePlayerProxy implements GamePlayerInterface {
	private GamePlayerInterface gp = null;

	public GamePlayerProxy(GamePlayerInterface gp) {
		super();
		this.gp = gp;
	}

	@Override
	public void login(String user, String password) {
		gp.login(user, password);
	}

	@Override
	public void killBoss() {
		gp.killBoss();
	}

	@Override
	public void upgrade() {
		gp.upgrade();
	}

}
