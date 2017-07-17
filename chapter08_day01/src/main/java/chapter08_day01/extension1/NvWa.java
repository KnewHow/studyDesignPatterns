package chapter08_day01.extension1;

public class NvWa {
	public static void main(String[] args) {

		Human h1 = HumanFactory.createHuman(WhiteHuman.class);
		h1.talk();

		Human h2 = HumanFactory.createHuman(BlackHuman.class);
		h2.talk();

		Human h3 = HumanFactory.createHuman(YellowHuman.class);
		h3.talk();

	}
}
