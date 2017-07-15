package chapter03_DIP_day01.threeDependWays.waythree;

import chapter03_DIP_day01.success.example.demo1.Car;

public class MyDriver implements Driver {

	@Override
	public void drive(Car car) {
		car.run();
	}

}
