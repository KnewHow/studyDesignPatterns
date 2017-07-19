package chapter12_day01.dynamicProxy;

/**
 * Dynamic proxy
 * 
 * @author ygh Jul 19, 2017
 */
public class Client {
	public static void main(String[] args) {
		GamePlayer gp = new GamePlayer("ygh");
		GamePlayerInvocationHandler h = new GamePlayerInvocationHandler(gp);

		ProxyFactory proxyFactory = new ProxyFactory(Client.class.getClassLoader(), gp.getClass().getInterfaces(), h);

		GamePlayerInterface gpp = (GamePlayerInterface) proxyFactory.getProxyObject();

		Before before = new Before() {

			@Override
			public void beforeMethod() {
				System.out.println("xxx company proxy start");
			}
		};

		After after = new After() {

			@Override
			public void aferMethod() {
				System.out.println("xxx company proxy finish");
			}
		};
		h.setAfter(after);
		h.setBefore(before);
		gpp.login("ygh", "123");
		gpp.killBoss();
		gpp.upgrade();
	}
}
