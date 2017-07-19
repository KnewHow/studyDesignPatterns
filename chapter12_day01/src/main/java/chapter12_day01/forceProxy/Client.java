package chapter12_day01.forceProxy;

public class Client {
	public static void main(String[] args) {
		GamePlayer gp = new GamePlayer("ygh");
		GamePlayerProxy gpp = gp.getProxy();
		gpp.login("ygh", "123");
		gpp.killBoss();
		gpp.upgrade();
//		gp.login("ygh", "123");
//		gp.killBoss();
//		gp.upgrade();
	}
}
