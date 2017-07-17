package chapter08_day01.extension1;

public class HumanFactory {
	public static <T extends Human> T createHuman(Class<T> c){
		T human = null;
		
		try {
			human = c.newInstance();
		} catch (InstantiationException | IllegalAccessException e) {
			System.out.println("human create exception!");
			e.printStackTrace();
		}
		return human;
	}
}
