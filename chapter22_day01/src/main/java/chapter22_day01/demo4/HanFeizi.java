package chapter22_day01.demo4;

import java.util.Observable;

public class HanFeizi extends Observable implements IHanFeiZi {

	@Override
	public void havaBreakFast() {
		System.out.println("Han Feizi is having breakfase");
		super.setChanged();
		super.notifyObservers("have breakfast");
	}

	@Override
	public void havaFun() {
		System.out.println("Han Feizi is having fun");
		super.setChanged();
		super.notifyObservers("have fun");
	}

}
