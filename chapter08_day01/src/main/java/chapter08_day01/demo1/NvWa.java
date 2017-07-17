package chapter08_day01.demo1;

public class NvWa {
	public static void main(String[] args) {
		HumanFactory factory = new HumanFactory();

		Human h1 = factory.createHuman(WhiteHuman.class);
		h1.talk();

		Human h2 = factory.createHuman(BlackHuman.class);
		h2.talk();

		Human h3 = factory.createHuman(YellowHuman.class);
		h3.talk();

	}
}
