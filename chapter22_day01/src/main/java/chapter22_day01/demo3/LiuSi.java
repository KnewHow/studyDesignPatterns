package chapter22_day01.demo3;

public class LiuSi implements Observer {

	@Override
	public void update(String context) {
		System.out.println("LiuSi find Hang Feizi is doing something");
		this.happy(context);
		System.out.println("LiuSi report finish");
	}

	public void happy(String reportContext) {
		System.out.println("I very happy");
	}

}
