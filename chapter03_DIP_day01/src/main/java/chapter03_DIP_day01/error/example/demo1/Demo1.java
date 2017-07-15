package chapter03_DIP_day01.error.example.demo1;

/**
 * A test class
 * 
 * @author ygh Jul 15, 2017
 */
public class Demo1 {
	public static void main(String[] args) {
		Driver driver = new Driver();
		Benz benz = new Benz();
		driver.drive(benz);

		/**
		 * If the driver want to drive BMW car.What a terrible thing,we need to
		 * modify the <code>Driver</code> class. So,we need to create a
		 * interface
		 */
	}
}
