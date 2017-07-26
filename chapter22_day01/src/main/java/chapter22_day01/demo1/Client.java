package chapter22_day01.demo1;

public class Client {
	public static void main(String[] args) throws Exception {
		LiSi liSi = new LiSi();
		HanFeiZi feiZi = new HanFeiZi();
		
		Spy spy1 = new Spy(liSi, feiZi, "breakfast");
		Spy spy2 = new Spy(liSi, feiZi, "fun");
		spy1.start();
		spy2.start();
		Thread.sleep(1000);
		feiZi.havaBreakFast();
		Thread.sleep(1000);
		feiZi.havaFun();
		Thread.sleep(1000);
	}
}
