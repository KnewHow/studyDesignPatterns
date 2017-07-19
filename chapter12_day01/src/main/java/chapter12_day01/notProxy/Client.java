package chapter12_day01.notProxy;

/**
 * A play game by myself
 * 
 * @author ygh Jul 19, 2017
 */
public class Client {
	public static void main(String[] args) {
		GamePlayerInterface gp = new GamePlayer("ygh");
		gp.login("ygh", "123");
		gp.killBoss();
		gp.upgrade();
	}
}
