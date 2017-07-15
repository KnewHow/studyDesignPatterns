package chapter03_DIP_day01.success.example.demo1;

public class Demo {
	public static void main(String[] args) {
		Driver driver = new MyDriver();
		Car c1 = new Benz();
		Car c2 = new BMW();
		driver.driver(c1);
		driver.driver(c2);
	}
}
