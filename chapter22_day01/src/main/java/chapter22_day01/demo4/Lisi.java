package chapter22_day01.demo4;

import java.util.Observable;
import java.util.Observer;

public class Lisi implements Observer {


	public void reportQingShiHuang(String reportContext) {
		System.out.println("report to QinShiHuang:,Hang Feizi is" + "doing " + reportContext);
	}

	@Override
	public void update(Observable o, Object arg) {
		System.out.println("LiSi find Hang Feizi is doing something");
		this.reportQingShiHuang(arg.toString());
		System.out.println("LiSi report finish");
	}

}
