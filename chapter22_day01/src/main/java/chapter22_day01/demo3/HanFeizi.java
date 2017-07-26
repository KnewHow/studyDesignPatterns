package chapter22_day01.demo3;

import java.util.ArrayList;
import java.util.List;

public class HanFeizi implements IHanFeiZi, Observable {

	private List<Observer> observerList = new ArrayList<>();

	@Override
	public void addObserver(Observer observer) {
		this.observerList.add(observer);
	}

	@Override
	public void removeObserver(Observer observer) {
		this.observerList.remove(observer);
	}

	@Override
	public void notifyObservers(String context) {
		for (Observer observer : this.observerList) {
			observer.update(context);
		}
	}

	@Override
	public void havaBreakFast() {
		System.out.println("Han Feizi is having breakfase");
		this.notifyObservers("have breakfast");
	}

	@Override
	public void havaFun() {
		System.out.println("Han Feizi is having fun");
		this.notifyObservers("hava fun");
	}

}
