package chapter22_day01.demo3;

public class WangSi implements Observer {

	@Override
	public void update(String context) {
		System.out.println("WangSi find Hang Feizi is doing something");
		this.cry(context);
		System.out.println("WangSi report finish");
	}

	public void cry(String reportContext) {
		System.out.println("I very sad");
	}

}
