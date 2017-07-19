package chapter12_day01.ordinaryProxy;
/**
 * 
 * @author ygh
 * Jul 19, 2017
 */
public class Client {
	public static void main(String[] args) {
		GamePlayerProxy gpp = new GamePlayerProxy("ygh", "123");
		gpp.login("ygh", "123");
		gpp.killBoss();
		gpp.upgrade();
	}
}
