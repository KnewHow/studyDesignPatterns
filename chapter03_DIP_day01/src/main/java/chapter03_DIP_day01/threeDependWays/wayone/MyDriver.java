package chapter03_DIP_day01.threeDependWays.wayone;

import chapter03_DIP_day01.success.example.demo1.Car;

/**
 * Depend abstracts by constructor
 * 
 * @author ygh Jul 15, 2017
 */
public class MyDriver implements Driver {
	private Car car;

	public MyDriver(Car car) {
		super();
		this.car = car;
	}

	@Override
	public void driver() {
		this.car.run();
	}

}
