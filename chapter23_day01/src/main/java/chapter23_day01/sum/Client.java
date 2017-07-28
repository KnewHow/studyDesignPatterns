package chapter23_day01.sum;

import chapter23_day01.sum.subsystem.Facade;

public class Client {
	public static void main(String[] args) {
		Facade facade = new Facade();
		
		facade.method1();
		facade.method1();
	}
}
