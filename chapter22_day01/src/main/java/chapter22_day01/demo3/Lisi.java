package chapter22_day01.demo3;

public class Lisi implements Observer {

	@Override
	public void update(String context) {
		System.out.println("LiSi find Hang Feizi is doing something");
		this.reportQingShiHuang(context);
		System.out.println("LiSi report finish");
	}

	public void reportQingShiHuang(String reportContext) {
		System.out.println("report to QinShiHuang:,Hang Feizi is" + "doing " + reportContext);
	}

}
