package chapter09_day01.demo1;

public class NvWa {
	public static void main(String[] args) {
		MaleHumanFactory maleHumanFactory = new MaleHumanFactory();
		
		FemaleHumanFactory femaleHumanFactory = new FemaleHumanFactory();
		
		Human h1 = maleHumanFactory.createYellowHuman();
		h1.talk();
		h1.getColor();
		h1.getSex();
		
		Human h2 = femaleHumanFactory.createYellowHuman();
		h2.talk();
		h2.getColor();
		h2.getSex();
	}
}
