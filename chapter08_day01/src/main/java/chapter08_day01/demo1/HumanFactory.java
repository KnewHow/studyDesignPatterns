package chapter08_day01.demo1;

public class HumanFactory extends AbstractHumanFactory {

	@Override
	public <T extends Human> T createHuman(Class<T> c) {
		T human = null;

		try {
			human = c.newInstance();
		} catch (Exception e) {
			System.out.println("create human error");
			e.printStackTrace();
		}
		return human;
	}

}
