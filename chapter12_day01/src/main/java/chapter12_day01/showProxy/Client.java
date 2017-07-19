package chapter12_day01.showProxy;

/**
 * Play game by proxy
 * 
 * @author ygh Jul 19, 2017
 */
public class Client {
	public static void main(String[] args) {
		GamePlayerInterface gp = new GamePlayer("ygh");
		GamePlayerProxy gpp = new GamePlayerProxy(gp);
		gpp.login("ygh", "123");
		gpp.killBoss();
		gpp.upgrade();
	}
}
