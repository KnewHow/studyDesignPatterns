package chapter08_day01.extension2;

public class NvWa {
	public static void main(String[] args) {
		

		Human h1 = new WhiteHumanFactory().createHuman();
		h1.talk();

		Human h2 = new BlackHumanFactory().createHuman();
		h2.talk();

		Human h3 = new YellowHumanFactory().createHuman();
		h3.talk();

	}
}
