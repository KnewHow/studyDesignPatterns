package chapter03_DIP_day01.threeDependWays.waytwo;

import chapter03_DIP_day01.success.example.demo1.Car;

public class MyDriver implements Driver{

	private Car car;
	@Override
	public void setCar(Car car) {
		this.car = car;
	}

	@Override
	public void drive() {
		this.car.run();
	}

}
