package chapter10_day01.extension;

public class Client {
	
	public static void main(String[] args) {
		HummerModel h1 = new HummerH1Model();
		h1.setAlarm(true);
		h1.run();
		
		HummerModel h2 = new HummerH2Model();
//		h2.setAlarm(false);
		h2.run();
	}
}
