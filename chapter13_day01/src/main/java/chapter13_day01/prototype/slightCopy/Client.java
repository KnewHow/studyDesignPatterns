package chapter13_day01.prototype.slightCopy;

public class Client {
	public static void main(String[] args) {
		Thing thing = new Thing();
		thing.setValue("ygh");
		Thing cloneThing=null;
		try {
			cloneThing = (Thing) thing.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		cloneThing.setValue("lisu");
		System.out.println(thing.getValue());
	}
}
