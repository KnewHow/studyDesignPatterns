package chapter08_day01.extension2;

public class YellowHumanFactory extends AbstractHumanFactory {

	@Override
	public Human createHuman() {

		return new YellowHuman();
	}

}
