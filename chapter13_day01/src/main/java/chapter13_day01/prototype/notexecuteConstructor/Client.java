package chapter13_day01.prototype.notexecuteConstructor;

public class Client {
	public static void main(String[] args) {
		Thing thing = new Thing();
		try {
			thing.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
}
