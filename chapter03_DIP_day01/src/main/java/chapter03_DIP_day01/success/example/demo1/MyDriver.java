package chapter03_DIP_day01.success.example.demo1;

public class MyDriver implements Driver {

	@Override
	public void driver(Car car) {
		car.run();
	}

}
