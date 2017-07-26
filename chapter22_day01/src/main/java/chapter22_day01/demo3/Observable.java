package chapter22_day01.demo3;

public interface Observable {
	public void addObserver(Observer observe);

	public void removeObserver(Observer observe);

	public void notifyObservers(String context);

}
