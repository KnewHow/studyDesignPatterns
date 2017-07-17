package chapter08_day01.extension2;

public class BlackHumanFactory extends AbstractHumanFactory{

	@Override
	public Human createHuman() {
		
		return new BlackHuman();
	}

	
}
